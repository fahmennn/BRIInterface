package com.nttdata.id.briinterface.service;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
// import com.nttdata.id.briinterface.utils.ExceptionUtils;

@Service
public class XmlConverterService {
  private MQService mqService;
	
	private LogErrorService logErrorService;
	
	public XmlConverterService(MQService mqService, LogErrorService logErrorService) {
    this.mqService = mqService;
    this.logErrorService = logErrorService;
  }

  // Helper formatting to cammel case
  String toCamelCase(String className) {
    if (className == null || className.isEmpty()) {
        return className;
    }
    return Character.toLowerCase(className.charAt(0)) + className.substring(1);
  }
	
	public String convertToXml(Object request, String correlationId) {
    try {
      String xmlResult = mqService.getXmlMapper().writeValueAsString(request);
      String xmlModifyDeclaration = xmlResult.replace("<?xml version='1.0' encoding='UTF-8'?>", "<?xml version=\"1.0\" standalone=\"yes\"?>");
      String xmlModifyService = "";
      Pattern pattern = Pattern.compile("<Service>\\s*TI\\s*</Service>");
      Matcher matcher = pattern.matcher(xmlModifyDeclaration);
      if (matcher.find()) {
          xmlModifyService = xmlModifyDeclaration.replace("<ServiceRequest>", "<ServiceRequest xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:m='urn:messages.service.ti.apps.tiplus2.misys.com' xmlns:c='urn:common.service.ti.apps.tiplus2.misys.com' xmlns='urn:control.services.tiplus2.misys.com'>");
        } else {
          xmlModifyService = xmlModifyDeclaration.replace("<ServiceRequest>", "<ServiceRequest xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:m='urn:messages.service.ti.apps.tiplus2.misys.com' xmlns='urn:control.services.tiplus2.misys.com'>");
        }
        String xmlModifyPrefixM = xmlModifyService.replaceAll("\\bwstxns1:", "m:");
        String xmlModifyPrefixC = xmlModifyPrefixM.replaceAll("\\bwstxns\\d+:", "c:");
        String xmlModifyPostPrefix = xmlModifyPrefixC.replaceAll("\\s+xmlns:wstxns\\w*=\"[^\"]*\"", "");
        
        return xmlModifyPostPrefix;
    } catch (Exception e) {
      // logErrorService.saveLogError(correlationId, "TI interface", ExceptionUtils.getClassNameOfException(e), "Failed to convert to XML " + ExceptionUtils.getStackTraceAsString(e));
        throw new RuntimeException("Failed to convert to XML", e);
    }
  }

  public <T> T convertToModel(String xmlResponse, String correlationId, Class<T> clazz) {
      try {
          String modifiedXml = xmlResponse.replace("<?xml version=\"1.0\" standalone=\"yes\"?>", "")
                                          .replace("<ServiceRequest xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:m='urn:messages.service.ti.apps.tiplus2.misys.com' xmlns:c='urn:common.service.ti.apps.tiplus2.misys.com' xmlns='urn:control.services.tiplus2.misys.com'>", "<ServiceRequest>")
                                          .replace("<ServiceRequest xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:m='urn:messages.service.ti.apps.tiplus2.misys.com' xmlns='urn:control.services.tiplus2.misys.com'>", "<ServiceRequest>")
                                          .replace("m:", "")
                                          .replace("c:", "");
          return mqService.getXmlMapper().readValue(modifiedXml, clazz);
      } catch (Exception e) {
        // logErrorService.saveLogError(correlationId, "TI interface", ExceptionUtils.getClassNameOfException(e), "Failed to convert to XML " + ExceptionUtils.getStackTraceAsString(e));
          throw new RuntimeException("Failed to convert XML to model", e);
      }
  }


  // Konversi object ke xml
  public String convertToXmlNew(Object request, String correlationId, String nameRequestBody) {
    try {
      String xmlResult = mqService.getXmlMapper().writeValueAsString(request);
      String xmlModifyNameRequestBody = xmlResult.replace("RequestBody", nameRequestBody);
      String xmlModifyDeclaration = xmlModifyNameRequestBody.replace("<?xml version='1.0' encoding='UTF-8'?>", "<?xml version=\"1.0\" standalone=\"yes\"?>");
      String xmlModifyService = "";
      Pattern pattern = Pattern.compile("<Service>\\s*TI\\s*</Service>");
      Matcher matcher = pattern.matcher(xmlModifyDeclaration);
      if (matcher.find()) {
        xmlModifyService = xmlModifyDeclaration.replace("<ServiceRequest>", "<ServiceRequest xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:m='urn:messages.service.ti.apps.tiplus2.misys.com' xmlns:c='urn:common.service.ti.apps.tiplus2.misys.com' xmlns='urn:control.services.tiplus2.misys.com'>");
      } else {
        xmlModifyService = xmlModifyDeclaration.replace("<ServiceRequest>", "<ServiceRequest xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:m='urn:messages.service.ti.apps.tiplus2.misys.com' xmlns='urn:control.services.tiplus2.misys.com'>");
      }
      String xmlModifyPrefixM = xmlModifyService.replaceAll("\\bwstxns1:", "m:");
      String xmlModifyPrefixC = xmlModifyPrefixM.replaceAll("\\bwstxns\\d+:", "c:");
      String xmlModifyPostPrefix = xmlModifyPrefixC.replaceAll("\\s+xmlns:wstxns\\w*=\"[^\"]*\"", "");
      
      return xmlModifyPostPrefix;
    } catch (Exception e) {
      // logErrorService.saveLogError(correlationId, "TI interface", ExceptionUtils.getClassNameOfException(e), "Failed to convert to XML " + ExceptionUtils.getStackTraceAsString(e));
        throw new RuntimeException("Failed to convert to XML", e);
    }
  }

  // Penggabungan 2 model menjadi model object baru
  public <T1, T2> Map<String, Object> convertToModel2(String xmlResponse, String correlationId, Class<T1> headerClass, Class<T2> bodyClass) {
    try {
      JsonNode rootNode = mqService.getXmlMapper().readTree(xmlResponse);
      JsonNode getHeader = rootNode.get(headerClass.getSimpleName());
      JsonNode getBody = rootNode.get(bodyClass.getSimpleName());

      T1 headerRequest = mqService.getXmlMapper().readValue(mqService.getXmlMapper().writeValueAsString(getHeader), headerClass);
      T2 bodyRequest = mqService.getXmlMapper().readValue(mqService.getXmlMapper().writeValueAsString(getBody), bodyClass);

      Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.put(toCamelCase(headerClass.getSimpleName()), headerRequest);
        resultMap.put(toCamelCase(bodyClass.getSimpleName()), bodyRequest);

      return resultMap;
    } catch (Exception e) {
      // logErrorService.saveLogError(correlationId, "TI interface", ExceptionUtils.getClassNameOfException(e), "Failed to convert to XML " + ExceptionUtils.getStackTraceAsString(e));
        throw new RuntimeException("Failed to convert XML to model", e);
    }
  }

  // Konversi dari xml ke model specific (1 model)
  public <T> T convertToModelSpecificClass(String xmlResponse, String correlationId, Class<T> clazz, String nameRequestBody) {
    try {
      JsonNode rootNode = mqService.getXmlMapper().readTree(xmlResponse);
      JsonNode getSpecificClass = rootNode.get(nameRequestBody);
      return mqService.getXmlMapper().readValue(mqService.getXmlMapper().writeValueAsString(getSpecificClass), clazz);
    } catch (Exception e) {
      // logErrorService.saveLogError(correlationId, "TI interface", ExceptionUtils.getClassNameOfException(e), "Failed to convert to XML " + ExceptionUtils.getStackTraceAsString(e));
        throw new RuntimeException("Failed to convert XML to model", e);
    }
  }
}

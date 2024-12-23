package com.nttdata.id.briinterface.repository.db2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.nttdata.id.briinterface.dtos.MasterResponseDTO;

@Repository
public class MasterRepositoryCustomImpl implements MasterRepositoryCustom {
  @PersistenceContext(unitName = "db2PU")
  private EntityManager em;

  @SuppressWarnings("unchecked")
  @Override
  public List<MasterResponseDTO> filterDataMaster(String status, String orig_ref, String inputBrn, String bhalfBrn,
        String expiryDat, Double amount, String ccy, String ctrctDate,
        String relMstrRef, Long prodtype, Long primaryCus, String masterRef, String pricustsbb, String pricustmnm,
        String preRef, String canPrnRef, String nprRef, String cannPrnRef, String nprCustSbb, String nprCustMnm,
        String nprNameL1, String pcpSwBic, String npcSwBic, String startCtrcDate, String endCtrcDate, Integer page, Integer size, String sortBy, String sortType) {
    
    String rangeDate = "";
    LocalDate currentDate = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    System.out.println("Start Date: " + startCtrcDate);
    System.out.println("End Date: " + endCtrcDate);
    
    // Check if sortBy is empty, set default value
    if (sortBy == null || sortBy.isEmpty()) {
      sortBy = "KEY97";
    }

    // Check if sortType is empty, set default value
    if (sortType == null || sortType.isEmpty()) {
      sortType = "ASC";
    }

    // Condition for start date is empty and end date is not empty
    if ((startCtrcDate == null || startCtrcDate.isEmpty()) && (endCtrcDate != null && !endCtrcDate.isEmpty())) {
      rangeDate = "AND m.CTRCT_DATE <= ':endCtrcDate'";
    }

    // Condition for start date is not empty and end date is empty
    if ((startCtrcDate != null && !startCtrcDate.isEmpty()) && (endCtrcDate == null || endCtrcDate.isEmpty())) {
      rangeDate = "AND m.CTRCT_DATE BETWEEN ':startCtrcDate' AND ':nowTime'";
    }

    // Condition for start date and end date is empty
    if ((startCtrcDate == null || startCtrcDate.isEmpty()) && (endCtrcDate == null || endCtrcDate.isEmpty())) {
      rangeDate = "";
    }

    // Condition for start date and end date is not empty
    if ((startCtrcDate != null && !startCtrcDate.isEmpty()) && endCtrcDate != null && !endCtrcDate.isEmpty()) {
      rangeDate = "AND m.CTRCT_DATE BETWEEN ':startCtrcDate' AND ':endCtrcDate'";
    }

    StringBuilder sql = new StringBuilder(
      "SELECT m.*, p.DESCRIP  FROM (SELECT * FROM (SELECT * FROM (SELECT " +
      " m.KEY97 AS KEY97, m.REFNO_MBE AS REFNO_MBE, m.REFNO_PFIX AS REFNO_PFIX, m.REFNO_BRN AS REFNO_BRN, \r\n" +
      " m.REFNO_SERL AS REFNO_SERL, m.PRINAME_L1 AS PRINAME_L1, m.EXEMPLAR AS EXEMPLAR, m.STATUS AS STATUS, \r\n" +
      " m.PRDCLASS AS PRDCLASS, m.UTILIS_AMT AS UTILIS_AMT, m.UTILIS_CCY AS UTILIS_CCY, m.ORIG_REF AS ORIG_REF, \r\n" +
      " m.PARENT_EV AS PARENT_EV, m.INPUT_BRN AS INPUT_BRN, m.BHALF_BRN AS BHALF_BRN, m.EXPIRY_DAT AS EXPIRY_DAT, \r\n" +
      " m.EXPIRY_LOC AS EXPIRY_LOC, m.AMOUNT AS AMOUNT, m.CCY AS CCY, m.AMT_O_S AS AMT_O_S, m.DFLT_WKGRP AS DFLT_WKGRP, \r\n" +
      " m.PCP_PTY AS PCP_PTY, m.NPCP_PTY AS NPCP_PTY, m.CHARGE_FOR AS CHARGE_FOR, m.USERCODE1 AS USERCODE1, \r\n" +
      " m.USERCODE2 AS USERCODE2, m.USERCODE3 AS USERCODE3, m.RESP_USER AS RESP_USER, m.CTRCT_DATE AS CTRCT_DATE, \r\n" +
      " m.WORKGROUP AS WORKGROUP, m.LIAB_AMT AS LIAB_AMT, m.LIAB_CCY AS LIAB_CCY, m.TFR_MTHD AS TFR_MTHD, \r\n" +
      " m.SHAREDLIAB AS SHAREDLIAB, m.MAILTOBRN AS MAILTOBRN, m.RELMSTRKEY AS RELMSTRKEY, m.RELMSTRREF AS RELMSTRREF, \r\n" +
      " m.PRODTYPE AS PRODTYPE, m.PRIMARYCUS AS PRIMARYCUS, m.USEROPTN1 AS USEROPTN1, m.USEROPTN2 AS USEROPTN2, \r\n" +
      " m.USEROPTN3 AS USEROPTN3, m.USEROPTN4 AS USEROPTN4, m.USEROPTN5 AS USEROPTN5, m.TOTLIABAMT AS TOTLIABAMT, \r\n" +
      " m.TOTLIABCCY AS TOTLIABCCY, m.REIMB_CHGS AS REIMB_CHGS, m.BILLLEVEL AS BILLLEVEL, m.BOOKOFFDAT AS BOOKOFFDAT, \r\n" +
      " m.ECFLNK_KEY AS ECFLNK_KEY, m.ECFLNK_REF AS ECFLNK_REF, m.DEACT_DATE AS DEACT_DATE, m.DATATAKEON AS DATATAKEON, \r\n" +
      " m.ACTIVE AS ACTIVE, m.PREV_STS AS PREV_STS, m.MASTER_REF AS MASTER_REF, m.REF_LOCK AS REF_LOCK, \r\n" +
      " m.PRICUSTSBB AS PRICUSTSBB, m.PRICUSTMNM AS PRICUSTMNM, m.VERLEVEL AS VERLEVEL, m.CANOURREF AS CANOURREF, \r\n" +
      " m.EV_COUNT AS EV_COUNT, m.EXTFIELD AS EXTFIELD, m.NO_BROWSE AS NO_BROWSE, m.PRI_REF AS PRI_REF, \r\n" +
      " m.CANPRNREF AS CANPRNREF, m.NPR_REF AS NPR_REF, m.CANNPRNREF AS CANNPRNREF, m.TAKEON AS TAKEON, \r\n" +
      " m.TAKE_AMDNO AS TAKE_AMDNO, m.TAKE_DATE AS TAKE_DATE, m.TAKE_PAYNO AS TAKE_PAYNO, m.ORIGNAME AS ORIGNAME, \r\n" +
      " m.ORIGTEAM AS ORIGTEAM, m.ORIGISUSER AS ORIGISUSER, m.ORIGBRANCH AS ORIGBRANCH, m.ORIGUSER AS ORIGUSER, \r\n" +
      " m.ORIGREF AS ORIGREF, m.EBANKMSREF AS EBANKMSREF, m.NPRCUSTSBB AS NPRCUSTSBB, m.NPRCUSTMNM AS NPRCUSTMNM, \r\n" +
      " m.NPRNAME_L1 AS NPRNAME_L1, m.PCP_SW_BIC AS PCP_SW_BIC, m.NPC_SW_BIC AS NPC_SW_BIC, \r\n" +
      "ROW_NUMBER() OVER (ORDER BY m.:sortBy :sortType) AS RowNum \r\n" +
      "FROM MASTER m " +
      "WHERE 1=1 " + rangeDate
    );

    // Kondisi untuk filter
    if (status != null && !status.isEmpty()) {
      sql.append(" AND m.STATUS = :status ");
    }

    if (orig_ref != null && !orig_ref.isEmpty()) {
      sql.append(" AND m.ORIG_REF = :orig_ref ");
    }

    if (inputBrn != null && !inputBrn.isEmpty()) {
      sql.append(" AND m.INPUT_BRN = :inputBrn ");
    }

    if (bhalfBrn != null && !bhalfBrn.isEmpty()) {
      sql.append(" AND m.BHALF_BRN = :bhalfBrn ");
    }

    if (expiryDat != null && !expiryDat.isEmpty()) {
      sql.append(" AND m.EXPIRY_DAT = :expiryDat ");
    }

    if (amount != null) {
      sql.append(" AND m.AMOUNT = :amount ");
    }

    if (ccy != null && !ccy.isEmpty()) {
      sql.append(" AND m.CCY = :ccy ");
    }

    if (ctrctDate != null && !ctrctDate.isEmpty()) {
      sql.append(" AND m.CTRCT_DATE = :ctrctDate ");
    }

    if (relMstrRef != null && !relMstrRef.isEmpty()) {
      sql.append(" AND m.RELMSTRREF = :relMstrRef ");
    }

    if (prodtype != null) {
      sql.append(" AND m.PRODTYPE = :prodtype ");
    }

    if (primaryCus != null) {
      sql.append(" AND m.PRIMARYCUS = :primaryCus ");
    }

    if (masterRef != null && !masterRef.isEmpty()) {
      sql.append(" AND m.MASTER_REF = :masterRef ");
    }

    if (pricustsbb != null && !pricustsbb.isEmpty()) {
      sql.append(" AND m.PRICUSTSBB = :pricustsbb ");
    }

    if (pricustmnm != null && !pricustmnm.isEmpty()) {
      sql.append(" AND m.PRICUSTMNM = :pricustmnm ");
    }

    if (preRef != null && !preRef.isEmpty()) {
      sql.append(" AND m.PRI_REF = :preRef ");
    }

    if (canPrnRef != null && !canPrnRef.isEmpty()) {
      sql.append(" AND m.CANPRNREF = :canPrnRef ");
    }

    if (nprRef != null && !nprRef.isEmpty()) {
      sql.append(" AND m.NPR_REF = :nprRef ");
    }

    if (cannPrnRef != null && !cannPrnRef.isEmpty()) {
      sql.append(" AND m.CANNPRNREF = :cannPrnRef ");
    }

    if (nprCustSbb != null && !nprCustSbb.isEmpty()) {
      sql.append(" AND m.NPRCUSTSBB = :nprCustSbb ");
    }

    if (nprCustMnm != null && !nprCustMnm.isEmpty()) {
      sql.append(" AND m.NPRCUSTMNM = :nprCustMnm ");
    }

    if (nprNameL1 != null && !nprNameL1.isEmpty()) {
      sql.append(" AND m.NPRNAME_L1 = :nprNameL1 ");
    }

    if (pcpSwBic != null && !pcpSwBic.isEmpty()) {
      sql.append(" AND m.PCP_SW_BIC = :pcpSwBic ");
    }

    if (npcSwBic != null && !npcSwBic.isEmpty()) {
      sql.append(" AND m.NPC_SW_BIC = :npcSwBic ");
    }

    sql.append(") AS m WHERE RowNum BETWEEN ( :page - 1) * :size + 1 AND :page * :size ) AS m ) AS m INNER JOIN PRODTYPE p ON m.PRODTYPE = p.KEY97 \r\n" + //
            "INNER JOIN PARTYDTLS p2 ON m.PCP_PTY = p2.KEY97 \r\n" + //
            "INNER JOIN PARTYDTLS p3 ON m.NPCP_PTY = p3.KEY97");
    Query query = em.createNativeQuery(sql.toString(), "MasterResponseMappingDTO");

    if (status != null && !status.isEmpty()) query.setParameter("status", status);
    if (orig_ref != null && !orig_ref.isEmpty()) query.setParameter("orig_ref", orig_ref);
    if (inputBrn != null && !inputBrn.isEmpty()) query.setParameter("inputBrn", inputBrn);
    if (bhalfBrn != null && !bhalfBrn.isEmpty()) query.setParameter("bhalfBrn", bhalfBrn);
    if (expiryDat != null && !expiryDat.isEmpty()) query.setParameter("expiryDat", expiryDat);
    if (amount != null) query.setParameter("amount", amount);
    if (ccy != null && !ccy.isEmpty()) query.setParameter("ccy", ccy);
    if (ctrctDate != null && !ctrctDate.isEmpty()) query.setParameter("ctrctDate", ctrctDate);
    if (relMstrRef != null && !relMstrRef.isEmpty()) query.setParameter("relMstrRef", relMstrRef);
    if (prodtype != null) query.setParameter("prodtype", prodtype);
    if (primaryCus != null) query.setParameter("primaryCus", primaryCus);
    if (masterRef != null && !masterRef.isEmpty()) query.setParameter("masterRef", masterRef);
    if (pricustsbb != null && !pricustsbb.isEmpty()) query.setParameter("pricustsbb", pricustsbb);
    if (pricustmnm != null && !pricustmnm.isEmpty()) query.setParameter("pricustmnm", pricustmnm);
    if (preRef != null && !preRef.isEmpty()) query.setParameter("preRef", preRef);
    if (canPrnRef != null && !canPrnRef.isEmpty()) query.setParameter("canPrnRef", canPrnRef);
    if (nprRef != null && !nprRef.isEmpty()) query.setParameter("nprRef", nprRef);
    if (cannPrnRef != null && !cannPrnRef.isEmpty()) query.setParameter("cannPrnRef", cannPrnRef);
    if (nprCustSbb != null && !nprCustSbb.isEmpty()) query.setParameter("nprCustSbb", nprCustSbb);
    if (nprCustMnm != null && !nprCustMnm.isEmpty()) query.setParameter("nprCustMnm", nprCustMnm);
    if (nprNameL1 != null && !nprNameL1.isEmpty()) query.setParameter("nprNameL1", nprNameL1);
    if (pcpSwBic != null && !pcpSwBic.isEmpty()) query.setParameter("pcpSwBic", pcpSwBic);
    if (npcSwBic != null && !npcSwBic.isEmpty()) query.setParameter("npcSwBic", npcSwBic);
    if (startCtrcDate != null && !startCtrcDate.isEmpty()) query.setParameter("startCtrcDate", startCtrcDate);
    if (endCtrcDate != null && !endCtrcDate.isEmpty()) query.setParameter("endCtrcDate", endCtrcDate);
    if (currentDate.format(formatter) != null && !currentDate.format(formatter).isEmpty()) query.setParameter("nowTime", currentDate.format(formatter));

    query.setParameter("page", page);
    query.setParameter("size", size);
    query.setParameter("sortBy", sortBy);
    query.setParameter("size", sortType);

    List<MasterResponseDTO> result = query.getResultList();
        
    // Log the result
    System.out.println("Query Result: " + result);

    return query.getResultList();
  }
  
}

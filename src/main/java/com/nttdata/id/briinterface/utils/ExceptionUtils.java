package com.nttdata.id.briinterface.utils;

import java.io.StringWriter;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExceptionUtils {
  @Value("${spring.application.name}")
  private static String applicationName;

  public static String getApplicationName() {
      return applicationName;
  }

  public static String getStackTraceAsString(Exception e) {
      StringWriter sw = new StringWriter();
      PrintWriter pw = new PrintWriter(sw);
      return sw.toString();
  }
  public static String getClassNameOfException(Exception e) {
      StackTraceElement[] stackTrace = e.getStackTrace();
      if (stackTrace.length > 0) {
          // Get the first stack trace element
          StackTraceElement element = stackTrace[0];
          // Return the class name where the exception occurred
          return element.getClassName();
      }
      return "Unknown class";
  }
}

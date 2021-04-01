package com.elsevier.demo;
import static java.lang.System.out;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DemoLogHandler
  implements RequestHandler<Object, String> {
  protected static Logger log = LoggerFactory.getLogger(DemoLogHandler.class);
  
  public DemoLogHandler() {
    log.info("New instance of DemoLogHandler");
  }
  @Override
  public String handleRequest(Object event, Context context) {

    return "success";
  }
  
  public static void main(String[] args) {
    DemoLogHandler d = new DemoLogHandler();
    out.println("Hello World!");
  }
}

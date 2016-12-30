package com.sap.aish.controllers;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

	private static final Logger log=Logger.getLogger(DemoController.class);
	
	@Value("${words}")
	String words; 
	
	
	
	@RequestMapping("/")
	  public @ResponseBody String getWord() {
	    log.warn(new String("###############               Word in Client1 :"+words));
	    String[] wordArray = words.split(",");
	    int i = (int)Math.round(Math.random() * (wordArray.length - 1));
	    return wordArray[i];
	  }
	
}

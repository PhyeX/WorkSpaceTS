package com.example.demo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

 

@Controller
public class HelloForm {
	
	
    private static Logger logger = LogManager.getLogger(HelloForm.class);
    
    @GetMapping( { "/index","index/?name={name}&surname={surname}" } )
	public String getForm( @RequestParam(required=false)  String name ,@RequestParam(required=false) String surname ) {
		
		 if( name != null && !name.equals("") )
			 System.out.println(name);
		 if( surname != null && !surname.equals("") )
			 System.out.println(surname);
		
		return "index";
	}

 
    
	
 

}

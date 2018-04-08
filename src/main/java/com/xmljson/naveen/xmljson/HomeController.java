package com.xmljson.naveen.xmljson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping(value="/student",produces = {"application/xml", "application/json","text/plain; charset=utf-8"}) 
	public @ResponseBody Student getStudent()
	{
		Student s=new Student("Naveen","Kumar");
		return s;
		
	}
	

}

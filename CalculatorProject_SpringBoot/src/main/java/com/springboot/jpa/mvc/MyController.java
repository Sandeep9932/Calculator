package com.springboot.jpa.mvc;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MyController {
	
	//add both digits from path
	   @RequestMapping("add{num1}and{num2}")
 public int add(@PathVariable int num1, @PathVariable int num2)
 {
	   return num1+num2;
 }
	   
	   //sub one from path one from body
	   @RequestMapping("sub{num1}and{num2}")
	   public int sub(@PathVariable int num1,@PathVariable int num2)
	   {
		   return num1-num2;
	   }
	   
	   //mult both digits in body array
	   @RequestMapping("mult{num1}and{num2}")
	   public int mult(@PathVariable int num1,@PathVariable int num2)
	   {
		  
		  return num1*num2;
	   }
	   
	   //div any way
	   @RequestMapping("div{num1}and{num2}")
	   public int div(@PathVariable int num1, @PathVariable int num2)
	   {
		   return num1/num2;
	   }

	   @RequestMapping("mod{num1}and{num2}")
	   public int mod(@PathVariable int num1, @PathVariable int num2)
	   {
		   return num1%num2;
	   }

}

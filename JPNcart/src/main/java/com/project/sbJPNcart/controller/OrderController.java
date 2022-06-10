package com.project.sbJPNcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrderController 
{	
	@RequestMapping(value = "/order", method = RequestMethod.GET)
	   public String order() 
           {
	      return "order";
	   }


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	   public String index() 
        {
	      return "index";
	   }
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	   public String about() 
        {
	      return "about";
	   }
}
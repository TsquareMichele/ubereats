package net.kzn.ubereats.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Annotation bascially states that the class is a controller 

@Controller
public class PageController {
	
	@RequestMapping (value= {"/", "/home", "/index"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
			mv.addObject("greeting","Welcome To UberEats Web Application");	
				return mv;
	}
	
}

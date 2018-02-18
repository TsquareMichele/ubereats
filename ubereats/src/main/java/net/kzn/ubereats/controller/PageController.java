package net.kzn.ubereats.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.ubereatsbackend.dao.CategoryDAO;
import net.kzn.ubereatsbackend.dto.Category;

//Annotation bascially states that the class is a controller 

@Controller
public class PageController {
	
	
	//Use dependecy injection feature Autowire the class which implements DAO intreface
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	
	
	@RequestMapping (value= {"/", "/home", "/index"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","Home");
			
			//paasing the list of categories
			mv.addObject("categories",categoryDAO.list());
			
			mv.addObject("userClickHome",true);
			
				return mv;
	}
	
	
	@RequestMapping (value= "/about")
	public ModelAndView about() {
		
		ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","About Us");
			mv.addObject("userClickAbout",true);
			
				return mv;
	}
	
	
	@RequestMapping (value= "/contact")
	public ModelAndView contact() {
		
		ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","Contact Us");
			mv.addObject("userClickContact",true);
			
				return mv;
	}
	
	//Methods to load all the restaurants and based on category
	
	@RequestMapping (value= "/show/all/restaurants")
	public ModelAndView showAllRestaurants() {
		
		ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","All Restaurants");
			
			//paasing the list of categories
			mv.addObject("categories",categoryDAO.list());
			
			mv.addObject("userClickAllRestaurants",true);
			
				return mv;
	}
	
	
	@RequestMapping (value= "/show/category/{id}/restaurants")
	public ModelAndView showCategoryRestaurants(@PathVariable("id") int id) {
		
		ModelAndView mv = new ModelAndView("page");
		
		//CategoryDAO to fetch a single category
		
		Category category= null;
		category = categoryDAO.get(id);
		
			mv.addObject("title",category.getName());
			
			//passing the list of categories
			mv.addObject("categories",categoryDAO.list());
			
			//passing the single category object
			mv.addObject("category",category);
			
			mv.addObject("userClickCategoryRestaurants",true);
			
				return mv;
	}
	
	
	
}

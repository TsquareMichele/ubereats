package net.kzn.ubereats.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.kzn.ubereatsbackend.dao.ProductDAO;
import net.kzn.ubereatsbackend.dto.Product;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {
	
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping("/all/products")
	//this annotation automatically look for converter that is added in the class part of backend project
	@ResponseBody
	public List<Product> getAllProducts(){
		
		return productDAO.listActiveProducts();
		
	}
	
	
	@RequestMapping("/category/{id}/products")
	//this annotation automatically look for converter that is added in the class part of backend project
	@ResponseBody
	public List<Product> getAllProductsByCategory(@PathVariable int id){
		
		return productDAO.listActiveProductsByCategory(id);
		
	}
 
}

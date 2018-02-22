package net.kzn.ubereatsbackend.dao;

import java.util.List;

import net.kzn.ubereatsbackend.dto.Category;

public interface CategoryDAO {

	
	
	
	
	//Add a new DAO method to fetch a single category based on its id
	
		Category get(int id);
	
	List<Category> list();
	//function for adding a category
	boolean add(Category category);
	
	//function for updating a category
	boolean update(Category category);
	//Function for deleting a category
	boolean delete(Category category);
	
	
}

package net.kzn.ubereatsbackend.dao;

import java.util.List;

import net.kzn.ubereatsbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	
	//Add a new DAO method to fetch a single category based on its id
	
	Category get(int id);
}

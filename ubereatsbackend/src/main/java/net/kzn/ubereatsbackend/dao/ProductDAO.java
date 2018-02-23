package net.kzn.ubereatsbackend.dao;

import java.util.List;

import net.kzn.ubereatsbackend.dto.Product;


public interface ProductDAO{
	
	Product get(int productId);
	List<Product> list();
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	//Methods
	
	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int categoryId);
	List<Product> getLatestActiveProducts(int count);
	
	
	
	
	
	
}
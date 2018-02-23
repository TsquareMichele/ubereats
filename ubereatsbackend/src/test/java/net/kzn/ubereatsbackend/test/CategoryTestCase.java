package net.kzn.ubereatsbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.ubereatsbackend.dao.CategoryDAO;
import net.kzn.ubereatsbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.ubereatsbackend");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");

	}

	/*@Test
	public void testAddCategory() {
		category = new Category();
		category.setName("Italian");
		category.setDescription("retaurants");
		category.setImageURL("CAT_1.png");

		assertEquals("Something went wrong when adding a category!", true, categoryDAO.add(category));

	}
	*/
	
	/*@Test
	public void testGetCategory() {
		
		
		category = categoryDAO.get(1);
		assertEquals("Successfully fetched  a single category from the table!", "Italian", category.getName());
	}
	*/
	
	
	/*@Test
	public void testUpdateCategory() {
		
		
		category = categoryDAO.get(1);
		
		category.setName("Italy");
		assertEquals("Successfully updated  a single category in the table!", true, categoryDAO.update(category));
	}
	*/
	
	/*@Test
	public void testDeleteCategory() {
		
		
		category = categoryDAO.get(1);
		
		
		assertEquals("Successfully deleted a single category in the table!", true, categoryDAO.delete(category));
	}
	
	*/
	
	/*@Test
	public void testListCategory() {
		
		assertEquals("Successfully fetched a list of categories from the table!", 2 , categoryDAO.list().size());
		
	}
	*/
	
	@Test
	public void testCRUDCategory() {
		//add operation for category
		category = new Category();
		category.setName("Italian");
		category.setDescription("Description of the Italian restaurant");
		category.setImageURL("CAT_1.png");

		assertEquals("Something went wrong when adding a category!", true, categoryDAO.add(category));
		
		
		category = new Category();
		category.setName("Franchise");
		category.setDescription("Description of a franchise");
		category.setImageURL("CAT_2.png");

		assertEquals("Something went wrong when adding a category into the table!", true, categoryDAO.add(category));
		
		//fetching and updating the category
		
category = categoryDAO.get(2);
		
		category.setName("Italy");
		assertEquals("Something went wrong when updating  a single category in the table!", true, categoryDAO.update(category));
	
		//delete a category
		
	category = categoryDAO.get(1);
		
		
		assertEquals("Something went wrong when deleting a single category in the table!", true, categoryDAO.delete(category));
	
		
		//fetching the list
		
		assertEquals("Something went wrong when fetching a list of categories from the table!", 1 , categoryDAO.list().size());
		
		
		
	}
	
}

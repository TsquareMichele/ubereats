package net.kzn.ubereatsbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.ubereatsbackend.dao.ProductDAO;
import net.kzn.ubereatsbackend.dto.Product;

public class ProductTestCase {

	private static AnnotationConfigApplicationContext context;

	private static ProductDAO productDAO;

	private Product product;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.ubereatsbackend");
		context.refresh();

		productDAO = (ProductDAO)context.getBean("productDAO");

	}

	/*@Test
	public void testAddProduct() {
		product = new Product();
		product.setName("Italian");
		product.setDescription("retaurants");
		product.setImageURL("CAT_1.png");

		assertEquals("Successfully added a product into the table!", true, productDAO.add(product));

	}
	*/
	
	/*@Test
	public void testGetProduct() {
		
		
		product = productDAO.get(1);
		assertEquals("Successfully fetched  a single product from the table!", "Italian", product.getName());
	}
	*/
	
	
	/*@Test
	public void testUpdateProduct() {
		
		
		product = productDAO.get(1);
		
		product.setName("Italy");
		assertEquals("Successfully updated  a single product in the table!", true, productDAO.update(product));
	}
	*/
	
	/*@Test
	public void testDeleteProduct() {
		
		
		product = productDAO.get(1);
		
		
		assertEquals("Successfully deleted a single product in the table!", true, productDAO.delete(product));
	}
	
	*/
	
	/*@Test
	public void testListProduct() {
		
		assertEquals("Successfully fetched a list of categories from the table!", 2 , productDAO.list().size());
		
	}
	*/
	
	/*@Test
	public void testCRUDProduct() {
		//add operation for product
		product = new Product();
		product.setName("Large Chicken and mushroom pizza");
		product.setRestaurant("Pizza Hut");
		product.setDescription("Description of the pizza hut restaurant");
		product.setUnitPrice(120);
		product.setActive(true);
		product.setCategoryId(2);
		product.setRestaurantId(4);
		 

		assertEquals("Something went wrong when adding a product!", true, productDAO.add(product));

		
		//fetching/reading and updating the product
		
product = productDAO.get(2);
		
		product.setName("Spur Chicken Salad");
		assertEquals("Something went wrong when updated  a single product in the table!", true, productDAO.update(product));
	
		//delete a product
		
	product = productDAO.get(1);
		
		
		assertEquals("Something went wrong when deleting a single product in the table!", true, productDAO.delete(product));
	
		
		//fetching the list
		
		assertEquals("Something went wrong when fetching a list of products from the table!", 7 , productDAO.list().size());
		
		
		
	}
	*/
	
	
	//List Of ACTIVE PRODUCTS
	@Test
	public void testListActiveProducts() {
		
		assertEquals("Something went wrong when fetching a list of products from the table!", 6 , productDAO.listActiveProducts().size());
	
	}
	
	//List Active Products By Category
	@Test
	public void testListActiveProductsByCategory() {
		
		assertEquals("Something went wrong when fetching a list of products from the table!", 3 , productDAO.listActiveProductsByCategory(3).size());
		
		assertEquals("Something went wrong when fetching a list of products from the table!", 2 , productDAO.listActiveProductsByCategory(1).size());
		
	}
	
	//List Active Products By Category
		@Test
		public void testGetLatestActiveProduct() {
			
			assertEquals("Something went wrong when fetching a list of products from the table!", 3 , productDAO.getLatestActiveProducts(3).size());
			
		
			
		}
	
}

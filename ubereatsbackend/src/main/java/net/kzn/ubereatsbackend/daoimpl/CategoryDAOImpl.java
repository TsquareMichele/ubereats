package net.kzn.ubereatsbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.ubereatsbackend.dao.CategoryDAO;
import net.kzn.ubereatsbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories= new ArrayList<>();

	static {
		
		//adding first category
		Category category = new Category();
		
		category.setId(1);
		category.setName("Italian");
		category.setDescription("This is food from the retaurants");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		//adding second category
		
		 category = new Category();
			
			category.setId(2);
			category.setName("Franchises");
			category.setDescription("This is food from the streets");
			category.setImageURL("CAT_2.png");
			
			categories.add(category);
			
			
			
			//adding third category
			
			 category = new Category();
				
				category.setId(3);
				category.setName("Desserts");
				category.setDescription("This is food from the fancy place");
				category.setImageURL("CAT_3.png");
				
				categories.add(category);
				
				
				//adding fourth category
				
				 category = new Category();
					
					category.setId(4);
					category.setName("Mediterranean");
					category.setDescription("This is food from the sea");
					category.setImageURL("CAT_4.png");
					
					categories.add(category);
					
					

					//adding fifth category
					
					 category = new Category();
						
						category.setId(5);
						category.setName("African");
						category.setDescription("This is food for the morning");
						category.setImageURL("CAT_5.png");
						
						categories.add(category);
						
						//adding sixth category
						
						 category = new Category();
							
							category.setId(6);
							category.setName("Salads");
							category.setDescription("This is food from plants");
							category.setImageURL("CAT_6.png");
							
							categories.add(category);
							
							//adding sixth category
							
							 category = new Category();
								
								category.setId(7);
								category.setName("Cafe");
								category.setDescription("This is food from small stores");
								category.setImageURL("CAT_7.png");
								
								categories.add(category);
		
		 
	}
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories; 
	}


	@Override
	public Category get(int id) {
		// enhanced for loop
		for(Category category: categories) {
			
			if(category.getId()== id) 
				return category;
		}
		return null;
	}

}

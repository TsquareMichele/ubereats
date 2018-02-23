package net.kzn.ubereatsbackend.dto;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Product {


	/**Private Fields**/
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) //This increments the id number
	private int id;
	private String code;
	private String name;
	private String restaurant;
	private String description;
	@Column(name="unit_price")
	private double unitPrice;
	private int quantity;
	//makes sure it the names correspond to the database
			@Column(name="is_active")
			//annotation is used so that description is not displayed in json
			@JsonIgnore
		private boolean active= true;
			//makes sure it the names correspond to the database
			@Column(name="category_id")
			@JsonIgnore
		private int categoryId;
			@Column(name="restaurant_id")
			@JsonIgnore
			private int restaurantId;
			private int purchases;
			private int views;
			
			//default constructor
			//create a unique code 
			public Product() {
				
				this.code = UUID.randomUUID().toString().substring(26).toUpperCase();
			}
			
			//Getters and Setters
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getCode() {
				return code;
			}
			public void setCode(String code) {
				this.code = code;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getRestaurant() {
				return restaurant;
			}
			public void setRestaurant(String restaurant) {
				this.restaurant = restaurant;
			}
			public String getDescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			public double getUnitPrice() {
				return unitPrice;
			}
			public void setUnitPrice(double unitPrice) {
				this.unitPrice = unitPrice;
			}
			public int getQuantity() {
				return quantity;
			}
			public void setQuantity(int quantity) {
				this.quantity = quantity;
			}
			public boolean isActive() {
				return active;
			}
			public void setActive(boolean active) {
				this.active = active;
			}
			public int getCategoryId() {
				return categoryId;
			}
			public void setCategoryId(int categoryId) {
				this.categoryId = categoryId;
			}
			public int getRestaurantId() {
				return restaurantId;
			}
			public void setRestaurantId(int restaurantId) {
				this.restaurantId = restaurantId;
			}
			public int getPurchases() {
				return purchases;
			}
			public void setPurchases(int purchases) {
				this.purchases = purchases;
			}
			public int getViews() {
				return views;
			}
			public void setViews(int views) {
				this.views = views;
			}
	
		
	
	
	
	
	
	
}

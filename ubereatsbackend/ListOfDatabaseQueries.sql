CREATE TABLE category(

	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(255),
	image_url VARCHAR(50),
	is_active BOOLEAN,
	
	
	CONSTRAINT pk_category_id PRIMARY KEY (id)

);


INSERT INTO category (name, description, image_url, is_active)
VALUES ('Italian', 'This is a description for a Italian food category','CAT_1.png', true);
INSERT INTO category (name, description, image_url, is_active)
VALUES ('Franchises', 'This is a description for a franchise category','CAT_2.png', true);
INSERT INTO category (name, description, image_url, is_active)
VALUES ('Desserts', 'This is a description for a dessert category','CAT_3.png', true);


CREATE TABLE user_detail(

	id IDENTITY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	role VARCHAR(50),
	is_enabled BOOLEAN,
	password VARCHAR(50),
	email VARCHAR(100),
	contact_number VARCHAR(25),

	
	CONSTRAINT pk_category_id PRIMARY KEY (id),
	
	

);

INSERT INTO user_detail (first_name, last_name,role, is_enabled, password, email, contact_number)
VALUES ('Tlotlo','Michele', 'ADMIN', true,'admin','tlotlomichele@gmail.com','0646568478');
INSERT INTO user_detail (first_name, last_name,role, is_enabled, password, email, contact_number)
VALUES ('Thabo','Nkosi', 'CUSTOMER', true,'cust','thabonkosi@gmail.com','0845781094');
INSERT INTO user_detail (first_name, last_name,role, is_enabled, password, email, contact_number)
VALUES ('Joe','Doe', 'RESTAURANT MANAGER', true,'rest','joedoe@gmail.com','0762769478');
INSERT INTO user_detail (first_name, last_name,role, is_enabled, password, email, contact_number)
VALUES ('Timmy','Thomos', 'CUSTOMER', true,'cust','joedoe@gmail.com','0762745478');








CREATE TABLE product(

	id IDENTITY,
	code VARCHAR(20),
	name VARCHAR(255),
	restaurant VARCHAR(50),
	description VARCHAR(255),
	unit_price DECIMAL(10,2),
	quantity INT,
	is_active BOOLEAN,
	category_id INT,
	restaurant_id INT,
	purchases INT DEFAULT 0,
	views INT DEFAULT 0,
	CONSTRAINT pk_product_id PRIMARY KEY(id),
	CONSTRAINT fk_product_category_id FOREIGN KEY (category_id) REFERENCES category (id),
	CONSTRAINT fk_product_restaurant_id FOREIGN KEY (restaurant_id) REFERENCES user_detail (id),
	
);

INSERT INTO product (code, name, restaurant, description, unit_price, quantity, is_active, category_id, restaurant_id)
VALUES ('PRDABC123DEFX', 'Spur Ribs200g with chips and drink', 'Spur', 'This is spurs famous ribs with there fresh spur flavour', 18000, 5, true, 3, 2 );

INSERT INTO product (code, name, restaurant, description, unit_price, quantity, is_active, category_id, restaurant_id)
VALUES ('PRDABC123DEFX', 'Spur Chicken Salard', 'Spur', 'This is one of healthest meals in our menu', 18000, 5, true, 3, 2 );

INSERT INTO product (code, name, restaurant, description, unit_price, quantity, is_active, category_id, restaurant_id)
VALUES ('PRDDEF123DEFX', 'Wimpy Mashroom Burger with Chips', 'Wimpy', 'A famous Wimpy burger', 32000, 2, true, 3, 3 );

INSERT INTO product (code, name, restaurant, description, unit_price, quantity, is_active, category_id, restaurant_id)
VALUES ('PRDPQR123WGTX', 'Fish And Chips', 'Ocean Baskets', 'Enjoy our fish which are fresh from the ocean.', 57000, 5, true, 3, 2 );

INSERT INTO product (code, name, restaurant, description, unit_price, quantity, is_active, category_id, restaurant_id)
VALUES ('PRDMNO123PQRX', ' Spur Rib Burger with chips', 'Spur', 'This is spurs famous ribs with there fresh spur flavour', 54000, 3, true, 1, 2 );

INSERT INTO product (code, name, restaurant, description, unit_price, quantity, is_active, category_id, restaurant_id)
VALUES ('PRDABCXYZDEFX', 'Extra hot full chicken with chips and 2lt drink', 'Nandos', 'This is one of hotest meals in our menu', 48000, 5, true, 1, 3 );























































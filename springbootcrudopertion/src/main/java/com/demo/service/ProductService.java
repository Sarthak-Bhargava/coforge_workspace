package com.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import com.demo.pojo.Product;



public interface ProductService{
	
	Product CreatProductDetails(Product product); ///done
	
	// add for product
		Product addProductDetails(Product product);

		// list of all products

		ArrayList<Product> ListOfProducts(Product product);  //pending

		// Delete of Product

		void deleteProductById(long id); //pending

		// view of particular Product by id

	     Optional<Product> getProductById(long id);  //pending

		// update of particular Product by id

		void updateOfProductById(long id); //pending..
	
}
	



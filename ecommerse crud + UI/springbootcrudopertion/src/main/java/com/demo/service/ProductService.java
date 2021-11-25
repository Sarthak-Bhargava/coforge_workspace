package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.demo.pojo.Product;



public interface ProductService{
	
	Product CreatProductDetails(Product product); ///done
	
	// add for product
		Product addProductDetails(Product product);

		// list of all products

		List<Product> ListOfProducts();  //done

		// Delete of Product

		void deleteProductById(long id); //done

		// view of particular Product by id

	     Optional<Product> getProductById(long id);  //done

		

		void updateOfProductById(long id); //done
	
}
	



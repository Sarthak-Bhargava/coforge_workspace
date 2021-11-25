package com.demo.serviceImpl;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.pojo.Product;
import com.demo.repositary.ProductRepositary;
import com.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	// injecting the dependencies of ProductRepositary......jpa repositary
	@Autowired
	ProductRepositary productRepositary;  //formed object internally by spring ioc using autwired priniple

	// add prodcut api logic part
	
	@Override
	public Product CreatProductDetails(Product product) {
		
		return productRepositary.save(product);
	}

	@Override
	public Product addProductDetails(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> ListOfProducts() {
		
		return productRepositary.findAll();
	}

	@Override
	public void deleteProductById(long id) {
		Product product = productRepositary.getById(id);
		productRepositary.delete(product);
		
	}

	@Override
	public Optional<Product> getProductById(long id) {
		
		return this.productRepositary.findById(id);
	}

	@Override
	public void updateOfProductById(long id) {
		 Product product = productRepositary.getById(id);
		 productRepositary.save(product);
		
	}


	
	
	
	
	

}

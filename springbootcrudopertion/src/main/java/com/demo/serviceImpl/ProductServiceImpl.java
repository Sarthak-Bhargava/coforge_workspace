package com.demo.serviceImpl;


import java.util.ArrayList;
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
	public ArrayList<Product> ListOfProducts(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProductById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Product> getProductById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateOfProductById(long id) {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
	

}

package com.demo.controlller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Product;
import com.demo.service.ProductService;
import com.demo.serviceImpl.ProductServiceImpl;


@RestController
//@RequestMapping("/vi/api")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to my Outlet";
	}

	@PostMapping("/createproduct")
	Product createProductDetails(@RequestBody Product productinfo) {

		Product prodinfo = productService.CreatProductDetails(productinfo);

		return prodinfo;

	}
	@GetMapping("/productList")
	public List<Product> ListOfProducts() {
		return this.productService.ListOfProducts();
		
	}
	
	@DeleteMapping("/products/{id}")
	public void deleteProductById(@PathVariable long id) {
		this.productService.deleteProductById(id);
	}
	
	@PutMapping("products/{id}")
	public void updateOfProductById(@PathVariable long id) {
		this.productService.updateOfProductById(id);
		
	}
	
	@GetMapping("/productList/{id}")
	public Optional<Product> getProductById(@PathVariable long id) {
		return this.productService.getProductById(id);
		
	}

}

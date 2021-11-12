package com.demo.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Product;
import com.demo.serviceImpl.ProductServiceImpl;


@RestController
@RequestMapping("/vi/api")
public class ProductController {

	@Autowired
	ProductServiceImpl productServiceImpl;

	@PostMapping("/createproduct")
	Product createProductDetails(@RequestBody Product productinfo) {

		Product prodinfo = productServiceImpl.CreatProductDetails(productinfo);

		return prodinfo;

	}

}

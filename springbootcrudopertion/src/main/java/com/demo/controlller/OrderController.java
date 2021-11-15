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
import org.springframework.web.bind.annotation.RestController;
import com.demo.pojo.Order;
import com.demo.pojo.Product;
import com.demo.repositary.OrderRepository;
import com.demo.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderservice;
	
	@PostMapping("/createorder")
	public Order CreateOrderDetails(@RequestBody Order order) {

		return this.orderservice.CreateOrderDetails(order);

	}
	@GetMapping("/orderList")
	public List<Order> ListOfOrders() {
		return this.orderservice.ListOfOrders();
	}
	
	@DeleteMapping("/orders/{org_id}")
	public void deleteOrderById(long ord_id) {
		this.orderservice.deleteOrderById(ord_id);
	}
	
	@PutMapping("orders/{org_id}")
	public void updateOfOrderById(@PathVariable long org_id) {
		this.orderservice.updateOfOrderById(org_id);
		
	}
	
	@GetMapping("/orderList/{org_id}")
	public Optional<Order> getOrderById(@PathVariable long org_id) {
		return this.orderservice.getOrderById(org_id);
		
	}
	
	

}

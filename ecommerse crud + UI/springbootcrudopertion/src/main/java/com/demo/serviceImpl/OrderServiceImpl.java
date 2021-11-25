package com.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.pojo.Order;
import com.demo.pojo.Product;
import com.demo.repositary.OrderRepository;

import com.demo.service.OrderService;

public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepository orderRepositary; 

	@Override
	public Order CreateOrderDetails(Order order) {
		
		return orderRepositary.save(order);
	}
	
	@Override
	public List<Order> ListOfOrders() {
		
		return orderRepositary.findAll();
	}

	@Override
	public void deleteOrderById(long ord_id) {
		Order order = orderRepositary.getById(ord_id);
		orderRepositary.delete(order);
		
	}

	@Override
	public Optional<Order> getOrderById(long ord_id) {
		
		return this.orderRepositary.findById(ord_id);
	}

	@Override
	public void updateOfOrderById(long ord_id) {
		 Order order = orderRepositary.getById(ord_id);
		 orderRepositary.save(order);
		
	}

}

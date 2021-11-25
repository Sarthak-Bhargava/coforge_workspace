package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.pojo.Order;


public interface OrderService 
{
	public Order CreateOrderDetails(Order order);

	List<Order> ListOfOrders();

	void deleteOrderById(long ord_id);

	Optional<Order> getOrderById(long ord_id);

	void updateOfOrderById(long ord_id);
	
	
}

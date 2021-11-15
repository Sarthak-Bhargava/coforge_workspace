package com.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pojo.Order;
import com.demo.pojo.Product;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

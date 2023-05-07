package com.order.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.model.Order;

@RestController
@RequestMapping("/orders")
public class orderController {

	@GetMapping("/{userId}")
	public ResponseEntity<Order> getOrdersForUser(@PathVariable String userId) {
		Order ord = new Order();
		ord.orderId = 1;
		ord.orderDescription = "Books";
		
		return ResponseEntity.status(HttpStatus.OK).body(ord);
	}
}


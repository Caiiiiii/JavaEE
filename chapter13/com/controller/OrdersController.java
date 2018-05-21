package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.po.Orders;
import com.po.User;
@Controller
public class OrdersController {

	@RequestMapping("/tofindOrdersWithUser")
	public String tofindOrdersWithUser(){
		return "orders";
	}
	
	@RequestMapping("/findOrdersWithUser")
	public String findOrdersWithUser(Orders orders){
		Integer orderId = orders.getOrdersId();
		User user = orders.getUser();
		String username = user.getUsername();
		System.out.println("ordersId ="+orderId);
		System.out.println("username ="+username);
		return "success";
	}
}

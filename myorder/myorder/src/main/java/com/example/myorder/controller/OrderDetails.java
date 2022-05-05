package com.example.myorder.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myorder.Repository.OrderRepository;
import com.example.myorder.bean.Orders;




@RestController
public class OrderDetails {
	@Autowired
	OrderRepository orderrepo;
	
	
	@GetMapping("/test")
	public Orders test() {
		Orders order = new Orders();
		order.setOrderId("123");
		order.setEmailId("abc@gmail.com");
		order.setAddress("Jharkhand");
		order.setOrderStatus("out of delivery");
		order.setOrderInfo("About Product");
		order.setQuantity(10);
		order.setOrderTotal(100000);
		return order;
	}
	
	@GetMapping("/orderDeatail")
	public List<Orders>get(){
		return orderrepo.findAll();
	}
	
	@PostMapping("/orderDeatail")
	public String create(@RequestBody Orders order) {
		orderrepo.save(order);
		return "added sucessfully";
	}
	
	@PutMapping("/orderDeatail/{ID}")
	public String update(@RequestBody Orders order) {
		orderrepo.save(order);
		return "updated";
	}
	@DeleteMapping("/orderDeatail/{id}")
	public String delete(@PathVariable String id) {
		orderrepo.deleteById(id);
		return "deleted";
	}
	

}

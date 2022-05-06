package com.example.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventory.bean.Inventory;
import com.example.inventory.repository.InventoryRepo;

@RestController
public class InventoryDetails {
	@Autowired
	InventoryRepo inventory;
	
	@GetMapping("/demo")
	public Inventory demo() {
		Inventory in = new Inventory();
		in.setProductId(1);
		in.setProductInventory(10);
		in.setProductPrice(100);
		in.setProductDetails("Book");
		return in;
	}
	@GetMapping("/inventory")
	public List<Inventory> getAllProduct() {
		return inventory.findAll();
	}
	@PutMapping("/inventory/{id}")
	public void updateProduct(@RequestBody Inventory inven) {
		inventory.save(inven);
	}
	@PostMapping("/inventory")
	public void addProduct(@RequestBody Inventory inven) {
		inventory.save(inven);
	}
	@PatchMapping("/inventory/{id}")
	public void updateSpecificDetails(@RequestBody Inventory inven) {
		inventory.save(inven);
	}

}

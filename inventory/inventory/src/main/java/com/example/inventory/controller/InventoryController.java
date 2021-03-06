package com.example.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventory.bean.Inventory;
import com.example.inventory.service.InventoryService;

@RestController
public class InventoryController {

	
	@GetMapping("/inventory")
	public String testinventory() {
		return"Inventory";
	}
	
	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping("/inventory/{productId}")
	public Inventory getProductId(@PathVariable Integer productId ) {
		return inventoryService.getProductId(productId);
	}
	@GetMapping("/inventory2")
	public List<Inventory> getAllProduct() {
		return inventoryService.getAllProduct();
	}
	@PutMapping("/inventory")
	public void updateProduct(@RequestBody Inventory inventory) { 
		inventoryService.updateProduct(inventory);
	}
	@PostMapping("/inventory")
	public void addProduct(@RequestBody Inventory inventory) {
		inventoryService.addProduct(inventory);
	}
	@PutMapping("/inventory/{productId}")
	public void updateSpecificDetails(@RequestBody Inventory productDetails,@PathVariable Integer productId) {
		inventoryService.updateSpecificDetails(productDetails,productId);
	}

}


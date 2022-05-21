package com.example.inventory.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.inventory.bean.Inventory;

@Service
public interface InventoryService {
	public List<Inventory> getAllProduct();
	public void updateProduct(Inventory inven);
	public void addProduct(Inventory inven) ;
	public void updateSpecificDetails( Inventory productDetails,Integer id);
	public Inventory getProductId(Integer id);
	
}

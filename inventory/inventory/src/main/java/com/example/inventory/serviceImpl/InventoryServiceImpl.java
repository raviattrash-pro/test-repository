package com.example.inventory.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inventory.bean.Inventory;
import com.example.inventory.exception.ProductIdNotFound;
import com.example.inventory.repository.InventoryRepo;
import com.example.inventory.service.InventoryService;

import lombok.extern.slf4j.Slf4j;

@Service
/*@Slf4j*/
public class InventoryServiceImpl implements InventoryService {
	@Autowired
	InventoryRepo inventoryRepository;
	

	@Override
	public List<Inventory> getAllProduct() {
		return inventoryRepository.findAll();
	}

	@Override
	public void updateProduct(Inventory inventory) {
		Optional<Inventory> optionalProduct = inventoryRepository.findById(inventory.getProductId());
		Inventory product = optionalProduct.orElseThrow(() -> new ProductIdNotFound(inventory.getProductId()+" :  id not found"));
		inventoryRepository.save(product);
	}

	@Override
	public void addProduct(Inventory inven) {
		inventoryRepository.save(inven);
		
	}

	@Override
	public void updateSpecificDetails(Inventory productDetails, Integer id) {
		Optional<Inventory> product = inventoryRepository.findById(id);
		if(product.isPresent()) {
			Inventory currentProduct = product.get();
			currentProduct.setProductInventory(productDetails.getProductInventory());
			inventoryRepository.save(currentProduct);
		}
	}

	@Override
	public Inventory getProductId(Integer id) {
		return inventoryRepository.findById(id).get();
		
	}

	
	
}

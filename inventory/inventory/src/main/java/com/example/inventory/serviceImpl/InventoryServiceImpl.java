package com.example.inventory.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inventory.bean.Inventory;
import com.example.inventory.exception.ProductIdNotFound;
import com.example.inventory.repository.InventoryRepo;
import com.example.inventory.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService {
	@Autowired
	InventoryRepo inventoryRepository;

	@Override
	public List<Inventory> getAllProduct() {
		inventoryRepository.findAll();
		return null;
	}

	@Override
	public void updateProduct(Inventory inven, Integer id) {
		if((inventoryRepository.findById(id)).isPresent()) {
			inventoryRepository.save(inven);
		}
		else {
			throw new ProductIdNotFound(id+" :  id not found");
		}
		
	}

	@Override
	public void addProduct(Inventory inven) {
		inventoryRepository.save(inven);
		
	}

	@Override
	public void updateSpecificDetails(String productDetails, Integer id) {
		Optional<Inventory> product = inventoryRepository.findById(id);
		if(product.isPresent()) {
			Inventory currentProduct = product.get();
			currentProduct.setProductDetails(productDetails);
			inventoryRepository.save(currentProduct);
		}
	}

	
	
}

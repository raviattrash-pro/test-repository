package com.example.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inventory.bean.Inventory;

public interface InventoryRepo extends JpaRepository<Inventory, Integer> {

}

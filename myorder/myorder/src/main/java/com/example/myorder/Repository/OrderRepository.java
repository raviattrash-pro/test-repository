package com.example.myorder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myorder.bean.Orders;


public interface OrderRepository extends JpaRepository<Orders, String>{

}

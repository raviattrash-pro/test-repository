package com.example.inventory.exception;

public class ProductIdNotFound extends RuntimeException{
	public ProductIdNotFound(String str) {
		super(str);
	}

}
package com.jsp.product.controller;

import com.jsp.product.dao.ProductDao;
import com.jsp.product.dto.ProductDto;
import com.jsp.product.service.ProductService;

public class SaveProduct {

	public static void main(String[] args) {
		
		ProductDto product=new ProductDto();
		product.setBrand("Levis");
		product.setName("Jeans");
		product.setPrice(2500);
		
		ProductService ps=new ProductService();
		ps.saveProduct(product);
		if (product!=null) {
			System.out.println("data inserted");
		}else {
			System.out.println("not inserted");
		}
	}
}

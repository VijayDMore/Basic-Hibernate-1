package com.jsp.product.controller;

import com.jsp.product.service.ProductService;

public class GetAllProduct {
public static void main(String[] args) {
	ProductService ps=new ProductService();
	ps.getAllProduct();
}
}

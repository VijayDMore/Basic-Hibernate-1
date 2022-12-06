package com.jsp.product.service;

import com.jsp.product.dao.ProductDao;
import com.jsp.product.dto.ProductDto;


public class ProductService {
	
   ProductDao productdao=new ProductDao();
   
   public ProductDto saveProduct(ProductDto product) {
	   productdao.saveProduct(product);
	return product;   
   }
	
   public void updateProduct() {
	   productdao.updateProduct();
   	
}
   public void getProductById(int id) {
	   productdao.getProductById(id);
   }
   public void getAllProduct() {
	   productdao.getAllProduct();
   }
   public void deleteProduct(int id) {
	   productdao.deleteProduct(id);
   }
   
}

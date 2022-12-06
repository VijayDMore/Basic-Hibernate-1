package com.jsp.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.jsp.product.dto.ProductDto;

public class ProductDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("scott");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public ProductDto saveProduct(ProductDto product) {
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		
		return product;
	
	}
	public void updateProduct() {
		ProductDto product=entityManager.find(ProductDto.class,1);
		product.setPrice(1200);
		if(product!=null) {
			entityTransaction.begin();
			entityManager.merge(product);
			entityTransaction.commit();
			System.out.println("value updated");
		}else {
			System.out.println("value not updated");
		}
	}
	public void getProductById(int id) {
		ProductDto product=entityManager.find(ProductDto.class,id);
		if(product!=null) {
			System.out.println("=====================");
			System.out.println("product id: "+product.getId());
			System.out.println("product name:"+product.getName());
			System.out.println("product brand:"+product.getBrand());
			System.out.println("product price:"+product.getPrice());
		}
	}
	public void getAllProduct() {
		String sql="select p FROM Product p";
		Query query=entityManager.createQuery(sql);
		List<ProductDto> products=query.getResultList();
		
		for(ProductDto p : products) {
			System.out.println("===============");
			System.out.println("Product id:"+p.getId());
			System.out.println("product name:"+p.getName());
			System.out.println("product brand:"+p.getBrand());
			System.out.println("product price:"+p.getPrice());
	}

}
	public void deleteProduct(int id) {
		ProductDto product =entityManager.find(ProductDto.class,id);
		if(product!=null) {
	       entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
			
			System.out.println("object with above id removed");
		}else {
			System.out.println("no such id found");
		}
	}
	
}
	
	
	
	
	

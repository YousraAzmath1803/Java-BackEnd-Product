package com.example.productapp.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.productapp.model.Product;
@Component
public interface ProductService {
	
	public Product saveProduct(Product product);
	
	public List<Product> getAllProduct();
	
	public Product getProductById(Integer id);
	
	public String deleteProduct(Integer id);
	
	public Product editProduct(Product product,Integer id);
	

}

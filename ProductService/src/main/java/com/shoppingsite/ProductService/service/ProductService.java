package com.shoppingsite.ProductService.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shoppingsite.ProductService.model.ProductModel;
import com.shoppingsite.ProductService.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	
	public ProductModel saveProduct(ProductModel product) {
		return productRepository.save(product);
	}
	
	public Optional<ProductModel> getProductById(long id) {
		return productRepository.findById(id);
	}
	
	public List<ProductModel> getProductByName(String name) {
		return productRepository.findByName(name);
	}
	
	public List<ProductModel> getAllProducts(){
		return productRepository.findAll();
	}
}

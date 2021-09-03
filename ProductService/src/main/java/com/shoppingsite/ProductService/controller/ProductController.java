package com.shoppingsite.ProductService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingsite.ProductService.model.ProductModel;
import com.shoppingsite.ProductService.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductService productService;
	
	
	@PostMapping("/addproduct")
	public ProductModel saveProduct(@RequestBody ProductModel product) {
		return productService.saveProduct(product);
	}
	
	@GetMapping("/getproductById/{id}")
	public Optional<ProductModel> getProductByName(@PathVariable(value = "id") long id) {
		return productService.getProductById(id);
	}
	
	@GetMapping("/getproductByName/{name}")
	public List<ProductModel> getProductByName(@PathVariable(value = "name") String name) {
		return productService.getProductByName(name);
	}
	
	@GetMapping("/getAllProducts")
	public List<ProductModel> getAllProducts() {
		return productService.getAllProducts();
	}
}

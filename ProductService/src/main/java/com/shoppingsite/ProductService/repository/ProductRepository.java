package com.shoppingsite.ProductService.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingsite.ProductService.model.ProductModel;


public interface ProductRepository extends JpaRepository<ProductModel, Long>{

	List<ProductModel> findByName(String name);

}

package com.aghanscode.repo;

import java.util.List;

import com.aghanscode.entity.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {
    
    List<Product> findByNameContains(String keyword);

}

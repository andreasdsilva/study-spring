package com.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}

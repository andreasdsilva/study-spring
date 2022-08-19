package com.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}

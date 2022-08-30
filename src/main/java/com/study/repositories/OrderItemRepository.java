package com.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}

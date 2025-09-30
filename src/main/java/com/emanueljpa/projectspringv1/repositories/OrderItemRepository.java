package com.emanueljpa.projectspringv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emanueljpa.projectspringv1.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
		
	
	
	
}

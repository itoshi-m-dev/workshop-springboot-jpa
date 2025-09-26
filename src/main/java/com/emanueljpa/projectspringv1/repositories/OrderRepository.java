package com.emanueljpa.projectspringv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emanueljpa.projectspringv1.entities.Order;
import com.emanueljpa.projectspringv1.entities.User;


public interface OrderRepository extends JpaRepository<Order, Long> {
		
	
	
	
}

package com.devsuperior.fooddelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.fooddelivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

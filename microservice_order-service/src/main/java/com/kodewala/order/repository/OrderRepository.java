package com.kodewala.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodewala.order.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

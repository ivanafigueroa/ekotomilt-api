package com.ekotomitl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ekotomilt.models.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {

}
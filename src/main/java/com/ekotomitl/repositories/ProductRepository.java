package com.ekotomitl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ekotomilt.models.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}

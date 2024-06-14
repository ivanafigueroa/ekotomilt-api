package com.ekotomitl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ekotomilt.models.SellerPayment;


@Repository
public interface SellerPaymentRepository extends JpaRepository<SellerPayment, Long>{

}

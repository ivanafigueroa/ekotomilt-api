package com.ekotomitl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ekotomilt.models.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
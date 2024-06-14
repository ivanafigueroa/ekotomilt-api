package com.ekotomitl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ekotomilt.models.Category;



@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

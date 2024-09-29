package com.estudandonaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandonaweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}

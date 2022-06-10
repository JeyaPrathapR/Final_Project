package com.project.sbJPNcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.project.sbJPNcart.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
	
}

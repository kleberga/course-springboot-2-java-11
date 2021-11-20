package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Product;


/* nao preciso colocar a anotation @Repository por que estou extendo o JPA que jah eh componente do spring boot */
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}

package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Order;


/* nao preciso colocar a anotation @Repository por que estou extendo o JPA que jah eh componente do spring boot */
public interface OrderRepository extends JpaRepository<Order, Long> {
	
}

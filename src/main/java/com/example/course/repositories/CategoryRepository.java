package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Category;


/* nao preciso colocar a anotation @Repository por que estou extendo o JPA que jah eh componente do spring boot */
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}

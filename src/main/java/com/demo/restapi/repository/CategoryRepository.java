package com.demo.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.restapi.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}

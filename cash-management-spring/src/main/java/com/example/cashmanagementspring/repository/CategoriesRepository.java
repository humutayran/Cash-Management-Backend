package com.example.cashmanagementspring.repository;

import com.example.cashmanagementspring.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {
}

package com.example.jpaonetomanydemo.repository;

import com.example.jpaonetomanydemo.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}

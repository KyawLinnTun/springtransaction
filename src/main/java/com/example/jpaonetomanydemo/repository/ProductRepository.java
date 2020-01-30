package com.example.jpaonetomanydemo.repository;

import com.example.jpaonetomanydemo.domain.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products,Integer> {
}

package com.example.jpaonetomanydemo.service;

import com.example.jpaonetomanydemo.domain.Category;
import com.example.jpaonetomanydemo.domain.Products;
import com.example.jpaonetomanydemo.repository.CategoryRepository;
import com.example.jpaonetomanydemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CreateDatabaseImpl implements ICreateDatabase {


    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    @Transactional
    public void createDatabase() {

        Category category1=new Category("Meal");
        Category category2=new Category("Friuts");
        Products products1=new Products("Chicken",23,5000);
        Products products2=new Products("Fish",23,5000);
        Products products3=new Products("Apple",23,5000);
        Products products4=new Products("Orange",23,5000);

         products1.setCategory(category1);
         products2.setCategory(category2);
         products3.setCategory(category2);
         products4.setCategory(category1);

        categoryRepository.save(category1);
        categoryRepository.save(category2);

        productRepository.save(products1);
        productRepository.save(products2);
        productRepository.save(products3);
        productRepository.save(products4);
    }
}

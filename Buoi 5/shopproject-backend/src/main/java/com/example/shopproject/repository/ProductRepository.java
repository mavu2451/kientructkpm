package com.example.shopproject.repository;

import com.example.shopproject.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductRepository {
    boolean saveProducts(Products Products);

    List<Products> findAllProducts();

    Products findById(Long id);

    boolean deleteProducts(Long id);

    boolean updateProducts(Long id, Products Products);
}

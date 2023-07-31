package com.example.shopproject.service;

import com.example.shopproject.model.Products;
import com.example.shopproject.repository.ProductRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepositoryImpl repo;

    public ProductService(ProductRepositoryImpl repo) {
        this.repo = repo;
    }

    public boolean save(Products product) {

        return repo.saveProducts(product);
    }

    public List<Products> findAllProducts() {
        return repo.findAllProducts();
    }

    public Products getId(long id) {
        return repo.findById(id);
    }
    public boolean updateProduct(Long id, Products products){
        return repo.updateProducts(id, products);
    }
    public boolean delete(long id) {
        return repo.deleteProducts(id);
    }


}

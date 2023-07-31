package com.example.shopproject.repository;

import com.example.shopproject.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository{
    private final RedisTemplate redisTemplate;

    private static final String KEY = "Products";

    public ProductRepositoryImpl(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public boolean saveProducts(Products products) {
        try {
            redisTemplate.opsForHash().put(KEY, products.getId().toString(), products);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Products> findAllProducts() {
        List<Products> products;
        products = redisTemplate.opsForHash().values(KEY);
        return products;
    }

    @Override
    public Products findById(Long id) {
        Products Products;
        Products = (Products) redisTemplate.opsForHash().get(KEY,id.toString());
        return Products;
    }

    @Override
    public boolean deleteProducts(Long id) {
        try {
            redisTemplate.opsForHash().delete(KEY,id.toString());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateProducts(Long id, Products Products) {
        try {
            redisTemplate.opsForHash().put(KEY, id, Products);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

package com.example.shopproject.controller;

import com.example.shopproject.model.Products;
import com.example.shopproject.repository.ProductRepository;
import com.example.shopproject.service.ProductService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@OpenAPIDefinition(info = @Info(title = "Product API", version = "1.0", description = "Thêm thông tin sản phẩm"))
public class ProductRest {

    public static String HASH = "Products";
    private final RedisTemplate<String, Products> redisTemplate;
    private final ProductService service;

    public ProductRest(RedisTemplate<String, Products> redisTemplate, ProductService service) {
        this.redisTemplate = redisTemplate;
        this.service = service;
    }
    @RequestMapping("/shop")
    public ResponseEntity<List<Products>> findAll(){
       List<Products> list;
       list = service.findAllProducts();
       return ResponseEntity.ok(list);
    }

    @PostMapping("/shop/new")
    public ResponseEntity<String> createProduct(@RequestBody Products product){
        boolean result = service.save(product);
        if(result)
            return ResponseEntity.ok("Them thanh cong!!");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

    }


    @GetMapping("/find/{id}")
    public ResponseEntity<Products> findProduct(@PathVariable long id){
        Products products;
        products=  service.getId(id);
        return ResponseEntity.ok(products);
    }
    @PutMapping("update/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable long id, Products p){
        boolean result = service.updateProduct(id,p);
        if(result)
            return ResponseEntity.ok("Thay doi thanh cong!!");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable long id, Products p){
        boolean result = service.delete(id);
        if(result)
            return ResponseEntity.ok("Xoa thanh cong!!");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}

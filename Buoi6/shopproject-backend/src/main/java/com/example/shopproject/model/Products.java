package com.example.shopproject.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Entity
@Data
@Table(name="products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Products implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Lob
    @Column(name="image", length = 1000)
    private String image;
    private String info;
    private float price;
}
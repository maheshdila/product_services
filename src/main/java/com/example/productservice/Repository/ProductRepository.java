package com.example.productservice.Repository;

import com.example.productservice.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query("SELECT p FROM Product p WHERE p.category_name = ?1")
    List<Product> findBycategory_name(String category_name);
}

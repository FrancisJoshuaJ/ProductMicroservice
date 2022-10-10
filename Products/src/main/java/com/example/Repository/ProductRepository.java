package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Products;

@Repository
public interface ProductRepository extends JpaRepository< Products, Long > {

}

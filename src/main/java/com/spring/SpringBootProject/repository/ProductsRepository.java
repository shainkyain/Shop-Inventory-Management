package com.spring.SpringBootProject.repository;

//import com.spring.SpringBootProject.Product.model;
import com.spring.SpringBootProject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Integer> {

}

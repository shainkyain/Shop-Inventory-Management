package com.spring.SpringBootProject.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="products")
public class Product {


//    id, name, brand, category, price, description, createdAt, imageFileName;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String brand;
private String category;
private double price;
@Column(columnDefinition = "TEXT")
private String description;
private LocalDate createdAt;
//private String imageFileName;

    public Product(int id, String name, String brand, String category, double price, String description, LocalDate createdAt) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.description = description;
        this.createdAt = createdAt;
//        this.imageFileName = imageFileName;
    }

    public Product() { super();}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

//    public String getImageFileName() {
//        return imageFileName;
//    }

//    public void setImageFileName(String imageFileName) {
//        this.imageFileName = imageFileName;
//    }
}




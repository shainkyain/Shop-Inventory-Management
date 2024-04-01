package com.spring.SpringBootProject.controller;

import com.spring.SpringBootProject.model.Product;
import com.spring.SpringBootProject.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
public class ProductsController {
@Autowired
private ProductsRepository productsRepository;
    @GetMapping("/")
    public String map(){
        return "home";
    }

    @GetMapping("/productList")
    public String showProducts( Model model){

    List<Product> products = productsRepository.findAll();
    model.addAttribute("products" , products);
    return "productList";
    }

    @PostMapping("/save")
    public String addProduct(@ModelAttribute  Product p){
        p.setCreatedAt(LocalDate.now());
        productsRepository.save(p);

        return "redirect:/productList";
    }

    @GetMapping("/addProduct")
    public String addProduct(){
        return "addProduct";
    }


    @RequestMapping("/delete/{id}" )
    public String deleteById(@PathVariable("id") int id ){
//        productsRepository.deleteById(id);

        productsRepository.deleteById(id);
        return "redirect:/productList";
    }

    @RequestMapping("/updatepage/{id}")
    public String updateById(@PathVariable("id") int id, ModelMap model){
        Product product = productsRepository.findById(id).get();

        model.addAttribute("product" , product);
        return "updateProduct";
    }
    @PostMapping("/updatesave")
    public String updateSave(@ModelAttribute  Product p){
        p.setCreatedAt(LocalDate.now());
        productsRepository.save(p);

        return "redirect:/productList";
    }








}

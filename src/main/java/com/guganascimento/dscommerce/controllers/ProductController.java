package com.guganascimento.dscommerce.controllers;

import com.guganascimento.dscommerce.entities.Product;
import com.guganascimento.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    private ProductRepository respository;
    @GetMapping
    public String teste(){
        Optional <Product> result = respository.findById(1L);
        Product product = result.get();
        return product.getName()  + "\n" +  product.getDescription();
    }

}

package com.geek.store.controllers;


import com.geek.store.model.Product;
import com.geek.store.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public List<Product> getAll() {
        return productService.findAll();
    }

    @GetMapping("/products/{id}")
    public Product getById(@PathVariable Long id) {
        return productService.findById(id).get();
    }

    @GetMapping("/products/delete/{id}")
    public Product deleteById(@PathVariable Long id) {
        Product product = productService.findById(id).get();
        productService.deleteById(product.getId());
        return product;
    }

    @PostMapping("/products/add")
    public Product add(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/products/beforeMin")
    public List<Product> findProductsByFilter(@RequestParam(name = "min") Double min) {
        return productService.findAfterMin(min);
    }

    @GetMapping("/products/afterMax")
    public List<Product> findBeforeMax(@RequestParam(name = "max") Double max) {
        return productService.findBeforeMax(max);
    }

    @GetMapping("/products/filter")
    public List<Product> findBetweenMaxAndMin(@RequestParam(name = "min") Double min, @RequestParam(name = "max") Double max) {
        return productService.findBetweenMinAndMax(min,max);
    }



}

package com.geek.store.services;

import com.geek.store.model.Product;
import com.geek.store.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public List<Product> findAfterMin(Double min) {
        return productRepository.findAllByCostAfter(min);
    }

    public List<Product> findBeforeMax(Double max) {
        return productRepository.findAllByCostBefore(max);
    }

    public List<Product> findBetweenMinAndMax(Double min, Double max) {
        return productRepository.findAllByCostBetween(min, max);
    }
}

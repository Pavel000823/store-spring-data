package com.geek.store.repositories;

import com.geek.store.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findAllByCostAfter(Double cost);

    List<Product> findAllByCostBefore(Double cost);

    List<Product> findAllByCostBetween(Double min,Double max);
}

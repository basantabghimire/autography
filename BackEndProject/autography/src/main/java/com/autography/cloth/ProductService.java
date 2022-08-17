package com.autography;

import com.autography.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {
    @Autowired

    private ProductRepository productRepository;


    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> findAllByProduct(String name) {
        return productRepository.findByName(name);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}

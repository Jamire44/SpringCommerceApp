package com.jamie.simpleWebApp.service;

import com.jamie.simpleWebApp.model.Product;
import com.jamie.simpleWebApp.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(1, "iPhone", 450),
//            new Product(2, "MacBook", 1000),
//            new Product(3, "iPhone 13 Pro", 1200))
//    );

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProductsById(Long id) {
        return productRepository.findById(id).orElse(new Product(null, "Null", 0));
    }

    public void add(Product product) {
        productRepository.save(product);
    }

    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

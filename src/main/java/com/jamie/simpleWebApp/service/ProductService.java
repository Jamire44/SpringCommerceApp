package com.jamie.simpleWebApp.service;

import com.jamie.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "iPhone", 450),
            new Product(2, "MacBook", 1000),
            new Product(3, "iPhone 13 Pro", 1200))
    );


    public List<Product> getProducts() {
        return products;
    }

    public Product getProductsById(int id) {
        return products.stream()
                .filter(product -> product.getProdId() == id)
                .findFirst().orElse(new Product(0, "Not Found", 0));
    }

    public void add(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == product.getProdId()) {
                index = i;
            }
        }
        products.set(index, product);
    }

    public void deleteProduct(long id) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == id) {
                index = i;
            }
        }
        products.remove(index);
    }
}

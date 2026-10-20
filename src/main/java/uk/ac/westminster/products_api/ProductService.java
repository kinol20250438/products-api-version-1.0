package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private  List<Product> products = new ArrayList<>();
    private long nextId = 1L;



    public List<Product> getAllProducts() {
        return products;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(product ->id.equals(product.getId()))
                .findFirst();
    }



    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }
}

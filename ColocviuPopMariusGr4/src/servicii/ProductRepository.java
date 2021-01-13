package servicii;

import Exceptii.ProductNotFoundException;
import models.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {
    Map<String , Product> products;

    public ProductRepository() {
        products = new HashMap<>();
    }

    public Map<String, Product> getProducts() {
        return products;
    }

    public Product create (Product product){
        String key = product.getName().toLowerCase();
        products.put(key , product);

        return product;
    }

    public boolean delete (Product product) throws ProductNotFoundException {
        if(product != null && product.getName() != null) {
            String key = product.getName().toLowerCase();
            if (products.containsKey(key)) {
                products.remove(key);
                return true;
            } else {
                throw new ProductNotFoundException("Nu exista in lista");
            }
        }
        return false;
    }
}

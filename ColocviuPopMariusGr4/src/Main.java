import Exceptii.ValidationFailedExeption;
import models.Product;
import servicii.ProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();

        Product product = new Product("Lapte" , 22.4);

        Product product1 = new Product("Lamaie" , 5.1);

        Product product2 = new Product("Ardei" , 22.4);

        Product product3 = new Product("Lapte" , 25.5);

        System.out.println("Add: ");

        /// add
        try {
            productService.create(product);
        }catch (ValidationFailedExeption e){
            System.out.println(e.getMessage());
        }
        try {
            productService.create(product1);
        }catch (ValidationFailedExeption e){
            System.out.println(e.getMessage());
        }
        try {
            productService.create(product2);
        }catch (ValidationFailedExeption e){
            System.out.println(e.getMessage());
        }
        try {
            productService.create(product3);
        }catch (ValidationFailedExeption e){
            System.out.println(e.getMessage());
        }

        HashMap<String , Product> productHashMap = (HashMap<String, Product>) productService.getProductRepository().getProducts();

        for(Map.Entry<String, Product> m : productHashMap.entrySet() ){
            System.out.println(m.getValue());
        }

        System.out.println("Search: ");
        ///search
        ArrayList<Product> products = (ArrayList<Product>) productService.search("la");

        for(Product p : products){
            System.out.println(p);
        }

        System.out.println("Delete: ");
        /// delete
        productService.delete(product1);

        productHashMap = (HashMap<String, Product>) productService.getProductRepository().getProducts();

        for(Map.Entry<String, Product> m : productHashMap.entrySet() ){
            System.out.println(m.getValue());
        }
    }
}

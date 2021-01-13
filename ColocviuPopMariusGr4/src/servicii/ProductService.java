package servicii;

import Exceptii.ProductNotFoundException;
import Exceptii.ValidationFailedExeption;
import models.Offer;
import models.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements AppService<Product>{
    ProductRepository productRepository;

    public ProductService() {
        productRepository  = new ProductRepository();
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public Product create (Product product) throws ValidationFailedExeption{
        if(product.getName() != null && product.getPrice() > 0) {
            return productRepository.create(product);
        }else{
          throw new ValidationFailedExeption("Name or price is wrong");
        }
    }
    public List<Product> search (String product){
        List<Product> productList = new ArrayList<>();

        HashMap<String , Product> productHashMap = (HashMap<String, Product>) productRepository.getProducts();

        for(Map.Entry<String , Product> mapElement : productHashMap.entrySet()){
            if(mapElement.getKey().contains(product)){
                productList.add(mapElement.getValue());
            }
        }

        return productList;
    }

    public boolean delete(Product product){
        try {
            productRepository.delete(product);
            return true;
        }catch (ProductNotFoundException s){
            System.out.println(s.getMessage());
        }
        return false;
    }

    @Override
    public List<Offer> findAllByProductName(String s) {
        return null;
    }
}

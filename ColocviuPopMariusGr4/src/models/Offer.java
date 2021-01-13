package models;

import java.util.List;

public class Offer extends AbstractEntity{
    private String customer;
    private List<Product> products;
    private Long total;

    public Offer() {
    }

    public Offer(String customer, Long total) {
        this.customer = customer;
        this.total = total;
    }

    public Offer(String customer, List<Product> products, Long total) {
        this.customer = customer;
        this.products = products;
        this.total = total;
    }

    public String getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public long getTotal() {
        return total;
    }
}

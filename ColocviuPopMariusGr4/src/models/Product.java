package models;

public class Product extends AbstractEntity{
    private String name;
    private Double price;
    private static int idAll = 1;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
        super.setId(idAll++);
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

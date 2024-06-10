package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

    private Integer quantity;
    private Double price;

    public OrderItem(Double price, Integer quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Double subTotal() {
        return quantity * price;
    }

    //getters e setters
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "quantity= " + quantity +
                ", price= " + price +
                ", products= " + products +
                " Subtotal: " + subTotal() + "}";
    }
}

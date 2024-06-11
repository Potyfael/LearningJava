package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

    private Integer quantity;
    private Double price;

    public OrderItem(Double price, Integer quantity, Product product) {
        this.price = price;
        this.quantity = quantity;
    }

    private Product products;


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

    @Override
    public String toString() {
        return products.getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}

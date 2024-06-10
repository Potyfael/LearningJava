package entities;

import entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    public Order() {
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    // atributos da classe
    private Date moment;
    private OrderStatus status;

    // composicao
    private List<Client> clients= new ArrayList<>();
    private List<OrderItem> orderItems = new ArrayList<>();

    //metodos
    public void addItem(OrderItem item) {
        orderItems.add(item);
    }
    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }
    public double total() {
        double total = 0;
        for (OrderItem i : orderItems) {
            total += i.subTotal();
        }
        return total;
    }

    // setters e getters


    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}

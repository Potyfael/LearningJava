package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    // atributos da classe
    private Date moment;
    private OrderStatus status;

    public Order() {
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }
    SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
    // composicao
    private List<Client> clients = new ArrayList<>();
    private List<OrderItem> orderItems = new ArrayList<>();

    //metodos
    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void removeClient(Client client) {
        clients.remove(client);
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: " + moment + "\n");
        sb.append("Order status: " + getStatus() + "\n");
        for (int i = 0; i < clients.size(); i++) {
            sb.append("Client: " + clients.get(i).getName() + " " + sdt.format(clients.get(i).getBirthDate()) + " - " + clients.get(i).getEmail() + "\n");
        }
        for (OrderItem i : orderItems) {
            sb.append(i + "\n");
        }
        sb.append("Total price: " + total());
        return sb.toString();
    }

}


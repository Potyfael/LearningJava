import entities.Client;
import entities.OrderItem;
import entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date: ");
        String stringDate = sc.next();
        Date birthDay = sdt.parse(stringDate);



        System.out.print("Status: ");
        String status = sc.next();

        Client rafa = new Client(name, email, birthDay);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.printf("Enter #%d item data:\n", i+1);
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            Product product = new Product(name, productPrice);
            OrderItem oderItem = new OrderItem(productPrice, quantity);
            
        }

    }
}
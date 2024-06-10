package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // coletando informacoes do trabalhador:

        System.out.print("Enter department's name: ");
        String departmentName = sc.next();


        System.out.println("Enter worker data:");

        System.out.print("Name: ");
        sc.nextLine();
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String level = sc.next();

        System.out.print("Base salary: ");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));

        // coletando informacoes dos contrato
        System.out.print("How many contracts to this worker? ");
        int quantContracts = sc.nextInt();

        for (int i=0; i<quantContracts; i++) {
            System.out.printf("Enter contract #%d data:\n", i+1);

            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        // calcula income do trabalhador
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        Integer month = Integer.parseInt(monthAndYear.substring(0, 2));
        Integer year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Worker: " + worker.getName());
        System.out.printf("Worker level: %s\n", level);
        System.out.printf("Department: %s\n", departmentName);
        System.out.printf("Income for %s: %.2f", monthAndYear, worker.income(year, month));

        sc.close();
    }

}

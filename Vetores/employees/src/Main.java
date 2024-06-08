import java.util.Scanner;
import entities.Employee;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("How many employee will be registered? ");
        n = sc.nextInt();

        ArrayList<Employee> list = new ArrayList<>();

        for (int i=0; i < n; i++ ) {
            System.out.printf("Employee #%d:\n", i+1);

            System.out.print("Id: ");
            Integer id = sc.nextInt();

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(name, salary, id);
            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");

        int id = sc.nextInt();
        Integer pos = position(list, id);
        if (pos == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }


        sc.close();

        System.out.println("Employees:");
        for (Employee emp : list) {
            System.out.println(emp);
        }


    }

    public static Integer position(List<Employee> list, int id) {
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).getId() == id)
                return i;
        }
        return null;
    }
}

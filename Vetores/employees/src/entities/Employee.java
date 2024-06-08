package entities;

public class Employee {

    private final Integer id;
    private String name;
    private Double salary;


    public Employee(String name, Double salary, Integer id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public void increaseSalary(double percentage) {
        salary += getSalary() * (percentage/100);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String toString() {
        String txt = String.format("%d, %s, %.2f", getId(), getName(), getSalary());
        return txt;
    }

}

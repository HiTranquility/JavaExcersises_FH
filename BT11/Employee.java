package BT11;

public class Employee {
    private String id;
    private String name;
    private double salary;
    private double coefficientsSalary;

    public Employee(String id, String name, int salary, double coefficientsSalary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public double calculateActualSalary() {
        return salary * coefficientsSalary;
    }

    @Override
    public String toString() {
        return "Employee{id='" + id + "', name='" + name + "', salary=" + salary + ", coefficientsSalary=" + coefficientsSalary + "}";
    }
}

package BT12;

public class Employee {
    private String id;
    private String name;
    private int hourOfTimeserving;
    private double salaryPerHourOfTimeserving;
    private int hourOfOvertime;
    private double bonusSalaryPerHourOfOvertime;

    public Employee(String id, String name, int hourOfTimeserving, double salaryPerHourOfTimeserving,
                    int hourOfOvertime, double bonusSalaryPerHourOfOvertime) {
        this.id = id;
        this.name = name;
        this.hourOfTimeserving = hourOfTimeserving;
        this.salaryPerHourOfTimeserving = salaryPerHourOfTimeserving;
        this.hourOfOvertime = hourOfOvertime;
        this.bonusSalaryPerHourOfOvertime = bonusSalaryPerHourOfOvertime;
    }

    public double calculateActualSalary() {
        return (hourOfTimeserving * salaryPerHourOfTimeserving) +
               (hourOfOvertime * bonusSalaryPerHourOfOvertime);
    }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getHourOfTimeserving() { return hourOfTimeserving; }
    public void setHourOfTimeserving(int hourOfTimeserving) { this.hourOfTimeserving = hourOfTimeserving; }

    public double getSalaryPerHourOfTimeserving() { return salaryPerHourOfTimeserving; }
    public void setSalaryPerHourOfTimeserving(double salaryPerHourOfTimeserving) { 
        this.salaryPerHourOfTimeserving = salaryPerHourOfTimeserving; 
    }

    public int getHourOfOvertime() { return hourOfOvertime; }
    public void setHourOfOvertime(int hourOfOvertime) { this.hourOfOvertime = hourOfOvertime; }

    public double getBonusSalaryPerHourOfOvertime() { return bonusSalaryPerHourOfOvertime; }
    public void setBonusSalaryPerHourOfOvertime(double bonusSalaryPerHourOfOvertime) { 
        this.bonusSalaryPerHourOfOvertime = bonusSalaryPerHourOfOvertime; 
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", actual salary=" + calculateActualSalary() + "]";
    }

    // Getters and setters
}


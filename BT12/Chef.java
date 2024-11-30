package BT12;

public class Chef extends Employee {
    private int numberOfDishes;
    private double coefficientBonusPerDishes;

    public Chef(String id, String name, int hourOfTimeserving, double salaryPerHourOfTimeserving,
                int hourOfOvertime, double bonusSalaryPerHourOfOvertime, int numberOfDishes,
                double coefficientBonusPerDishes) {
        super(id, name, hourOfTimeserving, salaryPerHourOfTimeserving, hourOfOvertime, bonusSalaryPerHourOfOvertime);
        this.numberOfDishes = numberOfDishes;
        this.coefficientBonusPerDishes = coefficientBonusPerDishes;
    }

    @Override
    public double calculateActualSalary() {
        return super.calculateActualSalary() + (numberOfDishes * coefficientBonusPerDishes);
    }
    public int getNumberOfDishes() { return numberOfDishes; }
    public void setNumberOfDishes(int numberOfDishes) { this.numberOfDishes = numberOfDishes; }

    public double getCoefficientBonusPerDishes() { return coefficientBonusPerDishes; }
    public void setCoefficientBonusPerDishes(double coefficientBonusPerDishes) { 
        this.coefficientBonusPerDishes = coefficientBonusPerDishes; 
    }
    @Override
    public String toString() {
        return "Chef [numberOfDishes=" + numberOfDishes + ", actual salary=" + calculateActualSalary() + "]";
    }
}


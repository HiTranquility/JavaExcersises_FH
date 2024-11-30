package BT12;

public class Waiter extends Employee {
    private double rating;
    private double bonusSalary;

    public Waiter(String id, String name, int hourOfTimeserving, double salaryPerHourOfTimeserving,
                  int hourOfOvertime, double bonusSalaryPerHourOfOvertime, double rating, double bonusSalary) {
        super(id, name, hourOfTimeserving, salaryPerHourOfTimeserving, hourOfOvertime, bonusSalaryPerHourOfOvertime);
        this.rating = rating;
        this.bonusSalary = bonusSalary;
    }
    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public double getBonusSalary() { return bonusSalary; }
    public void setBonusSalary(double bonusSalary) { this.bonusSalary = bonusSalary; }
    @Override
    public double calculateActualSalary() {
        return super.calculateActualSalary() + bonusSalary;
    }

    @Override
    public String toString() {
        return "Waiter [rating=" + rating + ", actual salary=" + calculateActualSalary() + "]";
    }
}

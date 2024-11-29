package BT11;

public class Manager extends Employee {
    private double bonusRate;

    public Manager(String id, String name, int salary, double coefficientsSalary, double bonusRate) {
        super(id, name, salary, coefficientsSalary);
        this.bonusRate = bonusRate;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    @Override
    public double calculateActualSalary() {
        return super.calculateActualSalary() + (getSalary() * bonusRate);
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() + ", bonusRate=" + bonusRate + "}";
    }
}

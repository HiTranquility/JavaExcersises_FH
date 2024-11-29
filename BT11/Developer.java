package BT11;

public class Developer extends Employee {
    private int hourOfOvertime;
    private double bonusPerHourOfOvertime;

    public Developer(String id, String name, int salary, double coefficientsSalary, int hourOfOvertime, double bonusPerHourOfOvertime) {
        super(id, name, salary, coefficientsSalary);
        this.hourOfOvertime = hourOfOvertime;
        this.bonusPerHourOfOvertime = bonusPerHourOfOvertime;
    }

    public int getHourOfOvertime() {
        return hourOfOvertime;
    }

    public void setHourOfOvertime(int hourOfOvertime) {
        this.hourOfOvertime = hourOfOvertime;
    }

    public double getBonusPerHourOfOvertime() {
        return bonusPerHourOfOvertime;
    }

    public void setBonusPerHourOfOvertime(double bonusPerHourOfOvertime) {
        this.bonusPerHourOfOvertime = bonusPerHourOfOvertime;
    }

    @Override
    public double calculateActualSalary() {
        return super.calculateActualSalary() + (hourOfOvertime * bonusPerHourOfOvertime);
    }

    @Override
    public String toString() {
        return "Developer{" + super.toString() + ", hourOfOvertime=" + hourOfOvertime + ", bonusPerHourOfOvertime=" + bonusPerHourOfOvertime + "}";
    }
}

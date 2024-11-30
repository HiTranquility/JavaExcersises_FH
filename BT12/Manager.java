package BT12;

public class Manager extends Employee {
    private double bonusRate;
    private double kpiPoint;
    private double kpiThreshold;

    public Manager(String id, String name, int hourOfTimeserving, double salaryPerHourOfTimeserving,
                   int hourOfOvertime, double bonusSalaryPerHourOfOvertime, double bonusRate,
                   double kpiPoint, double kpiThreshold) {
        super(id, name, hourOfTimeserving, salaryPerHourOfTimeserving, hourOfOvertime, bonusSalaryPerHourOfOvertime);
        this.bonusRate = bonusRate;
        this.kpiPoint = kpiPoint;
        this.kpiThreshold = kpiThreshold;
    }

    @Override
    public double calculateActualSalary() {
        double baseSalary = super.calculateActualSalary();
        if (kpiPoint >= kpiThreshold) {
            baseSalary += baseSalary * bonusRate;
        }
        return baseSalary;
    }
    public double getBonusRate() { return bonusRate; }
    public void setBonusRate(double bonusRate) { this.bonusRate = bonusRate; }

    public double getKpiPoint() { return kpiPoint; }
    public void setKpiPoint(double kpiPoint) { this.kpiPoint = kpiPoint; }

    public double getKpiThreshold() { return kpiThreshold; }
    public void setKpiThreshold(double kpiThreshold) { this.kpiThreshold = kpiThreshold; }

    @Override
    public String toString() {
        return "Manager [kpiPoint=" + kpiPoint + ", actual salary=" + calculateActualSalary() + "]";
    }
}

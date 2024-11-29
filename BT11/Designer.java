package BT11;

public class Designer extends Employee {
    private int numberOfCompletedProjects;
    private int numberOfProjectsUnderImplementation;
    private double bonusPerCompletedProject;
    private double bonusPerProjectUnderImplementation;

    public Designer(String id, String name, int salary, double coefficientsSalary, int numberOfCompletedProjects, int numberOfProjectsUnderImplementation, double bonusPerCompletedProject, double bonusPerProjectUnderImplementation) {
        super(id, name, salary, coefficientsSalary);
        this.numberOfCompletedProjects = numberOfCompletedProjects;
        this.numberOfProjectsUnderImplementation = numberOfProjectsUnderImplementation;
        this.bonusPerCompletedProject = bonusPerCompletedProject;
        this.bonusPerProjectUnderImplementation = bonusPerProjectUnderImplementation;
    }

    @Override
    public double calculateActualSalary() {
        return super.calculateActualSalary() + (numberOfCompletedProjects * bonusPerCompletedProject) + (numberOfProjectsUnderImplementation * bonusPerProjectUnderImplementation);
    }

    @Override
    public String toString() {
        return "Designer{" + super.toString() + ", numberOfCompletedProjects=" + numberOfCompletedProjects + ", numberOfProjectsUnderImplementation=" + numberOfProjectsUnderImplementation + ", bonusPerCompletedProject=" + bonusPerCompletedProject + ", bonusPerProjectUnderImplementation=" + bonusPerProjectUnderImplementation + "}";
    }
}


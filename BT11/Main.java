package BT11;

public class Main {
	public static void main(String[] args) {
		Employee x1 = new Employee("E01", "A", 500, 2.5);
		Developer x2 = new Developer("E02", "B", 500, 2.5, 69, 5.9);
		Designer x3 = new Designer("E03", "C", 500, 2.5, 10, 5, 15.9, 8.9);
		Manager x4 = new Manager("E04", "D", 500, 2.5, 0.4);
		System.out.println(x1);
		System.out.println("Actual salary: " + x1.calculateActualSalary());
		System.out.println();
		System.out.println(x2);
		System.out.println("Actual salary: " + x2.calculateActualSalary());
		System.out.println();
		System.out.println(x3);
		System.out.println("Actual salary: " + x3.calculateActualSalary());
		System.out.println();
		System.out.println(x4);
		System.out.println("Actual salary: " + x4.calculateActualSalary());
		}
}

package BT12;

public class Main {
	public static void main(String[] args) {
		Restaurant res = new Restaurant();
		System.out.println("Restaurant after initing:");
		res.showAllEmployees();
		System.out.println();
		res.addEmployee(new Employee("E01", "A", 80, 12.5, 17, 5.9));
		res.addEmployee(new Employee("E02", "B", 100, 12.5, 20, 5.9));
		res.addEmployee(new Chef("E03", "C", 110, 15, 25, 7, 3, 0.09));
		res.addEmployee(new Chef("E04", "D", 120, 16, 30, 7.5, 5, 0.09));
		res.addEmployee(new Waiter("E05", "E", 85, 13, 24, 6.5, 3.5, 200));
		res.addEmployee(new Waiter("E06", "F", 97, 13, 20, 6.5, 4.5, 200));
		res.addEmployee(new Manager("E07", "G", 130, 18.5, 34, 8.6, 0.55, 7.8, 10));
		res.addEmployee(new Employee("E01", "H", 70, 13, 15, 5.5));
		System.out.println("Restaurant after adding 7 employees:");
		res.showAllEmployees();
		System.out.println();
		System.out.println("Searching employee with id by E05:");
		System.out.println(res.searchEmployeeById("E05"));
		System.out.println();
		Employee employee = res.searchEmployeeById("E01");
		employee.setName("X");
		employee.setHourOfTimeserving(85);
		employee.setSalaryPerHourOfTimeserving(13);
		employee.setHourOfOvertime(20);
		employee.setBonusSalaryPerHourOfOvertime(5.5);
		res.updateEmployee(employee);
		Employee chef = res.searchEmployeeById("E03");
		chef.setName("X");
		chef.setHourOfTimeserving(115);
		chef.setSalaryPerHourOfTimeserving(16);
		chef.setHourOfOvertime(30);
		chef.setBonusSalaryPerHourOfOvertime(6.5);
		((Chef)chef).setNumberOfDishes(4);
		res.updateEmployee(chef);
		Employee waiter = res.searchEmployeeById("E05");
		waiter.setName("X");
		waiter.setHourOfTimeserving(90);
		waiter.setSalaryPerHourOfTimeserving(14);
		waiter.setHourOfOvertime(30);
		waiter.setBonusSalaryPerHourOfOvertime(6);
		((Waiter)waiter).setRating(4);
		res.updateEmployee(waiter);
		Employee manager = res.searchEmployeeById("E07");
		manager.setName("X");
		manager.setHourOfTimeserving(135);
		manager.setSalaryPerHourOfTimeserving(18);
		manager.setHourOfOvertime(36);
		manager.setBonusSalaryPerHourOfOvertime(8);
		((Manager)manager).setBonusRate(0.35);
		((Manager)manager).setKpiPoint(10);
		res.updateEmployee(manager);
		System.out.println("Restaurant after updating some employees:");
		res.showAllEmployees();
		System.out.println();
		res.removeEmployeeById("E01");
		System.out.println("Restaurant after remvoving employee has id by E01:");
		res.showAllEmployees();
		}
}

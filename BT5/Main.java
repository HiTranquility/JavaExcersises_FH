package BT5;

public class Main {
	public static void main(String[] args)
	{
		Employee emp = new Employee("S01", "Le", "Dao Tan", "Thanh", 29, 600, 2.5);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getSalary());
		System.out.println(emp.getCoefficientSalary());
		System.out.println(emp.getInfo());
		System.out.println();
		emp.setFirstName("Tran");
		System.out.println(emp.getName());
		System.out.println(emp.getInfo());
		emp.setMiddleName("Thi My");
		System.out.println(emp.getName());
		System.out.println(emp.getInfo());
		emp.setLastName("Anh");
		System.out.println(emp.getName());
		System.out.println(emp.getInfo());
		System.out.println();
		emp.setAge(20);
		System.out.println(emp.getAge());
		System.out.println(emp.getInfo());
		System.out.println();
		emp.setAge("01/05/2006");
		System.out.println(emp.getAge());
		System.out.println(emp.getInfo());
		System.out.println();
		emp.setSalary(500);
		System.out.println(emp.getSalary());
		System.out.println(emp.getInfo());
		System.out.println();
		emp.setCoefficientSalary(1.5);
		System.out.println(emp.getCoefficientSalary());
		System.out.println(emp.getSalary());
		System.out.println(emp.getInfo());
	}
}

package BT5;

public class Employee {
	private String id;
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private int salary;
	private double coefficientSalary;
	
	public Employee(String id, String firstName, String middleName, String lastName, int age, int salary, double coefficientSalary)
	{
		this.setId(id);
		this.setFirstName(firstName);
		this.setMiddleName(middleName);
		this.setLastName(lastName);
		this.setAge(age);
		this.setSalary(salary);
		this.setCoefficientSalary(coefficientSalary);
	}

	public double getCoefficientSalary() {
		return coefficientSalary;
	}

	public void setCoefficientSalary(double coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
        if (age >= 18) {  // Ensuring age is realistic for employment
            this.age = age;
        } else {
            System.out.println("Age must be 18 or older.");
        }
    }

    public void setAge(String birthDate) {
        // Convert birth date (in format "dd/MM/yyyy") to age for simplicity
        String[] parts = birthDate.split("/");
        int birthYear = Integer.parseInt(parts[2]);
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int calculatedAge = currentYear - birthYear;

        setAge(calculatedAge);
    }

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
	        return this.firstName + " " + this.middleName + " " + this.lastName;
	}

	public String getInfo() {
        return "ID: " + id + ", Name: " + getName() + ", Age: " + age + ", Salary: " + getSalary();
	}
	
}

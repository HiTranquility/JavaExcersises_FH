package BT12;

import java.util.ArrayList;
import java.util.Comparator;

public class Restaurant {
    private ArrayList<Employee> employeeList;

    // Constructor
    public Restaurant() {
        this.employeeList = new ArrayList<>();
    }

    // Add a new employee
    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    // Update an existing employee by matching their ID
    public void updateEmployee(Employee emp) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(emp.getId())) {
                employeeList.set(i, emp);
                return;
            }
        }
        System.out.println("Employee with ID " + emp.getId() + " not found.");
    }

    // Remove an employee by their ID
    public void removeEmployeeById(String id) {
        boolean removed = employeeList.removeIf(emp -> emp.getId().equals(id));
        if (!removed) {
            System.out.println("No employee found with ID " + id);
        }
    }

    // Display all employees
    public void showAllEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees in the restaurant.");
            return;
        }
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }

    // Search an employee by their ID
    public Employee searchEmployeeById(String id) {
        for (Employee emp : employeeList) {
            if (emp.getId().equals(id)) {
                return emp;
            }
        }
        System.out.println("No employee found with ID " + id);
        return null;
    }

    // Search employees with the role of Chef
    public ArrayList<Employee> searchEmployeeWithRoleByChef() {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee emp : employeeList) {
            if (emp instanceof Chef) {
                result.add(emp);
            }
        }
        return result;
    }

    // Search employees with the role of Waiter
    public ArrayList<Employee> searchEmployeeWithRoleByWaiter() {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee emp : employeeList) {
            if (emp instanceof Waiter) {
                result.add(emp);
            }
        }
        return result;
    }

    // Search employees with the role of Manager
    public ArrayList<Employee> searchEmployeeWithRoleByManager() {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee emp : employeeList) {
            if (emp instanceof Manager) {
                result.add(emp);
            }
        }
        return result;
    }

    // Sort employees by hours of timeserving (ascending)
    public void sortByHourOfTimeservingAscending() {
        employeeList.sort(Comparator.comparingInt(Employee::getHourOfTimeserving));
    }

    // Sort employees by actual salary (ascending)
    public void sortByActualSalaryAscending() {
        employeeList.sort(Comparator.comparingDouble(Employee::calculateActualSalary));
    }

    // Sort employees by ID (ascending)
    public void sortByIdAscending() {
        employeeList.sort(Comparator.comparing(Employee::getId));
    }
}

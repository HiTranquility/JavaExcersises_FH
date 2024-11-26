package BT4;

import java.util.ArrayList;

public class StudentManagement {
	public ArrayList<Student> studentList = new ArrayList<Student>();
	public StudentManagement()
	{
			
	}
	public void showAllStudents()
	{
		for (Student stu : studentList) {
			System.out.println(String.format("Student [id=%s name=%s age=%d]", stu.getId(), stu.getName(), stu.getAge()));
		}
	}
	public void addStudent(Student stu)
	{
		studentList.add(stu);
	}
	public void updateStudent (Student stu)
	{
		for (int i = 0; i < studentList.size();)
		{
			if (studentList.get(i).getId().equals(stu.getId()));
			{
				studentList.set(i, stu);
				return;
			}
		}
	}
	public void removeStudentById(String id) 
	{
		for (int i = 0; i < studentList.size();)
			if (studentList.get(i).getId().equals(id)) {
				studentList.remove(i);
			}
		  System.out.println("Student with ID " + id + " not found.");
	}
	public Student searchStudentById(String id)
	{
		for (Student stu : studentList) {
			if(stu.getId().equals(id)) {
				return stu;
			}
		}
		System.out.println("Student with ID " + id + " not found.");
		return null;
	}
}

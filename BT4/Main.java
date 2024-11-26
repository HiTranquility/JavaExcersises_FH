package BT4;

public class Main {
	public static void main(String[] args)
	{
		StudentManagement sm = new StudentManagement();
		System.out.println("StudentManagement after initing:");
		sm.showAllStudents();
		System.out.println();
		
		sm.addStudent(new Student("S01", "A", 21));
		sm.addStudent(new Student("S02", "B", 22));
		sm.addStudent(new Student("S03", "C", 23));
		sm.addStudent(new Student("S03", "D", 19));
		System.out.println("StudentManagement after adding 3 students:");
		sm.showAllStudents();
		System.out.println();
		System.out.println("Searching student with id by S01:");
		System.out.println(sm.searchStudentById("S01").getInfo());
		System.out.println();
		Student student = sm.searchStudentById("S02");
		student.setName("X");
		student.setAge(100);
		sm.updateStudent(student);
		System.out.println("StudentManagement after updating student has id by S02:");
		sm.showAllStudents();
		System.out.println();
		sm.removeStudentById("S02");
		System.out.println("StudentManagement after remvoving student has id by S02:");
		sm.showAllStudents();
	}
}

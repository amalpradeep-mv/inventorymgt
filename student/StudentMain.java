package student;

import java.util.*;

public class StudentMain {

	public static void main(String args[]) {
		StudentMain stud = new StudentMain();
		stud.StudentUi();
	}

	public void StudentUi() {

		Set<Student> student = new HashSet<>();
		Student s1 = new Student("1", 23);
		Student s2 = new Student("2", 20);
		Student s3 = new Student("3", 25);
		Student s4 = new Student("4", 19);
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		display(student);
	}

	public void display(Student student) {
		List<Student> age = new ArrayList<Student>();
		for (Student studnet : age)
			if (student.getAge() > 21) {
				System.out.println(age);
			}
	}
}

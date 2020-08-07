package student;

import java.util.*;

public class StudentMain {

	public static void main(String args[]) {
		StudentMain stud = new StudentMain();
		stud.StudentUi();

	}

	Set<Student> student = new HashSet<>();

	public void StudentUi() {
		student.add(new Student("1", 21));
		student.add(new Student("2", 23));
		student.add(new Student("3", 20));
		student.add(new Student("4", 21));

	}

	public List<Student> toList(Set<Student> set) {
		List<Student> list = new ArrayList<>();
		for (Student student : set)
			if (student.getAge() > 21) {
				list.add(student);
			}
		return list;

	}
}

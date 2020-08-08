package student.assignment;

import java.util.*;

public class StudentMain {
	Set<Student> set1 = new HashSet<>();
	Set<Student> set2 = new HashSet<>();

	public static void main(String args[]) {
		StudentMain main = new StudentMain();
		main.StudentUi();
	}

	Map<String, Student> map = new HashMap<>();

	public void StudentUi() {
		Student student1 = new Student("sam", 20);
		map.put("1", student1);
		Student student2 = new Student("john", 22);
		map.put("2", student2);
		Student student3 = new Student("krish", 19);
		map.put("3", student3);
		Student student4 = new Student("abdul", 21);
		map.put("4", student4);

	}

	public void display() {
		List<Student> list = new ArrayList<>();
		for (Student stud : list) {
			System.out.println(stud);
		}
		System.out.println("****Even age****");
		for (Student student : set1) {
			System.out.println("Rollno : " + student.getRollno() + "Age is " + student.getAge());
		}
		System.out.println("****Even age****");
		for (Student student : set2) {
			System.out.println("Rollno : " + student.getRollno() + "Age is " + student.getAge());
		}
	}

	public Set<Student> toSet(Map<String, Student> map) {

		Set<String> keys = map.keySet();
		for (String number : keys) {
			Student fetched = map.get(number);
			if (fetched.getAge() % 2 == 0) {
				set1.add(fetched);
				return set1;
			} else if (fetched.getAge() % 2 != 0) {
				set2.add(fetched);
			}
			display();

		}
		return set2;
	}
}

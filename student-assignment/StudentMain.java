package student.assignment;

import java.util.*;

public class StudentMain {

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
		for(Student stud:list) {
			System.out.println("Name : "+stud.getName()+"Rollno : "+stud.getRollno()+"Age is "+stud.getAge());
		}

	}

	public Set<Student> toSet(Map<String, Student> map) {
		Set<Student> set1 = new HashSet<>();
		Set<Student> set2 = new HashSet<>();
		for (Student number : set1)
			if (number.getAge() % 2 == 0) {
				set1.add(number);
				return set1;
			} else if (number.getAge() % 2 != 0) {
				set2.add(number);
			}
		return set2;
	}

}

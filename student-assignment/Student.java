package student.assignment;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Student {
	private String rollno;
	private String name;
	private int age;

	public Student(String name, String rollno, int age) {
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		int hash = rollno.hashCode();
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || !(obj instanceof Student)) {
			return false;
		}
		Student that = (Student) obj;
		boolean isEquals = this.rollno.equals(that.rollno);
		return isEquals;
	}

}



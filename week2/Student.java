package student;

public class Student {
	private String rollno;
	protected int age;

	Student(String rollno, int age) {
		this.rollno = rollno;
		this.age = age;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
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
	/*
	 * s1=new Student("1",21); s2=new Student("1",21; boolean equals=s1.equals(s2);
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null || !(obj instanceof Student)) {
			return false;
		}
		Student that = (Student) obj;
		boolean isequal = this.rollno.equals(that.rollno);
		return isequal;

	}
}

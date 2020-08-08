package traineeassignment;

public class Trainee {

	private String name;
	private int id;

	public Trainee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int hashCode(int id) {
		int hash = hashCode(id);
		return hash;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || obj instanceof Trainee) {
			return false;
		}
		Trainee that = (Trainee) obj;
		boolean isequals = this.id==that.id;
		return isequals;
	}
}

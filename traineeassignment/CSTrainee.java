package traineeassignment;

public class CSTrainee extends Trainee{

		private int language;
		
	public CSTrainee(String name, int id, int language) {
		super(name, id);
		this.language=language;
	}
	
	public int getLanguage() {
		return language;
	}

	
	public void setLanguage(int language) {
		this.language = language;
	}
	

}

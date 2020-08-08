package traineeassignment;

public class CSTrainee extends Trainee{

		private String language;
		
	public CSTrainee(String name, int id, String language) {
		super(name, id);
		this.language=language;
	}
	
	public String getLanguage() {
		return language;
	}

	
	public void setLanguage(String language) {
		this.language = language;
	}
	

}

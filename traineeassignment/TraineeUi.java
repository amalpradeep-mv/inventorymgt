package traineeassignment;

import java.util.*;

public class TraineeUi {

	Map<Integer, Trainee> map = new HashMap<>();
	Set<CSTrainee> csTrainee = new HashSet<>();
	Set<ECETrainee> eceTrainee = new HashSet<>();

	public static void main(String args[]) {
		TraineeUi ui = new TraineeUi();
		ui.runUi();
	}

	public void runUi() {
		Trainee cs1 = new CSTrainee("Sam", 2, "Java");
		map.put(cs1.getId(), cs1);
		Trainee cs2 = new CSTrainee("Krish", 3, "Python");
		map.put(cs2.getId(), cs2);
		Trainee ece1 = new ECETrainee("Dev", 4, "Multimeter");
		map.put(ece1.getId(), ece1);
		Trainee ece2 = new ECETrainee("Abdul", 5, "Ammeter");
		map.put(ece2.getId(), ece2);
		display();
	}

	public void display() {
		for (Trainee trainee : map.values()) {
			Trainee trainees = (Trainee) trainee;

			boolean csc = trainees instanceof CSTrainee;
			if (csc) {
				CSTrainee cs = (CSTrainee) trainee;
				csTrainee.add(cs);
				System.out.println("Name : " + cs.getName() + "Id : " + cs.getId() + "Language is " + cs.getLanguage());
			}
			boolean ece = trainees instanceof ECETrainee;
			if (ece) {
				ECETrainee ec = (ECETrainee) trainee;
				eceTrainee.add(ec);
				System.out.println("Name : " + ec.getName() + "Id : " + ec.getId() + "Device is " + ec.getDeviceUsed());
			}

		}
	}

}

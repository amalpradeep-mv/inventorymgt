package customer;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class CustomerMain {
	Map<String, Customer> info = new HashMap<>();

	public static void main(String args[]) {
		CustomerMain demo = new CustomerMain();
		demo.runApp();
	}

	public void runApp() {
		Account account1 = new Account(500, "CFD56");
		Account account2 = new Account(600, "FDG56");
		Account account3 = new Account(700, "OPI87");
		Account account4 = new Account(800, "POI45");

		BusinessCustomer busAdd1 = new BusinessCustomer("JOHN", "45", "Chennai", account1);
		BusinessCustomer busAdd2 = new BusinessCustomer("SAM", "90", "Delhi", account2);
		RegularCustomer regAdd1 = new RegularCustomer("KRISH", "15", "Goa", account3);
		RegularCustomer regAdd2 = new RegularCustomer("JACK", "55", "Mumbai", account4);

		info.put(busAdd1.getId(), busAdd1);
		info.put(busAdd2.getId(), busAdd2);
		info.put(regAdd1.getId(), regAdd1);
		info.put(regAdd2.getId(), regAdd2);
		displayAll();
	}

	public void displayAll() {
		Set<String> ids = info.keySet();
		for (String key : ids)
		{
			Customer current = info.get(key);
			boolean isRegular = current instanceof RegularCustomer;
			if (isRegular) {
				RegularCustomer regular = (RegularCustomer) current;
				display(regular);
			}
			boolean isBusiness = current instanceof BusinessCustomer;
			if (isBusiness) {
				BusinessCustomer business = (BusinessCustomer) current;
				display(business);
			}

		}
	}

	public void display(BusinessCustomer business) {
		String name = business.getName();
		String id = business.getId();
		Account acc = business.getAccount();
		String businessAddress = business.getBusinessAddress();
		System.out.println("Business Customer");
		System.out.println("Name is " + name + ". ID is : " + id + ". Office address is " + businessAddress);
		System.out.println("Balance is " + acc.getBalance() + "Pancard number is" + acc.getPancard()+"\n");
	}

	public void display(RegularCustomer regular) {
		String name = regular.getName();
		String id = regular.getId();
		Account acc = regular.getAccount();
		String homeAddress = regular.getHomeAddress();
		System.out.println("Regular Customer");
		System.out.println("Name is " + name + ". ID is : " + id + ". Home address is " + homeAddress);
		System.out.println("Balance is " + acc.getBalance() + "Pancard number is" + acc.getPancard()+"\n");
	}
}
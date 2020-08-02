package customer;

public class RegularCustomer extends Customer {
	
	private String homeAddress;
	
	public RegularCustomer(String name, String id, String homeAddress, Account account) {
		super(name,id,account);
		this.homeAddress=homeAddress;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
}

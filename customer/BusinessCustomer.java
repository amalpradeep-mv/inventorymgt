package customer;

public class BusinessCustomer extends Customer {
private String BusinessAddress;
	
	public BusinessCustomer(String name, String id, String BusinessAddress, Account account) {
		super(name,id,account);
		this.BusinessAddress=BusinessAddress;
	}

	public String getBusinessAddress() {
		return BusinessAddress;
	}

	public void setBusinessAddres(String businessAddress) {
		this.BusinessAddress = BusinessAddress;
	}

}

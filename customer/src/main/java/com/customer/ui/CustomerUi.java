package com.customer.ui;

import com.customer.dao.*;
import com.customer.entities.*;
import com.customer.exceptions.*;
import com.customer.service.*;
import java.util.*;

public class CustomerUi {

	private ICustomerService service = new CustomerServiceImpl();

	public static void main(String args[]) {
		CustomerUi ui = new CustomerUi();
		ui.runApp();
	}

	public void runApp() {
		try {

			Account account1 = new Account(100, "ASD234");
			Account account2 = new Account(200, "BDF354");
			Account account3 = new Account(300, "NHG567");
			Account account4 = new Account(400, "MLK098");

			BusinessCustomer busCustomer1 = new BusinessCustomer("John", "1", "Chennai", account1);
			service.add(busCustomer1);
			String id1 = busCustomer1.getId();

			BusinessCustomer busCustomer2 = new BusinessCustomer("Sam", "2", "Hyderabad", account2);
			service.add(busCustomer2);
			String id2 = busCustomer2.getId();

			RegularCustomer regCustomer1 = new RegularCustomer("Krish", "3", "Delhi", account3);
			service.add(regCustomer1);
			String id3 = regCustomer1.getId();

			RegularCustomer regCustomer2 = new RegularCustomer("Dev", "4", "Mumbai", account4);
			service.add(regCustomer2);
			String id4 = regCustomer2.getId();
		} catch (InvalidArgumentException e) {
			e.printStackTrace();
			System.out.println("Invalid argument!");
		} catch (CustomerNotFoundException e) {
			e.printStackTrace();
			System.out.println("Customer not found!");
		}
	}

	public void displayAll() {
		List<Customer> list = service.findAll();
		for (Customer customer : list) {
			display(customer);
		}
	}

	public void display(Customer customer) {
		System.out.println("----Customer-----");
		System.out.println("Name : " + customer.getName() + "Id : " + customer.getId() + "\n");

		Account account = customer.getAccount();
		System.out.println("Balance is " + account.getBalance() + "Panacard number is " + account.getPancard() + "\n");

		if (customer instanceof RegularCustomer) {
			RegularCustomer regCus = (RegularCustomer) customer;
			System.out.println("Home Address : " + regCus.getHomeAddress());
		}
		if (customer instanceof BusinessCustomer) {
			BusinessCustomer busCus = (BusinessCustomer) customer;
			System.out.println("Office Address : " + busCus.getBusinessAddress());
		}
	}

}

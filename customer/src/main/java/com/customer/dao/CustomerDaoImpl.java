package com.customer.dao;

import com.customer.entities.*;
import com.customer.exceptions.*;
import java.util.*;

import com.customer.entities.Customer;

public class CustomerDaoImpl implements ICustomerDao {
	private Map<String, Customer> info = new HashMap();

	private int generateId;

	String generateId() {
		generateId++;
		String idStr = "" + generateId();
		return idStr;
	}

	@Override
	public Customer findById(String id) {
		boolean exists = info.containsKey(id);
		if (!exists) {
			throw new CustomerNotFoundException("Customer Bot Found for id= " + id);
		}
		Customer customer = info.get(id);
		return customer;
	}

	@Override
	public void add(Customer customer) {
		String id = generateId();
		info.put(id, customer);
		customer.setId(id);

	}

	@Override
	public void delete(String id) {
		info.remove(id);

	}

	@Override
	public List<Customer> findAll() {
		Collection<Customer> collection = info.values();
		List<Customer> list = new ArrayList();
		for (Customer customer : collection) {
			list.add(customer);
		}
		return list;
	}

	@Override
	public Customer updateName(String id, String name) {
		Customer customer = findById(id);
		customer.setName(name);
		return customer;
	}

}
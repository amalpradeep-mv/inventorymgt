package com.customer.service;

import com.customer.entities.*;
import com.customer.exceptions.*;
import com.customer.dao.*;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {

	private ICustomerDao dao = new CustomerDaoImpl();

	@Override
	public List<Customer> findAll() {
		List<Customer> list = dao.findAll();
		return list;
	}

	@Override
	public void delete(String id) {
		dao.delete(id);

	}

	@Override
	public void add(Customer customer) {
		dao.add(customer);

	}

	@Override
	public Customer findById(String id) {
		Customer customer = dao.findById(id);
		return customer;
	}

	@Override
	public Customer updateName(String id, String name) {
		Customer customer = dao.updateName(id, name);
		return customer;

	}

}

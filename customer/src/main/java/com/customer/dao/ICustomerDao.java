package com.customer.dao;

import java.util.List;
import com.customer.entities.*;

public interface ICustomerDao {

	List<Customer> findAll();

	Customer findById(String id);

	void add(Customer customer);

	void delete(String id);

	Customer updateName(String id, String name);

}

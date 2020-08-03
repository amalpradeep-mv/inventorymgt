package com.customer.service;

import com.customer.entities.*;
import java.util.*;

public interface ICustomerService {

	List<Customer> findAll();

	void delete(String id);

	void add(Customer customer);

	Customer findById(String id);

	Customer updateName(String id, String name);
}

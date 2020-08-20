package com.dxctraining.inventorymgt_mvc.sprint7_phone.service;

import java.util.List;

import com.dxctraining.inventorymgt_mvc.sprint7_phone.entities.Phone;

public interface IPhoneService {
	
	void validate(Object arg);
	
	Phone save(Phone phone);
	
	Phone findPhoneById(int id);

	Phone remove(int id);

	List<Phone> allPhones();
}

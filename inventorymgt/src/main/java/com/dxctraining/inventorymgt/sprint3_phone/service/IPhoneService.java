package com.dxctraining.inventorymgt.sprint3_phone.service;

import com.dxctraining.inventorymgt.sprint3_phone.entities.Phone;

public interface IPhoneService {
	
	void validate(Object arg);
	
	Phone save(Phone phone);
	
	Phone findPhoneById(int id);

	Phone remove(int id);
}

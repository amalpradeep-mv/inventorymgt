package com.dxctraining.inventorymgt.sprint3_phone.service;

import com.dxctraining.inventorymgt.sprint3_phone.entities.Phone;

public interface IPhoneService {
	void validate(int id);
	
	void validate(Phone phone);
	
	Phone save(Phone phone);

	Phone update(Phone phone);

	Phone findPhoneById(int id);

	Phone findPhoneByName(String pname);

	Phone remove(int id);
}

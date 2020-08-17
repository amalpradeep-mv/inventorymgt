package com.dxctraining.inventorymgt.sprint3_phone.dao;

import com.dxctraining.inventorymgt.sprint3_phone.entities.Phone;

public interface IPhoneDao {

	Phone save(Phone phone);

	Phone update(Phone phone);

	Phone findPhoneById(int id);

	Phone findPhoneByName(String pname);

	Phone remove(int id);
}

package com.dxctraining.inventorymgt_mvc.sprint7_phone.dao;

import java.util.List;

import com.dxctraining.inventorymgt_mvc.sprint7_phone.entities.Phone;

public interface IPhoneDao {

	Phone save(Phone phone);

	Phone findPhoneById(int id);

	Phone remove(int id);

	List<Phone> allPhones();
}
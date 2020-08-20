package com.dxctraining.inventorymgt_mvc.phone.dao;

import java.util.List;

import com.dxctraining.inventorymgt_mvc.phone.entities.Phone;

public interface IPhoneDao {

	Phone save(Phone phone);

	Phone findPhoneById(int id);

	Phone remove(int id);

	List<Phone> allPhones();
}
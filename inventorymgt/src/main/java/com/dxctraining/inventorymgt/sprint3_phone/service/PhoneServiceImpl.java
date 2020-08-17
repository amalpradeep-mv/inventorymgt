package com.dxctraining.inventorymgt.sprint3_phone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.inventorymgt.sprint3_phone.dao.IPhoneDao;
import com.dxctraining.inventorymgt.sprint3_phone.entities.Phone;
import com.dxctraining.inventorymgt.sprint3_phone.exception.InvalidArgumentException;

@Transactional
@Service
public class PhoneServiceImpl implements IPhoneService {

	@Autowired
	private IPhoneDao phoneDao;

	@Override
	public void validate(Object arg) {
		if (arg == null) {
			throw new InvalidArgumentException("Argument is null");
		}
	}


	@Override
	public Phone save(Phone phone) {
		validate(phone);
		phoneDao.save(phone);
		return phone;
	}

	@Override
	public Phone findPhoneById(int id) {
		validate(id);
		Phone phone = phoneDao.findPhoneById(id);
		return phone;
	}

	@Override
	public Phone remove(int id) {
		validate(id);
		Phone phone = phoneDao.remove(id);
		return phone;
	}

}

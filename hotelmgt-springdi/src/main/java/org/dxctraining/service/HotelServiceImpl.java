package org.dxctraining.service;

import java.util.List;

import org.dxctraining.dao.*;
import org.dxctraining.entities.Guest;
import org.dxctraining.exception.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelDao dao ;

	@Override
	public void validateId(String id) {
		if (id == null || id.isEmpty()) {
			throw new InvalidArgumentException("Id cannot be negative");
		}
	}

	@Override
	public void validateName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidArgumentException("Name cannot be empty");
		}
	}

	@Override
	public Guest findById(String id) {
		validateId(id);
		Guest guest = dao.findById(id);
		return guest;
	}

	@Override
	public List<Guest> findAll() {
		List<Guest> list = dao.findAll();
		return list;

	}

	@Override
	public void remove(String id) {
		validateId(id);
		dao.remove(id);
	}

	@Override
	public List<Guest> guestList() {
		List<Guest> list = dao.findAll();
		return list;
	}

	public void register(Guest guest) {
		dao.register(guest);
	}

	@Override
	public Guest updateGuest(String newName, String id) {
		validateName(newName);
		validateId(id);
		return null;
	}

}

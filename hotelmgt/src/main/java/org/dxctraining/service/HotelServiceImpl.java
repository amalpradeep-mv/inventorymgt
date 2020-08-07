package org.dxctraining.service;

import java.util.List;

import org.dxctraining.dao.*;
import org.dxctraining.entities.Guest;
import org.dxctraining.exception.*;

public class HotelServiceImpl implements IHotelService {

	private IHotelDao dao = new HotelDaoImpl();

	public void checkId(String id) {
		if (id == null || id.isEmpty()) {
			throw new InvalidArgumentException("Id cannot be negative");
		}
	}

	public void checkName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidArgumentException("Name cannot be empty");
		}
	}

	@Override
	public Guest findById(String id) {
		checkId(id);
		Guest guest=dao.findById(id);
		return guest;
	}

	@Override
	public  void remove(String id) {
		checkId(id);
		dao.remove(id);
}

	@Override
	public List<Guest> guestList() {
		List<Guest> list=dao.findById(id);
		return list;
	}
	
	public void register(Guest guest) {
		checkName(name);
		checkId(id);
		dao.register(guest);
	}

	@Override
	public Guest updateGuest(String newName, String id) {
		checkName(newName);
		checkId(id);
		return null;
	}

}

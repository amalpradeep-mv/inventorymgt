package org.dxctraining.dao;

import java.util.*;

import org.dxctraining.entities.*;
import org.dxctraining.exception.*;

public class HotelDaoImpl implements IHotelDao {

		private int generatedId;
		
		 int generateId() {
			 generatedId++;
		String isId=""+generateId();
			return generatedId;
			
		}
		
	Map<String, Guest> map = new HashMap<>();

	@Override
	public Guest findById(String id) {
		Guest guest = map.get(id);
		if (guest == null) {
			throw new GuestNotFoundException("Guest id is not found" + id);
		}
		return guest;
	}

	@Override
	public  void remove(String id) {
		map.remove(id);

	}

	@Override
	public void register(Guest guest) {
		String name = guest.getName();
		String id = guest.getId();
		map.put(id, guest);
		map.get(id);

	}

	@Override
	public List<Guest> guestList() {
		Collection<Guest> collection = map.values();
		List<Guest> list = new ArrayList<>();
		for (Guest guest : list) {
			list.add(guest);
		}
		return list;
	}

	@Override
	public Guest updateGuest(String newName, String id) {
		Guest guest = findById(id);
		guest.setName(newName);
		return guest;
	}

}

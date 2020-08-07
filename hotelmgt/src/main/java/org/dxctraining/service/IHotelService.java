package org.dxctraining.service;

import java.util.List;

import org.dxctraining.entities.Guest;

public interface IHotelService {

	public Guest findById(String id);

	 void remove(String id);

	public List<Guest> guestList();
	
	public Guest updateGuest(String newName, String id);

	void checkId(String id);

	public void register(Guest guest);

	
}

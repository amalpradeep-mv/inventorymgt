package org.dxctraining.dao;

import java.util.*;

import org.dxctraining.entities.*;

public interface IHotelDao {
	public Guest findById(String id);

	 void remove(String id);

	public void register(Guest guest);

	public List<Guest> guestList();
	
	public Guest updateGuest(String newName, String id);

	public List<Guest> findAll();

	
}

package org.dxctraining.ui;

import java.util.*;

import org.dxctraining.JavaConfig;
import org.dxctraining.entities.*;
import org.dxctraining.exception.*;
import org.dxctraining.service.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class HotelUi {
	@Autowired
	private IHotelService service ;

	public static void main (String args[]) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
		context.register(JavaConfig.class);
		context.refresh();
	}

	public void runUi() {
		try {
			Guest guest1 = new Guest("Vikram", "DFGTE2");
			Guest guest2 = new Guest("Ajith", "HJDOT5");
			Guest guest3 = new Guest("Surya", "LKSFD6");
			Guest guest4 = new Guest("Vijay", "UYFDV8");
			service.register(guest1);
			service.register(guest2);
			service.register(guest3);
			service.register(guest4);
			
			RoyalGuest royalGuest1 = new RoyalGuest("Amal", "TF7", "Chennai");
			RoyalGuest royalGuest2 = new RoyalGuest("Kalam", "YU2", "Chennai");
			service.register(royalGuest1);
			service.register(royalGuest2);

		} catch (InvalidArgumentException e) {
			e.printStackTrace();
		} catch (GuestNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void displayAll() {
		List<Guest> list = service.findAll();
		for (Guest guest : list) {
			list.add(guest);
			display(guest);
		}
	}

	public void display(Guest guest) {
		System.out.println("----Guest Details----");
		System.out.println("Name is " + guest.getName() + "Id is " + guest.getId() + "\n");

		if (guest instanceof RoyalGuest) {
			RoyalGuest royal = (RoyalGuest) guest;
			System.out.println("----Royal Guests----");
			System.out.println("Name is " + royal.getName() + " Id is " + royal.getId() + " Address is " + royal.getAddress());
		}
	}
}

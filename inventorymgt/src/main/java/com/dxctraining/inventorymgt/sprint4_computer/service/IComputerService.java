package com.dxctraining.inventorymgt.sprint4_computer.service;

import com.dxctraining.inventorymgt.sprint4_computer.entities.Computer;

public interface IComputerService {
	
	void validate(Object obj);
	
	Computer save(Computer computer);

	Computer findComputerById(int id);

	Computer remove(int id);

}

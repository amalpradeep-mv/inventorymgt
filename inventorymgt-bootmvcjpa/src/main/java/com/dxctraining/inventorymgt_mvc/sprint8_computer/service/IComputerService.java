package com.dxctraining.inventorymgt_mvc.sprint8_computer.service;

import java.util.List;

import com.dxctraining.inventorymgt_mvc.sprint8_computer.entities.Computer;

public interface IComputerService {
	
	void validate(Object obj);
	
	Computer save(Computer computer);

	Computer findComputerById(int id);

	Computer remove(int id);

	List<Computer> allComputers();

}

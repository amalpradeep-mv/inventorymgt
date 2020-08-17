package com.dxctraining.inventorymgt.sprint4_computer.dao;

import com.dxctraining.inventorymgt.sprint4_computer.entities.Computer;

public interface IComputerDao {
	
	Computer save(Computer computer);

	Computer findComputerById(int id);

	Computer remove(int id);
}

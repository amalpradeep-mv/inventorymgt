package com.dxctraining.inventorymgt_mvc.computer.dao;

import java.util.List;

import com.dxctraining.inventorymgt_mvc.computer.entities.Computer;

public interface IComputerDao {
	
	Computer save(Computer computer);

	Computer findComputerById(int id);

	Computer remove(int id);

	List<Computer> allComputers();
}

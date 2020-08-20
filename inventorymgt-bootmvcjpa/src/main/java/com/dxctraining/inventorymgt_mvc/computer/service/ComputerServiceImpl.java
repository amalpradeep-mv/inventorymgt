package com.dxctraining.inventorymgt_mvc.computer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.inventorymgt_mvc.computer.dao.IComputerDao;
import com.dxctraining.inventorymgt_mvc.computer.entities.Computer;
import com.dxctraining.inventorymgt_mvc.exception.*;

@Transactional
@Service
public class ComputerServiceImpl implements IComputerService {

	@Autowired
	private IComputerDao compDao;

	@Override
	public void validate(Object obj) {
		if (obj == null) {
			throw new InvalidArgumentException("Argument is null");
		}
	}

	@Override
	public Computer save(Computer computer) {
		validate(computer);
		compDao.save(computer);
		return computer;
	}

	@Override
	public Computer findComputerById(int id) {
		validate(id);
		Computer computer = compDao.findComputerById(id);
		return computer;
	}

	@Override
	public Computer remove(int id) {
		validate(id);
		Computer computer = compDao.remove(id);
		return computer;
	}
	@Override
	public List<Computer> allComputers() {
		List<Computer> allcomputers = compDao.allComputers();
		return allcomputers;
	}
}

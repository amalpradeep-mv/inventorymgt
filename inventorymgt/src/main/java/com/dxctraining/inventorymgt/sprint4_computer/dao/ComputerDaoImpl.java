package com.dxctraining.inventorymgt.sprint4_computer.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import com.dxctraining.inventorymgt.sprint4_computer.entities.Computer;
import com.dxctraining.inventorymgt.sprint4_computer.exception.ComputerNotFoundException;

@Repository
public class ComputerDaoImpl implements IComputerDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Computer save(Computer computer) {
		em.persist(computer);
		return computer;
	}
	
	@Override
	public Computer findComputerById(int id) {
		Computer computer = em.find(Computer.class, id);
		if (computer == null) {
			throw new ComputerNotFoundException("Computer not found");
		}
		return computer;
	}

	@Override
	public Computer remove(int id) {
		Computer computer = findComputerById(id);
		em.remove(computer);
		return computer;
	}

}

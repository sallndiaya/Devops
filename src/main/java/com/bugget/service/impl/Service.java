package com.bugget.service.impl;

import com.bugget.dao.IDao;
import com.bugget.dao.impl.HibernateDao;
import com.bugget.entities.Budget;
import com.bugget.entities.Depense;
import com.bugget.entities.User;
import com.bugget.exceptions.DAOException;
import com.bugget.service.IService;

public class Service implements IService {

	private static IDao dao = HibernateDao.getCurrentInstance();
	private static IService instance = new Service();

	private Service() {}

	public static IService getCurrentInstance() {
		return instance;
	}
	
	@Override
	public boolean creerCompte(User user) {
		try {
			dao.save(user);
			return true;
		} catch (DAOException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public User authenticate(User user) {
		return null;
	}

	@Override
	public boolean creerBudget(Budget budget) {
		return false;
	}

	@Override
	public boolean creerDepense(Depense depense) {
		return false;
	}

	@Override
	public boolean modifierBudget(Budget budget) {
		// TODO Auto-generated method stub
		return false;
	}

}

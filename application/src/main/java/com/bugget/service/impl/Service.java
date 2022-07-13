package com.bugget.service.impl;

import com.bugget.dao.IDao;
import com.bugget.dao.impl.HibernateDao;
import com.bugget.entities.User;
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
			dao.save(user);
			return true;
	}

	@Override
	public User authenticate(User user) {
		return null;
	}

	
}
package com.bugget.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bugget.dao.IDao;
import com.bugget.dao.impl.HibernateDao;
import com.bugget.entities.Depense;
import com.bugget.entities.User;
import com.bugget.service.IService;

public class Service implements IService {

	public final static Logger logger = LogManager.getLogger(Service.class);
	
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

	@Override
	public boolean creerDepense(Depense depense) {
		dao.save(depense);
		return true;
	}

	@Override
	public List<Depense> listerDepenses() {
		List<Object> objects = dao.list (new Depense());
		List<Depense> depenses = new ArrayList<> ();
		for (Object obj : objects) {
			if  (obj instanceof Depense) {
				depenses.add ( (Depense) obj);
			}
			logger.info("info Depense {}", depenses);
		}
		return depenses;	
	}

	
}
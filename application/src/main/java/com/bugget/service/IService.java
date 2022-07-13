package com.bugget.service;

import java.util.List;

import com.bugget.entities.Depense;
import com.bugget.entities.User;

public interface IService {
		
	boolean creerCompte (User user);
	User authenticate(User user);
	boolean creerDepense(Depense depense);
	List<Depense> listerDepenses();
}

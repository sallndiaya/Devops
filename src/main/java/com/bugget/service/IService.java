package com.bugget.service;

import com.bugget.entities.Budget;
import com.bugget.entities.Depense;
import com.bugget.entities.User;

public interface IService {
		
	boolean creerCompte (User user);
	User authenticate(User user);
	boolean creerBudget (Budget budget);
	boolean creerDepense (Depense depense);
	boolean modifierBudget (Budget budget);
}

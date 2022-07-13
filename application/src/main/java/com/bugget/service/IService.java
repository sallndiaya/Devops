package com.bugget.service;

import com.bugget.entities.User;

public interface IService {
		
	boolean creerCompte (User user);
	User authenticate(User user);
}

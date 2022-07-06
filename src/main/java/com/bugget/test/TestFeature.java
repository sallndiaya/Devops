package com.bugget.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import com.bugget.entities.User;
import com.bugget.service.IService;
import com.bugget.service.impl.Service;

class TestFeature {

	private IService service = Service.getCurrentInstance();
	
	@Test
	void test() {
		boolean resultat = service.creerCompte(new User("Dicko", "Fatoumata", "anna25", "annasdickou257@gmail.com"));
		assertEquals(true , resultat);
	}

}

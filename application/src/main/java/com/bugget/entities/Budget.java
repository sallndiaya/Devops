package com.bugget.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Budget {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private double somme , bonus;
	private String mois;
	
	public Budget(double somme, String mois) {
		this.somme = somme;
		this.mois = mois;
	}
	
	
}

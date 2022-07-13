package com.bugget.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Depense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String categorie;
	private double montant;
	
	@Column(columnDefinition = "TEXT")
	private String description;

	public Depense(String categorie, double montant, String description) {
		this.categorie = categorie;
		this.montant = montant;
		this.description = description;
	}

}

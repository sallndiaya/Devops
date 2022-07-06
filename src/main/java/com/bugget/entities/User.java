package com.bugget.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nom , prenom , password;
	
	@Column(unique = true)
	private String email;
	
	@OneToOne(targetEntity = Budget.class , cascade = CascadeType.ALL)
	@JoinColumn(name = "id_budget")
	private Budget budget;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_depense")
	private List<Depense> depenses = new ArrayList<>();
	
	public User(String nom, String prenom, String password, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.email = email;
	}
	
	
	
	public void addDepense(Depense depense) {
		this.depenses.add(depense);
	}



}

package com.bugget.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nom , prenom , password;
	
	@Column(unique = true)
	private String email;
	

	
	public User(String nom, String prenom, String password, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.email = email;
	}
	
	
	


}

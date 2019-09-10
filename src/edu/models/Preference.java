package edu.models;

import java.util.Arrays;
import java.util.List;

public class Preference {

	private String nom;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Object getValeur() {
		return valeur;
	}
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	private Object valeur;
	
	
	public Preference(String nom, Object valeur) {
		super();
		this.nom = nom;
		this.valeur = valeur;
	}
	
	
	/*
	 * Methodes 
	 */
	
 public static List<Preference> getDefault() {
	return Arrays.asList(new Preference("admin",true),new Preference("bgColor","Black"));
 
 }
	
	
}

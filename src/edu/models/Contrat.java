package edu.models;

import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

public class Contrat {

	
	private String code;
	private Date dates;
	private UtilisateurC Utilisateur;
	
	public String getCode() {return code;}

	public void setCode(String code) {this.code = code;}

	public Date getDates() {return dates;}

	public void setDates(Date dates) {this.dates = dates;}

	public UtilisateurC getUtilisateur() {return Utilisateur;}

	public void setUtilisateur(UtilisateurC utilisateur) {Utilisateur = utilisateur;}

	
	
	public Contrat(UtilisateurC utilisateur) {
		this.Utilisateur=utilisateur;
		this.dates= new Date();
		code=UUID.randomUUID().toString();
		
	}

	@Override
	public String toString() {
		return "Contrat [code=" + code + ", dates=" + DateFormat.getDateInstance(DateFormat.FULL).format(this.dates).toString() + "]";
	}
	
	
	
}

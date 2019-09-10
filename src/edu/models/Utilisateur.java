package edu.models;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import edu.Test.Application;

/**
 * @author theomarie
 *
 */
/**
 * @author theomarie
 *
 */
/**
 * @author theomarie
 *
 */
public class Utilisateur {
	private String prenom;
	private String nom;
	private int age;
	private Preferences prefs;
	private List<Groupe> groupes;
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return nom + connexions + prefs;
	}

	public List<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}

	public List<Connexion> getConnexions() {
		return connexions;
	}

	public void setConnexions(List<Connexion> connexions) {
		this.connexions = connexions;
	}
	



	

	


	private List<Connexion> connexions;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 0 && age < 100) {
			this.age = age;
		}
	}

	
	
	public Utilisateur(String nom) {
		super();
		this.nom = nom;
		this.prenom = "";
		this.age = 0;
		this.connexions = new ArrayList<Connexion>();
		this.groupes = new ArrayList<Groupe>();
		prefs=Preferences.getDefault();
	}
	
	
	/**
	 * @Méthode ajout d'un Objet Connexion a la liste connexions
	 * 
	 */
	
	public void postLogin() {
		try {
			this.connexions.add(new Connexion(this));
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean addToGroupe(String nomGroupe) {
		for (Groupe group : Application.instance.getListGroupes()) {
			if(group.getNom().equals(nomGroupe) && !this.groupes.contains(group)) {
				this.groupes.add(group);
				return true;
			};
		}
		return false;
	}
	
	
	

}

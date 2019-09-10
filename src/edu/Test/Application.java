package edu.Test;

import java.util.ArrayList;
import java.util.List;

import edu.models.Groupe;
import edu.models.Utilisateur;



public class Application {

	public static Application instance; 
	private List<Groupe> listGroupes;
	
	public List<Groupe> getListGroupes() {
		return listGroupes;
	}

	public void setListGroupes(List<Groupe> listGroupes) {
		this.listGroupes = listGroupes;
	}

	private List<Utilisateur> listUtilisateurs;
	
	public Application() {
		super();
		this.listGroupes = new ArrayList<Groupe>();
		this.listUtilisateurs = new ArrayList<Utilisateur>();
	}
	
	public static Application create(){
		instance = new Application();
		
		instance.addUser("zorro","pokemon");
		instance.addGroupe("Animaux","hero","Mechant");
		return instance;
	}

	private void addUser(String...userName) {
		for (String string : userName) {
			listUtilisateurs.add(new Utilisateur(string));
		}
		
	}

	private void addGroupe(String...nomGroupe) {
		for (String string : nomGroupe) {
			listGroupes.add(new Groupe(string));
		}
	}
	
	
	
}

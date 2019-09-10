package edu.models;

public class UtilisateurC extends Utilisateur {
	
	private Contrat contrat;
	
	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public UtilisateurC(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	public void addContrat() {
		contrat=new Contrat(this);
	}

	@Override
	public String toString() {
		return super.toString()+contrat;
	}
	
	
}

package edu.models;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class Connexion {
	
	private Date date;
	private String ip;
	public Connexion(Utilisateur utilisateur) throws UnknownHostException {
		super();
		this.date = new Date();
		this.ip = InetAddress.getLocalHost().toString();
	}
	
	
	
}

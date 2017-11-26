package fr.GestionLoc.model;

import java.util.Date;

public class Client {

	private String pseudo;
	private String nom;
	private String prenom;
	private Date date_naissance;
	private String sexe;
	
	public Client(String pseudo, String nom, String prenom, Date date_naissance, String sexe) {
		super();
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		this.sexe = sexe;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
}

package fr.GestionLoc.model;

import java.util.Date;

public class Location {

	private Client client;
	private Voiture voiture;
	private Date date_debut;
	private Date date_fin;
	private Integer cout;
	
	public Location(Client client, Voiture voiture, Date date_debut, Date date_fin, Integer cout) {
		this.client = client;
		this.voiture = voiture;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.cout = cout;
	}
	
	
	public Client getclient() {
		return client;
	}
	public void setId_client(Client client) {
		this.client = client;
	}
	public Voiture getvoiture() {
		return voiture;
	}
	public void setId_voiture(Voiture voiture) {
		this.voiture = voiture;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	public Integer getCout() {
		return cout;
	}
	public void setCout(Integer cout) {
		this.cout = cout;
	}
}

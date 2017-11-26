package fr.GestionLoc.model;

public class Vehicule {
	
	protected Integer id_vehicule;
	protected String marque;
	protected String modele;
	protected Integer cout;
	protected String couleur;
	
	public Integer getId_vehicule() {
		return id_vehicule;
	}
	public void setId_vehicule(Integer id_vehicule) {
		this.id_vehicule = id_vehicule;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public Integer getCout() {
		return cout;
	}
	public void setCout(Integer cout) {
		this.cout = cout;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

}

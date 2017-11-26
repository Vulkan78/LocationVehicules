package fr.GestionLoc.model;

public class Voiture extends Vehicule {

	private Integer nb_place;

	public Voiture(Integer id, String marque, String modele, Integer cout, String couleur, Integer places) {
		this.id_vehicule = id;
		this.marque = marque;
		this.modele = modele;
		this.cout = cout;
		this.couleur = couleur;
		this.nb_place = places;
	}
	
	public Integer getNb_place() {
		return nb_place;
	}

	public void setNb_place(Integer nb_place) {
		this.nb_place = nb_place;
	}

	@Override
	public String toString() {
		return "Voiture [nb_place=" + nb_place + ", id_vehicule=" + id_vehicule + ", marque=" + marque + ", modele="
				+ modele + ", cout=" + cout + ", couleur=" + couleur + "]";
	}
	
}

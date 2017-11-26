package fr.GestionLoc.model;

public class Moto extends Vehicule {

	private String cylindree;
	
	public Moto(Integer id, String marque, String modele, Integer cout, String couleur, String cylindree) {
		this.id_vehicule = id;
		this.marque = marque;
		this.modele = modele;
		this.cout = cout;
		this.couleur = couleur;
		this.setCylindree(cylindree);
	}

	public String getCylindree() {
		return cylindree;
	}

	public void setCylindree(String cylindree) {
		this.cylindree = cylindree;
	}

	@Override
	public String toString() {
		return "Moto [cylindree=" + cylindree + ", id_vehicule=" + id_vehicule + ", marque=" + marque + ", modele="
				+ modele + ", cout=" + cout + ", couleur=" + couleur + "]";
	}
}

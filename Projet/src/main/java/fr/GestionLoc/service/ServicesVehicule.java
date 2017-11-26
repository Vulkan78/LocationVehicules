package fr.GestionLoc.service;

import fr.GestionLoc.model.Moto;
import fr.GestionLoc.model.Vehicule;
import fr.GestionLoc.model.Voiture;

public class ServicesVehicule {
	
	
	public void ajouterVehicule(Vehicule vehicule) {

		String marque = vehicule.getMarque();
		String modele = vehicule.getModele();
		Integer cout = vehicule.getCout();
		String couleur = vehicule.getCouleur();
		if (vehicule instanceof Voiture) {
			Integer nb_place = ((Voiture) vehicule).getNb_place();
			final String sql = "INSERT INTO voiture (marque, modele, cout, couleur, nb_place) VALUES ('"
					+ marque + "','" + modele + "','" + cout + "','" + couleur + "','" + nb_place +"')";
			new ServicesDB();
			ServicesDB.traitementSql(sql);
			System.out.println("Nouvelle voiture en location : " + vehicule.toString());
		}
		else {
			String cylindree = ((Moto) vehicule).getCylindree();
			final String sql = "INSERT INTO moto (marque, modele, cout, couleur, cylindree) VALUES ('"
					+ marque + "','" + modele + "','" + cout + "','" + couleur + "','" + cylindree +"')";
			new ServicesDB();
			ServicesDB.traitementSql(sql);
			System.out.println("Nouvelle moto en location : " + vehicule.toString());
		}
		
	}
	
	public void supprimerVehicule(String[] tab) {
		final String type = tab[0];
		final String id_tmp = tab[1];
		final Integer id = Integer.parseInt(id_tmp);
		if (type.equals("Voiture")) {
			final String sql = "DELETE FROM voiture where id = '" + id +"'";
			new ServicesDB();
			ServicesDB.traitementSql(sql);
			System.out.println("Voiture supprimée.");
		}
		else {
			final String sql = "DELETE FROM moto where id = '" + id +"'";
			new ServicesDB();
			ServicesDB.traitementSql(sql);
			System.out.println("Moto supprimée.");
		}
		
	}
	
	public void consulterVehicule(String[] tab) {
		final String type = tab[0];
		final String id_tmp = tab[1];
		final Integer id = Integer.parseInt(id_tmp);
		if (type.equals("Voiture")) {
			final String sql = "SELECT * FROM voiture where id = '" + id +"'";
			new ServicesDB();
			ServicesDB.consultVehicule(sql);
		}
		else {
			final String sql = "SELECT * FROM moto where id = '" + id +"'";
			new ServicesDB();
			ServicesDB.consultVehicule(sql);
		}
		
	}
	
	
	
}	

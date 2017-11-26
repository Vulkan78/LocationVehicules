package fr.GestionLoc.presentation;

import java.util.Scanner;

import fr.GestionLoc.model.Moto;
import fr.GestionLoc.model.Vehicule;
import fr.GestionLoc.model.Voiture;

public class DonneesVehicule {
	public static Scanner scanner = new Scanner(System.in);
	
	public static Vehicule demanderVehicule () {
		System.out.println("Ajouter un nouveau véhicule.");
		System.out.println("Voiture ou Moto : ");
		final String type = scanner.nextLine();
		System.out.println("Marque : ");
		final String marque = scanner.nextLine();
		System.out.println("Modele : ");
		final String modele = scanner.nextLine();
		System.out.println("Couleur : ");
		final String couleur = scanner.nextLine();
		System.out.println("Cout : ");
		final String cout_tmp = scanner.nextLine();
		final Integer cout = Integer.parseInt(cout_tmp);
		if (type.equals("Voiture")) {
			System.out.println("Nombre de places (2 ou 5) : ");
			final String nb_place_tmp = scanner.nextLine();
			final Integer nb_place = Integer.parseInt(nb_place_tmp);
			final Voiture voiture = new Voiture(1, marque, modele, cout, couleur, nb_place);
			return voiture;
		}
		else {
			System.out.println("Cylindrée : ");
			final String cylindree = scanner.nextLine();
			final Moto moto = new Moto(1, marque, modele, cout, couleur, cylindree);
			return moto;
		}
	}
	
	public static String[] supprimerVehicule() {
		System.out.println("Supprimer un véhicule.");
		System.out.println("Voiture ou Moto : ");
		final String type = DonneesVehicule.scanner.nextLine();
		System.out.println("ID du véhicule : ");
		final String id = DonneesVehicule.scanner.nextLine();
		String[] tab = {type, id};
		return tab;
	}
	
	public static String[] consulterVehicule() {
		System.out.println("Consulter un véhicule.");
		System.out.println("Voiture ou Moto : ");
		final String type = DonneesVehicule.scanner.nextLine();
		System.out.println("ID du véhicule : ");
		final String id = DonneesVehicule.scanner.nextLine();
		String[] tab = {type, id};
		return tab;
	}
}

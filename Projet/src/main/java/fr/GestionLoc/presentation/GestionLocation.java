package fr.GestionLoc.presentation;
import java.util.Scanner;

import fr.GestionLoc.model.Vehicule;
import fr.GestionLoc.service.*;

/**
 * @author Jimmy RAKOTOSON
 *
 */
public class GestionLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GestionLocation().run();		
	}
	
	private Scanner scanner;
	
	private GestionLocation() {
		this.scanner = new Scanner(System.in);
	}
	
	public void run() {
		System.out.println("Veuillez vous identifier. ");
		System.out.println("Pseudo : ");
		final String pseudo = this.scanner.nextLine();
		new ServicesDB().connexionSql(pseudo);
		System.out.println("Bonjour " + pseudo);
		if (pseudo.equals("admin")) {
			System.out.println("Que souhaitez-vous faire?");
			System.out.println("1- Ajouter un véhicule / 2- Supprimer un véhicule / 3- Consulter un véhicule");
			final String choix = this.scanner.nextLine();
			if (choix.equals("1")) {
				final Vehicule vehicule;
				new DonneesVehicule();
				vehicule = DonneesVehicule.demanderVehicule();
				new ServicesVehicule().ajouterVehicule(vehicule);
			}
			else if(choix.equals("2")){
				final String[] tab;
				new DonneesVehicule();
				tab = DonneesVehicule.supprimerVehicule();
				new ServicesVehicule().supprimerVehicule(tab);
			}
			else if(choix.equals("3")){
				final String[] tab;
				new DonneesVehicule();
				tab = DonneesVehicule.consulterVehicule();
				new ServicesVehicule().consulterVehicule(tab);
			}
			else
				System.out.println("Erreur. Veuillez saisir un choix possible (1, 2 ou 3).");
		}
		else
		{
			final String[] tab;
			new DonneesVehicule();
			tab = DonneesVehicule.consulterVehicule();
			new ServicesVehicule().consulterVehicule(tab);
		}
	}
	
}

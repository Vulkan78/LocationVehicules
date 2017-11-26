package fr.GestionLoc.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ServicesDB {
	public void connexionSql(String pseudo) {
		// Information d'accès à la base de données
				String url = "jdbc:mysql://localhost:8889/LocationVehicule";
				String login = "root";
				String passwd = "root";
				Connection cn =null;
				Statement st =null;
				ResultSet rs =null;
				
				try {

					// Etape 1 : Chargement du driver
					Class.forName("com.mysql.jdbc.Driver");

					// Etape 2 : récupération de la connexion
					cn = DriverManager.getConnection(url, login, passwd);

					// Etape 3 : Création d'un statement
					st = cn.createStatement();

					String sql = "SELECT * FROM utilisateur where pseudo ='" + pseudo + "'";

					// Etape 4 : exécution requête
					rs = st.executeQuery(sql);

					// Si récup données alors étapes 5 (parcours Resultset)

					while (rs.next()) {
						System.out.println("Client : " + rs.getString("prenom") + " " + rs.getString("nom"));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} finally {
					try {
					// Etape 6 : libérer ressources de la mémoire.
						cn.close();
						st.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			
	}
	
	public static void traitementSql(String sql) {

		// Information d'accès à la base de données
		String url = "jdbc:mysql://localhost:8889/LocationVehicule";
		String login = "root";
		String passwd = "root";
		Connection cn =null;
		Statement st =null;

		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, passwd);

			// Etape 3 : Création d'un statement
			st = cn.createStatement();

			// Etape 4 : exécution requête
			st.executeUpdate(sql);

			// Si récup données alors étapes 5 (parcours Resultset)

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
			// Etape 6 : libérer ressources de la mémoire.
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void consultVehicule(String sql) {
		// Information d'accès à la base de données
				String url = "jdbc:mysql://localhost:8889/LocationVehicule";
				String login = "root";
				String passwd = "root";
				Connection cn =null;
				Statement st =null;
				ResultSet rs =null;
				
				try {

					// Etape 1 : Chargement du driver
					Class.forName("com.mysql.jdbc.Driver");

					// Etape 2 : récupération de la connexion
					cn = DriverManager.getConnection(url, login, passwd);

					// Etape 3 : Création d'un statement
					st = cn.createStatement();

					// Etape 4 : exécution requête
					rs = st.executeQuery(sql);

					// Si récup données alors étapes 5 (parcours Resultset)

					while (rs.next()) {
						System.out.println("Véhicule : " + rs.getString("marque") + " " + rs.getString("modele")
						+ " " + rs.getString("couleur")+ " . Prix: " + rs.getString("cout")+ "€/mois.");
						
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} finally {
					try {
					// Etape 6 : libérer ressources de la mémoire.
						cn.close();
						st.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			
	}
	
}

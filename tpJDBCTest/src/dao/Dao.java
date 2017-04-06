package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import metier.Client;

public class Dao implements IDao {

	@Override
	public void ajouterClient(Client c) {
		//1- Charger les pilotes
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		//2- Créer la connexion
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testbdd","root","");
			 
		
		//3- Créer une requête
			String s = "INSERT INTO client(nom,prenom) VALUES(?,?)";
			PreparedStatement ps = conn.prepareStatement(s);
						
			ps.setString(1, c.getNom());
			ps.setString(2, c.getPrenom());
		
		//4- Executerla requête
			ps.executeUpdate();
		
		//5- Présenter les résultats
			
		//6- Fermer la connection
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	
	
	
}

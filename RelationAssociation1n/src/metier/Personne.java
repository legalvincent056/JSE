package metier;

import java.util.ArrayList;
import java.util.Collection;

public class Personne {

	private int idPersonne;
	private String nom;
	private String prenom;
	
	private Collection<Voiture> mesVoitures = new ArrayList<Voiture>(); // Nouvelle liste ArrayList pour initialisé Collection <Voiture>

	
	
	//Getters et Setters
	public int getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
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

	public Collection<Voiture> getMesVoitures() {
		return mesVoitures;
	}

	public void setMesVoitures(Collection<Voiture> mesVoitures) {
		this.mesVoitures = mesVoitures;
	}

	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", nom=" + nom + ", prenom=" + prenom + "\n, mesVoitures=\n"
				+ mesVoitures + "]";
	}
	
	
	//affichage

	
	
	
	
	
}

package service;

import java.util.ArrayList;
import java.util.Collection;

import metier.Personne;
import metier.Voiture;

public class Service implements IService {

	@Override
	public void ajouterVoiture(Personne p, Voiture v) {
		Collection<Voiture> col = p.getMesVoitures(); //je liste mes voitures existantes
		col.add(v); //j'ajoute la nouvelle voiture
		p.setMesVoitures(col); //je la mets dans la collection du propriétaire
		v.setProprietaire(p); //j'ajoute le propriétaire à la voiture
	}

	@Override
	public Collection<Voiture> affichageVoiture(Personne p) {
		
		return p.getMesVoitures(); //Affichage de la liste des voiture d'un propriétaire
	
	}

}

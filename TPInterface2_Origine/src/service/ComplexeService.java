package service;

import metier.Complexe;

public class ComplexeService implements IComplexeService {

	
	//addition
	
	public Complexe addition(Complexe x, Complexe y){
		Complexe c = new Complexe(x.getRe()+y.getRe(), x.getIm()+y.getIm());
		return c ;
	}
	
	
	//soustraction
	
	public Complexe soustraction(Complexe x, Complexe y){
	Complexe c = new Complexe(x.getRe()- y.getRe(),x.getIm()-y.getIm());
	return c ;
	}
	
	
}

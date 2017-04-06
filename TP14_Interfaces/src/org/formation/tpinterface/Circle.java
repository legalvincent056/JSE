package org.formation.tpinterface;

import java.awt.Shape;

public class Circle implements Surface , IFXDrawable, IPrintable {

	private double radius;

	//Constructeur	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	
	

	//Getters et Setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}



	// Methode de Surface
	@Override
	public double getArea() {
		
		return Math.PI* radius * radius ;
	}



	//Methode de IFXDrawable
	@Override
	public String getShape() {
		
		return "Je suis un cercle";
	}



	// Methode de IPrintable
	@Override
	public void PrintMe(String text) {
				
	}



	


	
	
	
	
}

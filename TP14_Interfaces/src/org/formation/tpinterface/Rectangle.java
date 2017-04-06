package org.formation.tpinterface;

public class Rectangle implements Surface{

	private double width;
	private double height;
	
	
	//Constructeur	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	
	
	
	
	//Getters et Setters
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}





	@Override
	public double getArea() {
		
		return width * height;
	}
	
	
	
	
}

package org.formation.tpinterface;

import java.util.ArrayList;
import java.util.Collection;

public class Lanceur {

	public static void main(String[] args) {
		
		
		
		Rectangle r = new Rectangle(25, 5);
		Square s = new Square(8);
		Circle c = new Circle(4);
		
		Collection<Surface> sf = new ArrayList<Surface>();
		sf.add(r);
		sf.add(s);
		sf.add(c);
		
		AreaCalculator ac = new AreaCalculator();
		System.out.println(ac.sumArea(sf));

	}

}

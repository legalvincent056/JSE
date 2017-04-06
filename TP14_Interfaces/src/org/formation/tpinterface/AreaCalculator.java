package org.formation.tpinterface;

import java.util.Collection;

public class AreaCalculator {


	public AreaCalculator() {
		super();
	}

	public double sumArea(Collection<Surface> surfaces) {
		double sumArea = 0;
		for (Surface surface : surfaces) {
			sumArea += surface.getArea();
		}
		return sumArea;
	}	
}

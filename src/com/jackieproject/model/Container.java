package com.jackieproject.model;

public class Container {
	private double lengthInMm;
	private double heightInMm;
	private double widthInMm;
	private double capacityInKg;
	private boolean hasToxicOrExplosive = false;

//	public Container() {
//		lengthInMm = 1000.0; 
//		heightInMm = 1000.0;
//		widthInMm = 1000.0;
//		capacityInKg = 3000.0;
//	}
	
	public Container(double lengthInMm, double heightInMm, 
			double widthInMm, double capacityInKg, boolean hasToxicOrEplosive) {
		this.lengthInMm = lengthInMm;
		this.heightInMm = heightInMm;
		this.widthInMm = widthInMm;
		this.capacityInKg = capacityInKg;
		this.hasToxicOrExplosive = hasToxicOrEplosive;
	}
	

	public double getLength() {
		return lengthInMm;
	}

	public void setLength(double length) {
		this.lengthInMm = length;
	}

	public double getHeight() {
		return heightInMm;
	}

	public void setHeight(double height) {
		this.heightInMm = height;
	}

	public double getWidth() {
		return widthInMm;
	}

	public void setWidth(double width) {
		this.widthInMm = width;
	}


	public double getCapacityInKg() {
		return capacityInKg;
	}


	public void setCapacityInKg(double capacityInKg) {
		this.capacityInKg = capacityInKg;
	}

	public boolean isHasToxicOrEplosive() {
		return hasToxicOrExplosive;
	}

	public void setHasToxicOrEplosive(boolean hasToxicOrEplosive) {
		this.hasToxicOrExplosive = hasToxicOrEplosive;
	}

}

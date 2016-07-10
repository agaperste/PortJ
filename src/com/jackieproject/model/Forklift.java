package com.jackieproject.model;

public class Forklift {
	private double capacityInKg;
	private boolean isExplosiveToxicSafe = false;
	
	public Forklift() {
		capacityInKg = 10000.0;
	}
	
	public Forklift(double capacityInKg) {
		this.capacityInKg = capacityInKg;
	}
	
	public double getCapacityInKg() {
		return capacityInKg;
	}
	public void setCapacityInKg(double capacityInKg) {
		this.capacityInKg = capacityInKg;
	}
	public boolean isExplosiveToxicSafe() {
		return isExplosiveToxicSafe;
	}
	public void setExplosiveToxicSafe(boolean isExplosiveToxicSafe) {
		this.isExplosiveToxicSafe = isExplosiveToxicSafe;
	}

}

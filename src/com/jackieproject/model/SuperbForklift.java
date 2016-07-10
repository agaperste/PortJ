package com.jackieproject.model;

public class SuperbForklift extends Forklift {
	private double capacityInKg;
	private boolean isExplosiveToxicSafe = true;

	public SuperbForklift() {
		super();
	}
	
	public SuperbForklift(double capacityInKg) {
		super(capacityInKg);
	}

}

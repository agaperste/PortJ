package com.jackieproject.model;

public class HeavyContainer extends Container {
	private double lengthInMm;
	private double heightInMm;
	private double widthInMm;
	private double capacityInKg;
	private boolean hasToxicOrEplosive = false;

//	public HeavyContainer() {
//		lengthInMm = 3000.0; 
//		heightInMm = 3000.0;
//		widthInMm = 3000.0;
//		capacityInKg = 9000.0;
//	}

	public HeavyContainer(double lengthInMm, double heightInMm,
			double widthInMm, double capacityInKg, boolean hasToxicOrEplosive) {
		super(lengthInMm, heightInMm, widthInMm, capacityInKg, hasToxicOrEplosive);
	}

}

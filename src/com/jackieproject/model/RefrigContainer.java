package com.jackieproject.model;

public class RefrigContainer extends HeavyContainer {
	private double lengthInMm;
	private double heightInMm;
	private double widthInMm;
	private double capacityInKg;
	private boolean hasToxicOrEplosive = false;
	private boolean canHandleRefriged = true;

//	public RefrigContainer() {
//		lengthInMm = 3000.0; 
//		heightInMm = 3000.0;
//		widthInMm = 3000.0;
//		capacityInKg = 9000.0;
//	}

	public RefrigContainer(double lengthInMm, double heightInMm,
			double widthInMm, double capacityInKg, boolean hasToxicOrEplosive) {
		super(lengthInMm, heightInMm, widthInMm, capacityInKg, hasToxicOrEplosive);
	}

}

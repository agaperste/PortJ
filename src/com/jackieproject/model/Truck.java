package com.jackieproject.model;

public class Truck implements Vehicle {
	private int maxToxicOrExplosiveContainers;
	private int maxRefrigContainers;
	private int maxHeavyContainers;
	private int maxTotalContainers;

	public Truck(int maxToxicOrExplosiveContainers, int maxRefrigContainers,
			int maxHeavyContainers, int maxTotalContainers) {
		this.maxToxicOrExplosiveContainers = maxToxicOrExplosiveContainers;
		this.maxRefrigContainers = maxRefrigContainers;
		this.maxHeavyContainers = maxHeavyContainers;
		this.maxTotalContainers = maxTotalContainers;
	}

}

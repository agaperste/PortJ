package com.jackieproject.model;

public class Boat implements Vehicle {
	private int maxToxicOrExplosiveContainers;
	private int maxRefrigContainers;
	private int maxHeavyContainers;
	private int maxTotalContainers;

	public Boat(int maxToxicOrExplosiveContainers, int maxRefrigContainers,
			int maxHeavyContainers, int maxTotalContainers) {
		this.maxToxicOrExplosiveContainers = maxToxicOrExplosiveContainers;
		this.maxRefrigContainers = maxRefrigContainers;
		this.maxHeavyContainers = maxHeavyContainers;
		this.maxTotalContainers = maxTotalContainers;
	}

}

package com.jackieproject.model;

public class Port {
	private Forklift forklift1;
	private Forklift forklift2;
	private SuperbForklift forklift3;
	
	public Port() {
		forklift1 = new Forklift();
		forklift2 = new Forklift();
		forklift3 = new SuperbForklift();
	}

}

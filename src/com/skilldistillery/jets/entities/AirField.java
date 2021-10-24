package com.skilldistillery.jets.entities;

public class AirField {

	private Jet [] jets;
	private int numJets =0;
	public AirField() {
		jets = new Jet[5];
	}
	public void addJet(Jet j) {
		jets[numJets]= j;
		numJets ++;
	}
	
	
	
}

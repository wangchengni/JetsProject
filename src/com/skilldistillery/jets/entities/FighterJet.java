package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady{
	
	public FighterJet() {}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	
	public void fight() {
		System.out.println("Let me show you pour best fighter jets in the world!");
		System.out.println("Come with me right now!");
		System.out.println("It's our pleasure to show you these wonderful jets");
	}


	@Override
	public String toString() {
		return "FighterJet getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() ;
	}
	
	
}

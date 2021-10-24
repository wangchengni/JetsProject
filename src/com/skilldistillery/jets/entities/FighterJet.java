package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady{
	
	public FighterJet() {}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	
	public void fight() {
		System.out.println("This is fast");
	}


	@Override
	public String toString() {
		return "FighterJet getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() ;
	}
	
	
}

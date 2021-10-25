package com.skilldistillery.jets.entities;

public class Seaplane extends Jet implements SeaplaneLanding {

	
	
	public Seaplane() {}
	public Seaplane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	public void landing() {
		System.out.println("Please prepare for sea landing~~~~~~~~~~~~~~!!!");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Land successfully, Welcome to the Moonisland!!!");
	}
	
		
		
	
	@Override
	public String toString() {
		return "Seaplane getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice()  ;
	}

}

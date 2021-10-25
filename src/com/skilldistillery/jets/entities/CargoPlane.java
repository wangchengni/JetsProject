package com.skilldistillery.jets.entities;

public   class CargoPlane extends Jet implements CargoCarrier{
	
	public CargoPlane() {}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	
	public void loadCargo() {
		System.out.println("Cargo is loading");
		System.out.println("Please watch out");
		System.out.println("Get your baggage at door 3");
	}

	@Override
	public String toString() {
		return "CargoPlane getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() ;
	}
	
	
}

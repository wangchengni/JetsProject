package com.skilldistillery.jets.entities;

public class PrivateJet extends Jet implements PrivatTrip{
	public PrivateJet() {}

	@Override
	public String toString() {
		return "PrivateJet getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() ;
	}
	public PrivateJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	public void trip() {
		System.out.println("Enjoy your trip, VVVIP");
	}
}

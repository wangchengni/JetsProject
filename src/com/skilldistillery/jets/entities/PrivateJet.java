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
		System.out.println("Welcome to your jet, VVVIP!!");
		System.out.println("Our flight will pass German, England!!");
		System.out.println("Please feel free to ask any service !!");
		System.out.println("Enjoy your world fly!!");
	}
}

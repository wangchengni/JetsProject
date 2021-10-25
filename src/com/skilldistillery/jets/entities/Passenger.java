package com.skilldistillery.jets.entities;

public class Passenger extends Jet implements PassengerFly {

	public Passenger(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	public Passenger() {}
	public void Fly() {
		System.out.println("Ladies and Gentlemen");
		System.out.println("We are taking off right now");
		System.out.println("please fasten your seat belt and fly happy");
	}
	@Override
	public String toString() {
		return "Passenger getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() ;
	}

}

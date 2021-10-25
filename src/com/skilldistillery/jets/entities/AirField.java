package com.skilldistillery.jets.entities;

import java.util.ArrayList;
import java.util.List;

public class AirField {

	private List<CargoPlane> Carjets;
	private List<Passenger> Passengerjets;
	private List<Seaplane> Seajets;
	private List<PrivateJet> privatejets;
	private List<FighterJet> fighterjets;
	private int numJets = 0;

	public AirField() {

	}

	public void addCargoJet(List<Jet> fast) {

		Carjets = new ArrayList<>();
		Carjets.add(numJets, (CargoPlane) fast);
		numJets++;
	}

	public void addPassenger(List<Jet> fast) {

		Passengerjets = new ArrayList<>();
		Passengerjets.add(numJets, (Passenger) fast);
		numJets++;
	}

	public void addSeaplane(List<Jet> fast) {

		Seajets = new ArrayList<>();
		Seajets.add(numJets, (Seaplane) fast);
		numJets++;
	}

	public void addPrivateJet(List<Jet> fast) {

		privatejets = new ArrayList<>();
		privatejets.add(numJets, (PrivateJet) fast);
		numJets++;
	}

	public void addFighterJet(List<Jet> fast) {

		fighterjets = new ArrayList<>();
		fighterjets.add(numJets, (FighterJet) fast);
		numJets++;
	}

}

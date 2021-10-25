package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.CargoCarrier;
import com.skilldistillery.jets.entities.CargoPlane;
import com.skilldistillery.jets.entities.CombatReady;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.Passenger;
import com.skilldistillery.jets.entities.PassengerFly;
import com.skilldistillery.jets.entities.PrivatTrip;
import com.skilldistillery.jets.entities.PrivateJet;
import com.skilldistillery.jets.entities.Seaplane;
import com.skilldistillery.jets.entities.SeaplaneLanding;

public class JetsApplictaion {

	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JetsApplictaion JA = new JetsApplictaion();

		JA.displatUserMenu();

	}

	private void FleetList(String fileName) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] planetRecord = line.split(",");

				System.out.println("Name: " + planetRecord[0] + "/ Model: " + planetRecord[1] + "/ Speed: "
						+ planetRecord[2] + "/ Range: " + planetRecord[3] + "/ Price: " + planetRecord[4] + "\n");
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public void getTheFasted(String fileName) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			List<Double> fast1 = new ArrayList<>();
			List<Jet> fast = new ArrayList<>();
			while ((line = bufIn.readLine()) != null) {
				String[] planetRecord = line.split(",");
				fast1.add(Double.parseDouble(planetRecord[2]));
				if (planetRecord[0].equals("Seaplane")) {
					fast.add(new Seaplane(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("CargoPlane")) {
					fast.add(new CargoPlane(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("Passenger")) {
					fast.add(new Passenger(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("PrivateJet")) {
					fast.add(new PrivateJet(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("FighterJet")) {
					fast.add(new FighterJet(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
			}
			double x = 0;
			double z = 0;
			double y = 0;
			int i = 0;
			for (i = 0; i < 5; i++) {
				y = z;
				x = fast1.get(i);

				if (x - y >= 0) {
					z = x;
				} else {
					z = y;
				}
			}
			for (i = 0; i < 5; i++) {
				if (z == (fast.get(i).getSpeed())) {
					System.out.println(fast.get(i));
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}

	}

	public void getTheLongest(String fileName) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			List<Integer> fast1 = new ArrayList<>();
			List<Jet> fast = new ArrayList<>();
			while ((line = bufIn.readLine()) != null) {
				String[] planetRecord = line.split(",");
				fast1.add(Integer.parseInt(planetRecord[3]));
				if (planetRecord[0].equals("Seaplane")) {
					fast.add(new Seaplane(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("CargoPlane")) {
					fast.add(new CargoPlane(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("Passenger")) {
					fast.add(new Passenger(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("PrivateJet")) {
					fast.add(new PrivateJet(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("FighterJet")) {
					fast.add(new FighterJet(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
			}
			int x = 0;
			int z = 0;
			int y = 0;
			int i = 0;
			for (i = 0; i < 5; i++) {
				y = z;
				x = fast1.get(i);

				if (x - y >= 0) {
					z = x;
				} else {
					z = y;
				}
			}
			for (i = 0; i < 5; i++) {
				if (z == (fast.get(i).getRange())) {
					System.out.println(fast.get(i));
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}

	}

	public void ChooseOption(String fileName) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			List<Integer> fast1 = new ArrayList<>();
			List<Jet> fast = new ArrayList<>();
			while ((line = bufIn.readLine()) != null) {
				String[] planetRecord = line.split(",");
				fast1.add(Integer.parseInt(planetRecord[3]));
				if (planetRecord[0].equals("Seaplane")) {
					fast.add(new Seaplane(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("CargoPlane")) {
					fast.add(new CargoPlane(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("Passenger")) {
					fast.add(new Passenger(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("PrivateJet")) {
					fast.add(new PrivateJet(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("FighterJet")) {
					fast.add(new FighterJet(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
			}

			System.out.println("Please choose the following option");
			System.out.println("-------------------------------------");
			System.out.println("1.Watch out for Sea landing");
			System.out.println("2.Loading all Cargos");
			System.out.println("3.Passenger :Fly Safe");
			System.out.println("4.Enjoy your private trip");
			System.out.println("5.Amazing fighter Jets!");
			System.out.println("6.Quiting.......");
			System.out.println("-------------------------------------");

			boolean keepdoing = true;
			while (keepdoing == true) {
				int numSelected = kb.nextInt();
				switch (numSelected) {
				case 1:
					SeaplaneLanding sl = new Seaplane();
					sl = (SeaplaneLanding) fast.get(0);
					sl.landing();
					break;
				case 2:
					CargoCarrier cp = new CargoPlane();
					cp = (CargoCarrier) fast.get(1);
					cp.loadCargo();
					break;
				case 3:
					PassengerFly pa = new Passenger();
					pa = (PassengerFly) fast.get(2);
					pa.Fly();
					break;
				case 4:
					PrivatTrip pt = new PrivateJet();
					pt = (PrivatTrip) fast.get(3);
					pt.trip();
					break;
				case 5:
					CombatReady cr = new FighterJet();
					cr = (CombatReady) fast.get(4);
					cr.fight();
					break;
				case 6:
					System.out.println("Quiting......");
					keepdoing = false;
					break;
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}

	}

	public void AddJets(String fileName) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			List<Integer> fast1 = new ArrayList<>();
			List<Jet> fast = new ArrayList<>();
			while ((line = bufIn.readLine()) != null) {
				String[] planetRecord = line.split(",");
				fast1.add(Integer.parseInt(planetRecord[3]));
				if (planetRecord[0].equals("Seaplane")) {
					fast.add(new Seaplane(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("CargoPlane")) {
					fast.add(new CargoPlane(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("Passenger")) {
					fast.add(new Passenger(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("PrivateJet")) {
					fast.add(new PrivateJet(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("FighterJet")) {
					fast.add(new FighterJet(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
			}
			System.out.println("Please choose the following option");
			System.out.println("-------------------------------------");
			System.out.println("1.Seaplane");
			System.out.println("2.CargoPlane");
			System.out.println("3.Passenger");
			System.out.println("4.PrivateJet");
			System.out.println("5.FighterJet");
			System.out.println("6.I don't want to add, I gonna quit");
			System.out.println("-------------------------------------");

			String Model;
			double Speed;
			int range;
			long price;

			AirField ar = new AirField();
			boolean keepdoing = true;
			while (keepdoing == true) {
				int numSelected = kb.nextInt();
				switch (numSelected) {

				case 1:
					System.out.println("Please provide Model,Speed,Range and Price for your Seaplane");
					Model = kb.nextLine();
					Speed = kb.nextDouble();
					range = kb.nextInt();
					price = kb.nextLong();
					fast.add(new Seaplane(Model, Speed, range, price));
					ar.addSeaplane(fast);

					break;
				case 2:
					System.out.println("Please provide Model,Speed,Range and Price for your Cargo Plane");
					Model = kb.nextLine();
					Speed = kb.nextDouble();
					range = kb.nextInt();
					price = kb.nextLong();
					fast.add(new CargoPlane(Model, Speed, range, price));
					ar.addCargoJet(fast);

					break;
				case 3:
					System.out.println("Please provide Model,Speed,Range and Price for your Passenger Plane");
					Model = kb.nextLine();
					Speed = kb.nextDouble();
					range = kb.nextInt();
					price = kb.nextLong();
					fast.add(new Passenger(Model, Speed, range, price));
					ar.addPassenger(fast);

					break;
				case 4:
					System.out.println("Please provide Model,Speed,Range and Price for your Private Jets");
					Model = kb.nextLine();
					Speed = kb.nextDouble();
					range = kb.nextInt();
					price = kb.nextLong();
					fast.add(new PrivateJet(Model, Speed, range, price));
					ar.addPrivateJet(fast);
					break;
				case 5:
					System.out.println("Please provide Model,Speed,Range and Price for your Fighter jets");
					Model = kb.nextLine();
					Speed = kb.nextDouble();
					range = kb.nextInt();
					price = kb.nextLong();
					fast.add(new FighterJet(Model, Speed, range, price));
					ar.addFighterJet(fast);
					break;
				case 6:
					System.out.println("Quiting......");
					keepdoing = false;
					break;
				}
			}
		}

		catch (IOException e) {
			System.err.println(e);
		}
	}
	

	public void FlyALL(String fileName) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			List<Jet> fast = new ArrayList<>();
			while ((line = bufIn.readLine()) != null) {
				String[] planetRecord = line.split(",");
				if (planetRecord[0].equals("Seaplane")) {
					fast.add(new Seaplane(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("CargoPlane")) {
					fast.add(new CargoPlane(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("Passenger")) {
					fast.add(new Passenger(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("PrivateJet")) {
					fast.add(new PrivateJet(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("FighterJet")) {
					fast.add(new FighterJet(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}

			}
			for (int i = 0; i < 5; i++) {
				System.out.println(
						fast.get(i) + "\n" + "[They will run out of fuel after " + (fast.get(i).fly()) + "]" + "\n");
			}
		} catch (IOException e) {
			System.err.println(e);
		}

	}
	public void Removejets(String fileName) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			List<Integer> fast1 = new ArrayList<>();
			List<Jet> fast = new ArrayList<>();
			while ((line = bufIn.readLine()) != null) {
				String[] planetRecord = line.split(",");
				fast1.add(Integer.parseInt(planetRecord[3]));
				if (planetRecord[0].equals("Seaplane")) {
					fast.add(new Seaplane(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("CargoPlane")) {
					fast.add(new CargoPlane(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("Passenger")) {
					fast.add(new Passenger(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("PrivateJet")) {
					fast.add(new PrivateJet(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
				if (planetRecord[0].equals("FighterJet")) {
					fast.add(new FighterJet(planetRecord[1], Double.parseDouble(planetRecord[2]),
							Integer.parseInt(planetRecord[3]), Long.parseLong(planetRecord[4])));
				}
			}
			System.out.println("Please choose which one you want to remove");
			System.out.println("-------------------------------------");
			System.out.println("1.Seaplane");
			System.out.println("2.CargoPlane");
			System.out.println("3.Passenger");
			System.out.println("4.PrivateJet");
			System.out.println("5.FighterJet");
			System.out.println("6.I don't want to remove anything, I gonna quit");
			System.out.println("-------------------------------------");

			String command;
			boolean keepdoing = true;
			while (keepdoing == true) {
				int numSelected = kb.nextInt();
				switch (numSelected) {

				case 1:
					System.out.println("Are you sure you want to remove this one");
					System.out.println("Press Y to delete, N to quit");
					command = kb.next() ;
					if(command.equals("Y")) {
						fast.remove(0);
					}if(command.equals("N")) {
						System.out.println("Done choosing,exiting");
						keepdoing = false;
					}
					break;
				case 2:
					System.out.println("Are you sure you want to remove this one");
					System.out.println("Press Y to delete, N to quit");
					command = kb.next().toUpperCase();
					if(command.equals("Y")) {
						
						fast.remove(1);
					}if(command.equals("N")) {
						System.out.println("Done choosing,exiting");
						keepdoing = false;
					}
					break;
				case 3:
					System.out.println("Press Y to delete, N to quit");
					System.out.println("Are you sure you want to remove this one");  
					command = kb.next().toUpperCase();
					if(command.equals("Y")) {
						
						fast.remove(2);
					}if(command.equals("N")) {
						System.out.println("Done choosing,exiting");
						keepdoing = false;
					}
					break;
				case 4:
					System.out.println("Are you sure you want to remove this one");  
					System.out.println("Press Y to delete, N to quit");
					command = kb.next().toUpperCase();
					if(command.equals("Y")) {
						
						fast.remove(3);
					}if(command.equals("N")) {
						System.out.println("Done choosing,exiting");
						keepdoing = false;
					}
					break;
				case 5:
					System.out.println("Are you sure you want to remove this one");  
					System.out.println("Press Y to delete, N to quit");
					command = kb.next().toUpperCase();
					if(command.equals("Y")) {
						
						fast.remove(4);
					}else {
						System.out.println("Done choosing,exiting");
						keepdoing = false;
					}
					break;
				case 6:
					System.out.println("Quiting......");
					keepdoing = false;
					break;
				}
			}
		}

		catch (IOException e) {
			System.err.println(e);
		}
	}

	 

	public JetsApplictaion() {
	}

//	private void launch() {
//	}

	private void displatUserMenu() {
		System.out.println("These are the menu for you to choose");
		System.out.println("-------------------------------------");
		System.out.println("1.List fleet");
		System.out.println("2.Fly all Jets");
		System.out.println("3.View fastest Jet");
		System.out.println("4.View jet with longegst range");
		System.out.println("5.Load all Cargo Jets");
		System.out.println("6.Dogfight!");
		System.out.println("7.Private Trip!");
		System.out.println("8.Passenger Welcome!");
		System.out.println("9.Sea Plane fly!");
		System.out.println("10.Add a jet to Fleet");
		System.out.println("11.Remove a jet from Fleet");
		System.out.println("12.quit");
		System.out.println("-------------------------------------");
		runApp();
	}

	public void runApp() {
		boolean keepdoing = true;
		while (keepdoing == true) {
			int numSelected = kb.nextInt();
			switch (numSelected) {
			case 1:
				System.out.println("This is the fleet list");
				String fileName = "jets.txt";
				FleetList(fileName);
				break;
			case 2:
				System.out.println("All Jets fly info");
				String fasteest2 = "jets.txt";
				FlyALL(fasteest2);
				break;

			case 3:
				System.out.println("This is the fastest Jet");
				String Fastest = "jets.txt";
				getTheFasted(Fastest);
				break;
			case 4:
				System.out.println("This is the longest Jet");
				String Fastest3 = "jets.txt";
				getTheLongest(Fastest3);
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("Choose your Options you want");
				String Filename5 = "jets.txt";
				ChooseOption(Filename5);
				break;
			case 10:
				System.out.println("Please tell me what you want to add");
				String Filename7 = "jets.txt";
				AddJets(Filename7);
				break;
			case 11:
				System.out.println("Please tell me what you want to remove");
				String Filename8 = "jets.txt";
				Removejets(Filename8);
				break;
			case 12:
				System.out.println("Quiting......");
				keepdoing = false;
				break;
			}

		}

	}
}

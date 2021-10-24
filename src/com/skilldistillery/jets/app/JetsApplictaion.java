package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.CargoPlane;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.Passenger;
import com.skilldistillery.jets.entities.PrivateJet;
import com.skilldistillery.jets.entities.Seaplane;

public class JetsApplictaion {

	Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JetsApplictaion JA = new JetsApplictaion();
		
		JA.displatUserMenu();
		
		
		
	}
	 private void FleetList(String fileName) {
		    try ( BufferedReader bufIn = new BufferedReader(new FileReader(fileName)) ) {
		      String line;
		      List<Double> fast = new ArrayList<>();
		      while ((line = bufIn.readLine()) != null) {
		        String[] planetRecord = line.split(",");
//		        System.out.println(line);
//		        fast.add(Double.parseDouble(planetRecord[2]));
		        
		        System.out.println("Name: "+planetRecord[0]+"/ Model: "+planetRecord[1]+ "/ Speed: "
		        		+planetRecord[2]+ "/ Range: "+planetRecord[3]+ "/ Price: "+planetRecord[4]
		        				+"\n");
		      }
		    }
		    catch (IOException e) {
		      System.err.println(e);
		    }
	 }
	 public void getTheFasted(String fileName) {
		 try ( BufferedReader bufIn = new BufferedReader(new FileReader(fileName)) ) {
		      String line;
		      List<Double> fast1 = new ArrayList<>();
		      List<Jet> fast = new ArrayList<>();
		      List<Jet> CargoPlane = new ArrayList<>();
		      while ((line = bufIn.readLine()) != null) {
		        String[] planetRecord = line.split(",");
		        fast1.add(Double.parseDouble(planetRecord[2]));
		        if(planetRecord[0].equals("Seaplane")){
		        	fast.add(new  Seaplane(planetRecord[1],Double.parseDouble(planetRecord[2]),
			        		Integer.parseInt(planetRecord[3]),Long.parseLong(planetRecord[4])));
		        }
		        if(planetRecord[0].equals("CargoPlane")){
		        	fast.add(new  CargoPlane(planetRecord[1],Double.parseDouble(planetRecord[2]),
			        		Integer.parseInt(planetRecord[3]),Long.parseLong(planetRecord[4])));
		        }
		        if(planetRecord[0].equals("Passenger")){
		        	fast.add(new  Passenger(planetRecord[1],Double.parseDouble(planetRecord[2]),
			        		Integer.parseInt(planetRecord[3]),Long.parseLong(planetRecord[4])));
		        }
		        if(planetRecord[0].equals("PrivateJet")){
		        	fast.add(new  PrivateJet(planetRecord[1],Double.parseDouble(planetRecord[2]),
			        		Integer.parseInt(planetRecord[3]),Long.parseLong(planetRecord[4])));
		        }
		        if(planetRecord[0].equals("FighterJet")){
		        	fast.add(new  FighterJet(planetRecord[1],Double.parseDouble(planetRecord[2]),
			        		Integer.parseInt(planetRecord[3]),Long.parseLong(planetRecord[4])));
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
				for( i =0; i<5; i++) {
					if(z == (fast.get(i).getSpeed())){
						System.out.println(fast.get(i));
					}
				}
		    }
		    catch (IOException e) {
		      System.err.println(e);
		    }
		 
	 }
	
	 public void getTheLongest(String fileName) {
		 try ( BufferedReader bufIn = new BufferedReader(new FileReader(fileName)) ) {
		      String line;
		      List<Integer> fast1 = new ArrayList<>();
		      List<Jet> fast = new ArrayList<>();
		      List<Jet> CargoPlane = new ArrayList<>();
		      while ((line = bufIn.readLine()) != null) {
		        String[] planetRecord = line.split(",");
		        fast1.add(Integer.parseInt(planetRecord[3]));
		        if(planetRecord[0].equals("Seaplane")){
		        	fast.add(new  Seaplane(planetRecord[1],Double.parseDouble(planetRecord[2]),
			        		Integer.parseInt(planetRecord[3]),Long.parseLong(planetRecord[4])));
		        }
		        if(planetRecord[0].equals("CargoPlane")){
		        	fast.add(new  CargoPlane(planetRecord[1],Double.parseDouble(planetRecord[2]),
			        		Integer.parseInt(planetRecord[3]),Long.parseLong(planetRecord[4])));
		        }
		        if(planetRecord[0].equals("Passenger")){
		        	fast.add(new  Passenger(planetRecord[1],Double.parseDouble(planetRecord[2]),
			        		Integer.parseInt(planetRecord[3]),Long.parseLong(planetRecord[4])));
		        }
		        if(planetRecord[0].equals("PrivateJet")){
		        	fast.add(new  PrivateJet(planetRecord[1],Double.parseDouble(planetRecord[2]),
			        		Integer.parseInt(planetRecord[3]),Long.parseLong(planetRecord[4])));
		        }
		        if(planetRecord[0].equals("FighterJet")){
		        	fast.add(new  FighterJet(planetRecord[1],Double.parseDouble(planetRecord[2]),
			        		Integer.parseInt(planetRecord[3]),Long.parseLong(planetRecord[4])));
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
				for( i =0; i<5; i++) {
					if(z == (fast.get(i).getRange())){
						System.out.println(fast.get(i));
					}
				}
		    }
		    catch (IOException e) {
		      System.err.println(e);
		    }
		 
	 }
	 
	 
	 
 public void FlyALL(String fileName) {
		 try ( BufferedReader bufIn = new BufferedReader(new FileReader(fileName)) ) {
		      String line;
		      CargoPlane jets = new CargoPlane();
		      List<Jet> fast = new ArrayList< >();
		      while ((line = bufIn.readLine()) != null) {
		        String[] planetRecord = line.split(",");
		        if(planetRecord[0].equals("Seaplane")){
		        	fast.add(new  Seaplane(planetRecord[1],Double.parseDouble(planetRecord[2]),
			        		Integer.parseInt(planetRecord[3]),Long.parseLong(planetRecord[4])));
		        }
		        if(planetRecord[0].equals("CargoPlane")){
		        	fast.add(new  CargoPlane(planetRecord[1],Double.parseDouble(planetRecord[2]),
			        		Integer.parseInt(planetRecord[3]),Long.parseLong(planetRecord[4])));
		        }
		        if(planetRecord[0].equals("Passenger")){
		        	fast.add(new  Passenger(planetRecord[1],Double.parseDouble(planetRecord[2]),
			        		Integer.parseInt(planetRecord[3]),Long.parseLong(planetRecord[4])));
		        }
		        if(planetRecord[0].equals("PrivateJet")){
		        	fast.add(new  PrivateJet(planetRecord[1],Double.parseDouble(planetRecord[2]),
			        		Integer.parseInt(planetRecord[3]),Long.parseLong(planetRecord[4])));
		        }
		        if(planetRecord[0].equals("FighterJet")){
		        	fast.add(new  FighterJet(planetRecord[1],Double.parseDouble(planetRecord[2]),
			        		Integer.parseInt(planetRecord[3]),Long.parseLong(planetRecord[4])));
		        }
		         
		      }
		      for(int i = 0; i <5; i++) {
		    	  System.out.println(fast.get(i)+"\n"+"[They will run out of fuel after "+(fast.get(i).fly())+"]"+"\n");
		      }
//		      System.out.println(fast.get(2));
		 }
		 catch (IOException e) {
		      System.err.println(e);
		 }
		 
		    }
		 
		 
	 
	 public   List<Jet> getTheFasted2(String fileName) {
		 List<Jet> fast1 = new ArrayList<Jet>();
		 try ( BufferedReader bufIn = new BufferedReader(new FileReader(fileName)) ) {
		      String line;
		      if ((line = bufIn.readLine()) != null) {
		        String[] planetRecord = line.split(",");
		        fast1.add(new CargoPlane(planetRecord[1],Double.parseDouble(planetRecord[2]),
		        		Integer.parseInt(planetRecord[3]),Long.parseLong(planetRecord[4])));
		      }
		 }
		 catch (IOException e) {
		      System.err.println(e);
		    }
		 return fast1;
	 }
	      
	
	public JetsApplictaion() {}
	
	private void launch() {}
	private void displatUserMenu() {
		System.out.println("These are the menu for you to choose");
		System.out.println("-------------------------------------");
		System.out.println("1.List fleet");
		System.out.println("2.Fly all Jets");
		System.out.println("3.View fastest Jet");
		System.out.println("4.View jet with longegst range");
		System.out.println("5.Load all Cargo Jets");
		System.out.println("6.Dogfight!");
		System.out.println("7.Add a jet to Fleet");
		System.out.println("8.Remove a jet from Fleet");
		System.out.println("9.quit");
		System.out.println("-------------------------------------");
		runApp();
	}
	
	public void runApp() {
		boolean keepdoing = true;
		while(keepdoing == true) {
			int numSelected = kb.nextInt();
			switch(numSelected) {
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
				System.out.println("Load all CargoCarrier");
				break;
			case 6:
				System.out.println("Fight info");
				break;
			case 7:
				System.out.println("Please tell me what you want to add");
				break;
			case 8:
				System.out.println("Please tell me what you want to remove");
				break;
			case 9:
				System.out.println("Quiting......");
				keepdoing = false;
				break;
			}
			
		}
		
		
	}
}

package com.gunjan.design_pattern;

interface Vehicle {
	public void printDescription();
}

class Scorpio implements Vehicle{

	public void printDescription() {
		System.out.println("this is scorpio");
	}
	
}

class Safari implements Vehicle{

	public void printDescription() {
		System.out.println("this is safari");
	}
	
}

class Toyota {
	public void description() {
		System.out.println("this is toyota");
	}
}

class Adapter implements Vehicle{
	Toyota vehicle;
	public Adapter(Toyota vehicle){
		this.vehicle = vehicle;
	}
	public void printDescription() {
		vehicle.description();
	}
}
public class TestClass{
	public static void main(String str[]){
		Vehicle vehicle = new Scorpio();
		vehicle.printDescription();
		vehicle = new Adapter(new Toyota());
		vehicle.printDescription();
	}
}


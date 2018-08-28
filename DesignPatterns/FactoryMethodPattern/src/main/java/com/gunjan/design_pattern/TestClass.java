package com.gunjan.design_pattern;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FourWheelerCreator fourWheelerCreatorOne = new FourWheelerCreator();
		Vehicle vehicle = fourWheelerCreatorOne.create("scorpio");
		vehicle.printDescription();
		
		vehicle = fourWheelerCreatorOne.create("toyota");
		vehicle.printDescription();
		
		vehicle = fourWheelerCreatorOne.create("safari");
		vehicle.printDescription();
		
		TwoWheelerCreator twoWheelerCreatorOne = new TwoWheelerCreator();
		vehicle = twoWheelerCreatorOne.create("pulser");
		vehicle.printDescription();
	}

}

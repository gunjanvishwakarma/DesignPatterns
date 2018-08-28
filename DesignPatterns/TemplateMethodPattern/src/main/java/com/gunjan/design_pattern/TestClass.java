package com.gunjan.design_pattern;


public class TestClass{
	public static void main(String str[]){
		CaffeinBeverage beverage1 = new Tea();
		CaffeinBeverage beverage2 = new Coffee();
		System.out.println("\nprepearing tea\n");
		beverage1.prepareRecipe();
		System.out.println("\nprepearing coffee\n");
		beverage2.prepareRecipe();
	}
}

abstract class CaffeinBeverage {
	public void prepareRecipe(){
		boilWater();
		brew();
		pourIncup();
		if(wantsCondiment())addCondiment();
	}

	public boolean wantsCondiment(){return true;}

	abstract public void brew();
	
	abstract public void addCondiment();

	private void boilWater(){
		System.out.println("boil water");
	}
	
	private void pourIncup() {
		System.out.println("pour in cup");
	}

}

class Tea extends CaffeinBeverage{

	@Override
	public void addCondiment() {
		System.out.println("add condiment for tea");
	}

	@Override
	public void brew() {
		System.out.println("add tea leaf");
	}

	public boolean wantsCondiment(){return false;}
	
}

class Coffee extends CaffeinBeverage{

	@Override
	public void addCondiment() {
		System.out.println("add condiment for coffee");
	}

	@Override
	public void brew() {
		System.out.println("add nescafe");
	}

}


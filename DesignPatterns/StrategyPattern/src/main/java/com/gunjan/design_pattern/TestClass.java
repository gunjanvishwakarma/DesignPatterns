package com.gunjan.design_pattern;

public class TestClass {

	
	public static void main(String[] args) {
		FormulaOne formulaOne = new FormulaOne();
		Bike bike = new Bike();
		Jet jet = new Jet();
		Plane plane = new Plane();
		formulaOne.go();
		bike.go();
		jet.go();
		plane.go();
	}

}
abstract class Vehicle{
	RunningBehaviour behaviour;
	public Vehicle(RunningBehaviour behaviour){
		this.behaviour = behaviour;
	}
	public void go(){
		behaviour.go();
	}
}

class FormulaOne extends Vehicle{

	public FormulaOne() {
		super(new goByFormulaOne());
		// TODO Auto-generated constructor stub
	}
	
}
class Bike extends Vehicle{

	public Bike() {
		super(new goByBike());
		// TODO Auto-generated constructor stub
	}
	
}
class Jet extends Vehicle{

	public Jet() {
		super(new goByJet());
		// TODO Auto-generated constructor stub
	}
	
}
class Plane extends Vehicle{

	public Plane() {
		super(new goByPlane());
		// TODO Auto-generated constructor stub
	}
	
}
abstract class RunningBehaviour {
	abstract public void go();
}

class goByFormulaOne extends RunningBehaviour{
	public void go(){
		System.out.println("I am running on road very fast");
	}
}

class goByBike extends RunningBehaviour{
	public void go() {
		System.out.println("i am running on road");
	}
}

class goByJet extends RunningBehaviour{
	public void go() {
		System.out.println("I am flying very fast");
	}
}

class goByPlane extends RunningBehaviour{
	public void go(){
		System.out.println("I am flying");
	}
}

package com.gunjan.design_pattern;
public class TestClass {
	public static void main(String[] args) {
		Computer computer = new Monitor(new Disk(new Computer()));
		System.out.println("You're getting "+computer.description());
	}
}

class Computer
{
	public String description(){
		return "computer ";
	}
}

abstract class AbstractDecorator extends Computer{
	Computer computer;
	public AbstractDecorator(Computer computer) {
		this.computer = computer;
	}
}

class Disk extends AbstractDecorator{

	public Disk(Computer computer) {
		super(computer);
	}
	public String description(){
		return computer.description()+ "and Disk "; 
	}
	
}

class Monitor extends AbstractDecorator{

	public Monitor(Computer computer) {
		super(computer);
	}
	public String description(){
		return computer.description()+ "and Monitor "; 
	}
	
}


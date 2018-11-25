package com.gunjan.design_pattern;

public class DeadState implements ThreadState{

	SimulateThreadState simulateThreadState;
	
	
	public DeadState(SimulateThreadState simulateThreadState) {
		this.simulateThreadState = simulateThreadState;
	}


	public void chooseBySchedular() {
		System.out.println("wrong operartion");
	}


	public void done() {
		System.out.println("wrong operartion");
	}


	public void sleep() {
		System.out.println("wrong operartion");
	}


	public void sleepOver() {
		System.out.println("wrong operartion");
	}


	public void start() {
		System.out.println("wrong operartion");
	}


	public void swapBySchedular() {
		System.out.println("wrong operartion");
	}

	
	
	
}

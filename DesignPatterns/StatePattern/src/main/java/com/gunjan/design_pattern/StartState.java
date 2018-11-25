package com.gunjan.design_pattern;

public class StartState implements ThreadState{

	SimulateThreadState simulateThreadState;
	
	
	public StartState(SimulateThreadState simulateThreadState) {
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
		System.out.println("moving to runnable state ");
		simulateThreadState.setThreadState(simulateThreadState.getRunnableState());
		
	}


	public void swapBySchedular() {
		System.out.println("wrong operartion");
	}

	
	
}

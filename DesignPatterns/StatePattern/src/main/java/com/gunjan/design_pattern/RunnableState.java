package com.gunjan.design_pattern;

public class RunnableState implements ThreadState{

	SimulateThreadState simulateThreadState;
	
	
	public RunnableState(SimulateThreadState simulateThreadState) {
		this.simulateThreadState = simulateThreadState;
	}


	public void chooseBySchedular() {
		System.out.println("moving from runnable to running state ");
		simulateThreadState.setThreadState(simulateThreadState.getRunningState());
		
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

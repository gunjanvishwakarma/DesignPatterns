package com.gunjan.design_pattern;

public class WaitingState implements ThreadState{

	SimulateThreadState simulateThreadState;
	
	
	public WaitingState(SimulateThreadState simulateThreadState) {
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
		System.out.println("moving form waiting to runnable ");
		simulateThreadState.setThreadState(simulateThreadState.getRunnableState());
	}


	public void start() {
		System.out.println("wrong operartion");
	}


	public void swapBySchedular() {
		System.out.println("wrong operartion");
	}

	
	
}

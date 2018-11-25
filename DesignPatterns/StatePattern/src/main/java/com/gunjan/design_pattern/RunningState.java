package com.gunjan.design_pattern;

public class RunningState implements ThreadState{

	SimulateThreadState simulateThreadState;
	
	
	public RunningState(SimulateThreadState simulateThreadState) {
		this.simulateThreadState = simulateThreadState;
	}


	public void chooseBySchedular() {
		System.out.println("wrong operartion");
	}


	public void done() {
		System.out.println("moving form running to done ");
		simulateThreadState.setThreadState(simulateThreadState.getDeadState());
	}


	public void sleep() {
		System.out.println("moving form running to waiting ");
		simulateThreadState.setThreadState(simulateThreadState.getWaitingState());
	}


	public void sleepOver() {
		System.out.println("wrong operartion");
	}


	public void start() {
		System.out.println("wrong operartion");
	}


	public void swapBySchedular() {
		System.out.println("moving from running to runnable ");
		simulateThreadState.setThreadState(simulateThreadState.getRunnableState());
		
	}

	
	
}

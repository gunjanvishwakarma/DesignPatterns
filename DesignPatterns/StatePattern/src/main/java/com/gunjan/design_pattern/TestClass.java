package com.gunjan.design_pattern;

public class TestClass {

	
	public static void main(String[] args) {
		SimulateThreadState state = new SimulateThreadState();
		state.start();
		state.chooseBySchedular();
		//state.done();
		state.sleep();
		state.sleepOver();
		state.chooseBySchedular();
		state.done();
	}

}

class SimulateThreadState {
	ThreadState startState;
	ThreadState runnableState;
	ThreadState runningState;
	ThreadState waitingState;
	ThreadState deadState;
	
	ThreadState threadState ;
	
	public SimulateThreadState(){
		startState = new StartState(this);
		runnableState = new RunnableState(this);
		runningState = new RunningState(this);
		waitingState = new WaitingState(this);
		deadState = new DeadState(this);
		threadState = startState;
		
	}

	public void chooseBySchedular() {
		threadState.chooseBySchedular();
		
	}

	public void done() {
		threadState.done();
		
	}

	public void sleep() {
		threadState.sleep();
		
	}

	public void sleepOver() {
		threadState.sleepOver();
		
	}

	public void start() {
		threadState.start();
	}

	public void swapBySchedular() {
		threadState.swapBySchedular();
		
	}

	public ThreadState getThreadState() {
		return threadState;
	}

	public void setThreadState(ThreadState threadState) {
		this.threadState = threadState;
	}

	public ThreadState getStartState() {
		return startState;
	}

	public void setStartState(ThreadState startState) {
		this.startState = startState;
	}

	public ThreadState getRunnableState() {
		return runnableState;
	}

	public void setRunnableState(ThreadState runnableState) {
		this.runnableState = runnableState;
	}

	public ThreadState getRunningState() {
		return runningState;
	}

	public void setRunningState(ThreadState runningState) {
		this.runningState = runningState;
	}

	public ThreadState getWaitingState() {
		return waitingState;
	}

	public void setWaitingState(ThreadState waitingState) {
		this.waitingState = waitingState;
	}

	public ThreadState getDeadState() {
		return deadState;
	}

	public void setDeadState(ThreadState deadState) {
		this.deadState = deadState;
	}
	
	
	
	
}

interface ThreadState{
	abstract public void start();
	abstract public void chooseBySchedular();
	abstract public void swapBySchedular();
	abstract public void sleepOver();
	abstract public void sleep();
	abstract public void done();
}

class StartState implements ThreadState{

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


class RunnableState implements ThreadState{

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


class RunningState implements ThreadState{

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


class WaitingState implements ThreadState{

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


class DeadState implements ThreadState{

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



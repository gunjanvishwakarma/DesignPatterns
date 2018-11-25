package com.gunjan.design_pattern;

public class SimulateThreadState {
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

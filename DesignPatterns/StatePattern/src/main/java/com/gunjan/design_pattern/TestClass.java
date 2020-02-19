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



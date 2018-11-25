package com.gunjan.design_pattern;

public interface ThreadState{
	abstract public void start();
	abstract public void chooseBySchedular();
	abstract public void swapBySchedular();
	abstract public void sleepOver();
	abstract public void sleep();
	abstract public void done();
}

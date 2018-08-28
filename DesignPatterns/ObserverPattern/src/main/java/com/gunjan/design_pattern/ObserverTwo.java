package com.gunjan.design_pattern;

public class ObserverTwo implements Observer{

	public void update(String data) {
		System.out.println("data received by observer two :"+data);
	}

}

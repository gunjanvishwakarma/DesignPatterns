package com.gunjan.design_pattern;

public class ObserverOne implements Observer{

	public void update(String data) {
		System.out.println("data received by observer one :"+data);
	}

}

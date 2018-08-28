package com.gunjan.design_pattern;

import java.util.ArrayList;

public class ConcreteSubject implements Subject{

	ArrayList<Observer> observerList = new ArrayList<Observer>();
	public void notifyObserver() {
		for (Observer observer : observerList) {
			observer.update("gunjan");
		}
	}

	public void registerObserver(Observer observer) {
		this.observerList.add(observer);
		
	}

	public void removeObserver(Observer observer) {
		this.observerList.remove(observer);
	}
	
	
}

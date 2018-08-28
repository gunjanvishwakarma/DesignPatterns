package com.gunjan.design_pattern;

public class TestClass {

	public static void main(String[] args) {
		ObserverOne observerOne = new ObserverOne();
		ObserverTwo observerTwo = new ObserverTwo();
		ConcreteSubject concreteSubject  = new  ConcreteSubject();
		concreteSubject.registerObserver(observerOne);
		concreteSubject.registerObserver(observerTwo);
		concreteSubject.notifyObserver();
		
		concreteSubject.removeObserver(observerTwo);
		concreteSubject.notifyObserver();
		
	}

}

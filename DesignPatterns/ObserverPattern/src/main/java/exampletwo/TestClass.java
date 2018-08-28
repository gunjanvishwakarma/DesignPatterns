package exampletwo;

public class TestClass {

	public static void main(String[] args) {
		ObserverOne observerOne = new ObserverOne();
		ObserverTwo observerTwo = new ObserverTwo();
		ConcreteSubject concreteSubject  = new  ConcreteSubject();
		concreteSubject.addObserver(observerOne);
		concreteSubject.addObserver(observerTwo);
		
		concreteSubject.statusChange();
		concreteSubject.notifyObservers();
		
		concreteSubject.deleteObserver(observerTwo);
		
		concreteSubject.statusChange();
		concreteSubject.notifyObservers();
	}

}

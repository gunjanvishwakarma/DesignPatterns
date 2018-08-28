package exampletwo;

import java.util.Observable;
import java.util.Observer;

public class ObserverOne implements Observer{

	public void update(Observable arg0, Object arg1) {
		System.out.println("update function of observer one is called");
	}

}

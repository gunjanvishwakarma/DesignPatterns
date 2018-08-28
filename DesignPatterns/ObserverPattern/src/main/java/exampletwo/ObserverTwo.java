package exampletwo;

import java.util.Observable;
import java.util.Observer;

public class ObserverTwo implements Observer{

	public void update(Observable arg0, Object arg1) {
		System.out.println("update function of observer two is called");
	}

}

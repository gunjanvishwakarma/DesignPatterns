package exampletwo;
import java.util.Observable;

public class ConcreteSubject extends Observable{

	public void statusChange(){
		setChanged();
	}
	
}

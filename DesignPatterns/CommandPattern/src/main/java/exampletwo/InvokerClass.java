package exampletwo;

import java.util.ArrayList;
import java.util.Iterator;

public class InvokerClass {
 ArrayList<Command> commandArrayList = new ArrayList<Command>();
 public InvokerClass(){
	 commandArrayList.add(new FileCommand(new FileReceiver()));
	 commandArrayList.add(new OpenCommand(new OpenReceiver()));
	 commandArrayList.add(new PrintCommand(new PrintReceiver()));
	 commandArrayList.add(new ExitCommand(new ExitReceiver()));
 }
 Command getCommand(String strCommand){
	 Iterator<Command> i = commandArrayList.iterator();
	 
	 while(i.hasNext()){
		 Command cmd= i.next();
		 String cmdType = cmd.getType();
		 if(cmdType.equals(strCommand)){
			return cmd;
		 }
	 }
	 return null;
	 }
}

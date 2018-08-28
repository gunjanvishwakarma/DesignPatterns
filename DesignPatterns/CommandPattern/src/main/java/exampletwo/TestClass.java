package exampletwo;

public class TestClass {
 public static void main(String str[]){
	 InvokerClass   invokerClass = new InvokerClass();
	 
	 Command command = invokerClass.getCommand("file");
	 command.execute();
	 command = invokerClass.getCommand("open");
	 command.execute();
	 command = invokerClass.getCommand("print");
	 command.execute();
	 command = invokerClass.getCommand("exit");
	 command.execute();
 }
}

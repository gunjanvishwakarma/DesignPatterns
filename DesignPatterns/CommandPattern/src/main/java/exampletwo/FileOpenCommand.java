package exampletwo;

class FileCommand implements Command{
	FileReceiver fileReceiver;
	public String strCommand = "file";
	
	public FileCommand(FileReceiver fileReceiver) {
		super();
		this.fileReceiver = fileReceiver;
	}
	public void execute() {
		fileReceiver.action();
	}
	public String getType() {
		return strCommand;
	}

}
class OpenCommand implements Command{
	OpenReceiver openReceiver;
	public String strCommand = "open";
	
	public OpenCommand(OpenReceiver openReceiver) {
		super();
		this.openReceiver = openReceiver;
	}
	public void execute() {
		openReceiver.action();
	}
	public String getType() {
		return strCommand;
	}

}
class PrintCommand implements Command{
	PrintReceiver printReceiver;
	public String strCommand = "print";
	
	public PrintCommand(PrintReceiver printReceiver) {
		super();
		this.printReceiver = printReceiver;
	}
	public void execute() {
		printReceiver.action();
	}
	public String getType() {
		return strCommand;
	}

}
class ExitCommand implements Command{
	ExitReceiver exitReceiver;
	public String strCommand = "exit";
	
	public ExitCommand(ExitReceiver exitReceiver) {
		super();
		this.exitReceiver = exitReceiver;
	}
	public void execute() {
		exitReceiver.action();
	}
	public String getType() {
		return strCommand;
	}

}


class FileReceiver{
	public void action(){
		System.out.println("file receiver");
	}
}
class OpenReceiver{
	public void action(){
		System.out.println("opening a file");
	}
}
class PrintReceiver{
	public void action(){
		System.out.println("printing a file");
	}
}
class ExitReceiver{
	public void action(){
		System.out.println("closing and exiting a file");
	}
}

package com.gunjan.design_pattern;

//Driver.java

public class Driver {


	public static void main(String [] args) {

	Person personAlex = new Person();
	personAlex.setName("Alex");
	personAlex.setAddress("567 Thorndale Ave.");
	personAlex.setYearOfBirth(1971);

	System.out.println("The object before calling execute() ");
	System.out.println("" + personAlex.toString());

	ChangeAddressCommand tmp = new ChangeAddressCommand(personAlex, "1442 Elmdale Ave.");
	tmp.execute();
	System.out.println("");
	System.out.println("Calling execute()........");
	System.out.println("");

	System.out.println("The object after calling execute() ");
	System.out.println("" + personAlex.toString());
	System.out.println("The address was changed.");

	}
}

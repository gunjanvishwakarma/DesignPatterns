package com.gunjan.design_pattern;

public class Person {

	private String name;
	private String address;
	private int yearOfBirth;

	public Person()
	{
		name = "unknown";
		address = "unknown";
		yearOfBirth = 0;
	}

	public String getName() { return name; }

	public String setName(String inputName) {
		name = inputName;
		return name;
	}

	public String getAddress() { return address; }

	public String setAddress(String inputAddress) {
		address = inputAddress;
		return address;
	}

	public int getYearOfBirth() { return yearOfBirth; }

	public int setYearOfBirth(int inputYearOfBirth) {
		yearOfBirth = inputYearOfBirth;
		return yearOfBirth;
	}

	public String toString() {
		return "name: "+name+"\naddress: "+address+"\nYear of birth: "+yearOfBirth;
	}

}

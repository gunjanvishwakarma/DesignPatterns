package com.gunjan.design_pattern;

public class ChangeAddressCommand implements Command
{

	private Person inputPerson;
	private String newAddress;

	public ChangeAddressCommand(Person pInputPerson, String pNewAddress) {
		inputPerson = pInputPerson;
		newAddress = pNewAddress;
	}

	public void execute() {
		inputPerson.setAddress(newAddress);
	}

}


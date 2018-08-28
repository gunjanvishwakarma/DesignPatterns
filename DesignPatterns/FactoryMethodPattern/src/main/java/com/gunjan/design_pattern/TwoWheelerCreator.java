package com.gunjan.design_pattern;

public class TwoWheelerCreator extends AbstractVehicleCreator{

	
	@Override
	public Vehicle create(String type) {
		if(type.equals("pulser")){
			return new Pulser();
		}else if(type.equals("Splendor")){
			return new Splendor();
		}else {
			return null;
		}
		
	}

}

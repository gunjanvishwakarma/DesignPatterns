package com.gunjan.design_pattern;

public class FourWheelerCreator extends AbstractVehicleCreator{

	public Vehicle create(String type) {
		if(type.equals("safari")){
			return new Safari();
		}else if(type.equals("scorpio")){
			return new Scorpio();
		}else if(type.equals("toyota")){
			return new Toyota();
		}else{
			return null;
		}
		
	}

}

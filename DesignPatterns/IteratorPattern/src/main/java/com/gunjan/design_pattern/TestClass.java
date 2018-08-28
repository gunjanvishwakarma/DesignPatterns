package com.gunjan.design_pattern;

import java.util.ArrayList;

public class TestClass {
	public static void main(String str[]){
		ArrayList<String> lunchMenuList = new ArrayList<String>();
		lunchMenuList.add("dal");
		lunchMenuList.add("bhaat");
		lunchMenuList.add("chokha");
		System.out.println("\nprinting lunch menu list\n");
		LunchMenu lunchMenu = new LunchMenu(lunchMenuList);
		while(lunchMenu.hasNext()){
			System.out.println((String)lunchMenu.next());
		}
		
		String[] dinnerMenuList = {"roti","dud","bhunjia"};
		DinnerMenu dinnerMenu = new DinnerMenu(dinnerMenuList);
		System.out.println("\nprinting dinner menu list\n");
		while(dinnerMenu.hasNext()){
			System.out.println((String)dinnerMenu.next());
		}
	}
	
}

interface Iterator{
boolean hasNext();
Object next();
}

class LunchMenu implements Iterator{

	ArrayList<String> lunchMenuList = new ArrayList<String>();
	int position = 0;
	public LunchMenu(ArrayList<String> lunchMenuList){
		this.lunchMenuList =lunchMenuList;
	}
	
	
	public boolean hasNext() {
		if(position <lunchMenuList.size()){
			return true;
		}
		return false;
	}

	public Object next() {
		Object obj = lunchMenuList.get(position);
		position++;
		return obj;
	}
	
}

class DinnerMenu implements Iterator{

	String array[] = new String[3];
	int position = 0;
	public DinnerMenu(String array[]){
		this.array = array;
	}
	public boolean hasNext() {
		if(position <array.length){
			return true;
		}
		return false;
	}

	public Object next() {
		Object obj = array[position];
		position++;
		return obj;
	}
	
}
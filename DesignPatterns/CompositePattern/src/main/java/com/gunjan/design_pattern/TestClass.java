package com.gunjan.design_pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class TestClass {

	public static void main(String[] args) {
		
		MenuComponent dinnerMenu = new Menu("Dinner");
		MenuComponent lunchMenu = new Menu("Lunch");
		MenuItem dinnerMenuItem1 = new MenuItem("Roti");
		MenuItem dinnerMenuItem2 = new MenuItem("Dud");
		MenuItem dinnerMenuItem3 = new MenuItem("Bhunjiya");
		MenuItem lunchMenuItem1 = new MenuItem("Dal");
		MenuItem lunchMenuItem2 = new MenuItem("Bhaat");
		MenuItem lunchMenuItem3 = new MenuItem("Chokha");
		dinnerMenu.add(dinnerMenuItem1);
		dinnerMenu.add(dinnerMenuItem2);
		dinnerMenu.add(dinnerMenuItem3);
		lunchMenu.add(lunchMenuItem1);
		lunchMenu.add(lunchMenuItem2);
		lunchMenu.add(lunchMenuItem3);
		
		MenuComponent allMenu = new Menu("root");
		allMenu.add(dinnerMenu);
		allMenu.add(lunchMenu);
		allMenu.print();
		
		
	}

}
class MenuComponent{
	 public void add(MenuComponent menuComponent){
		 throw new UnsupportedOperationException();
	 }
	 public MenuComponent getChild(int i){
		 throw new UnsupportedOperationException();
	 }
	 public String getName(){
		 throw new UnsupportedOperationException();
	 }
	 public void print(){
		 throw new UnsupportedOperationException();
	 }
}
class Menu extends MenuComponent{
	String name;
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	public Menu(String name){
		this.name=name;
	}
	public String getName(){
		 return name;
	}
	
	public void add(MenuComponent menuComponent){
		this.menuComponents.add(menuComponent);
	}
	public MenuComponent getChild(int i){
		return menuComponents.get(i);
	}
	public void print(){
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while(iterator.hasNext()){
			iterator.next().print();
			
		}
	}
	
}
class MenuItem extends MenuComponent{
	String name;
	public MenuItem(String name){
		this.name=name;
	}
	public String getName(){
		 return name;
	}
	public void print(){
		 System.out.println(" "+name);
	}
}


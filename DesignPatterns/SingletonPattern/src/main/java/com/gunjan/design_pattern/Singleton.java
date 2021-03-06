package com.gunjan.design_pattern;

public class Singleton {
	// this is not safe in case of multihreading
	private static Singleton uniqueInstance;
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		if(uniqueInstance == null)
		{
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}

class Singleton1 {
	// this is thread safe but with less performance because
	private static Singleton1 uniqueInstance;
	private Singleton1(){
		
	}
	public static synchronized Singleton1 getInstance(){
		if(uniqueInstance == null)
		{
			uniqueInstance = new Singleton1();
		}
		return uniqueInstance;
	}
}

class Singleton2 {
	private static Singleton2 uniqueInstance = new Singleton2();
	private Singleton2(){}
	public static synchronized Singleton2 getInstance(){
	return uniqueInstance;
	}
}

class Singleton3 {
	private volatile static Singleton3 uniqueInstance;
	private Singleton3(){
		
	}
	public static Singleton3 getInstance(){
		if(uniqueInstance == null){
			synchronized(Singleton3.class){
				if(uniqueInstance == null)
				{
					uniqueInstance = new Singleton3();
				}
			}
		}
		
		return uniqueInstance;
	}
}


class BillPughSingleton {
	
	private BillPughSingleton(){}
	
	private static class SingletonHelper{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance(){
		return SingletonHelper.INSTANCE;
	}
}

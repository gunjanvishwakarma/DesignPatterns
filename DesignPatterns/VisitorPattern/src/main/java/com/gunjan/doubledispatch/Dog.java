package com.gunjan.doubledispatch;

public class Dog implements Animal
{
    
    @Override
    public void makeSound()
    {
        System.out.println("Bark!!!");
    }
    
    @Override
    public void makeSound(Dog d)
    {
        System.out.println("Dog interacting with Dog");
    }
    
    @Override
    public void makeSound(Cat c)
    {
        System.out.println("Dog interacting with Cat");
    }
    
    @Override
    public void printNumber(Integer i)
    {
        System.out.println("dog printing integer");
    }
    
    @Override
    public void printNumber(Float f)
    {
        System.out.println("dog printing float");
    }
}

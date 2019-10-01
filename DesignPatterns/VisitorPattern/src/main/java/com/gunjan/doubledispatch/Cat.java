package com.gunjan.doubledispatch;

public class Cat implements Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Meow!!!");
    }
    
    @Override
    public void makeSound(Dog d)
    {
        System.out.println("Cat interacting with Dog");
    }
    
    @Override
    public void makeSound(Cat c)
    {
        System.out.println("Cat interacting with Cat");
    }
    
    @Override
    public void printNumber(Integer i)
    {
        System.out.println("cat printing integer");
    }
    
    @Override
    public void printNumber(Float f)
    {
        System.out.println("cat printing float");
    }
}

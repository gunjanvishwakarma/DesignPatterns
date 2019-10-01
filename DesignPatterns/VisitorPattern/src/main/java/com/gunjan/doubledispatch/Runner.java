package com.gunjan.doubledispatch;

import java.util.List;

public class Runner
{
    public static void main(String[] args)
    {
        Animal dog = new Dog();
        Animal cat = new Cat();
    
        // Single Dispatch.
        dog.makeSound();
        cat.makeSound();
        
        // Double Dispatch will not work in java
        dog.makeSound(dog);
        cat.makeSound(cat);
    
        Number i = new Integer(1);
        Number f = new Float(1.0);
    
        dog.printNumber(i);
        dog.printNumber(f);
    }
}

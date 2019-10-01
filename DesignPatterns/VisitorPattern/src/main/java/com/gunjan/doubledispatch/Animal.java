package com.gunjan.doubledispatch;

public interface Animal
{
    void makeSound();
    
    void makeSound(Dog d);
    
    void makeSound(Cat c);
    
    void printNumber(Integer i);
    
    void printNumber(Float f);
}

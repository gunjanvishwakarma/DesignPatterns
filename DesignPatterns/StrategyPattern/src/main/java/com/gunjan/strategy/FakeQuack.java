package com.gunjan.strategy;

public class FakeQuack implements QuackBehavior
{
    public void quack()
    {
        System.out.println("Qwak");
    }
}

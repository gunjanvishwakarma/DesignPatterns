package com.gunjan.chainofresponsibility.handlers;

public class BillingSupportHandler extends Handler
{
    
    public BillingSupportHandler(int level)
    {
        this.level = level;
    }
    
    @Override
    protected void handleRequest(String message)
    {
        System.out.println("BillingSupportHandler: Processing request. " + message);
    }
    
}


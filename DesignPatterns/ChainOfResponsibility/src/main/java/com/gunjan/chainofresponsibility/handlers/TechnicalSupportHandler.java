package com.gunjan.chainofresponsibility.handlers;


public class TechnicalSupportHandler extends Handler
{
    
    public TechnicalSupportHandler(int level)
    {
        this.level = level;
    }
    
    @Override
    protected void handleRequest(String message)
    {
        System.out.println("TechnicalSupportHandler: Processing request " + message);
        
    }
}
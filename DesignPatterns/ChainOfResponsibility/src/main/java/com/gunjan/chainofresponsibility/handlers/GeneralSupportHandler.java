package com.gunjan.chainofresponsibility.handlers;


public class GeneralSupportHandler extends Handler
{
    
    public GeneralSupportHandler(int level)
    {
        this.level = level;
    }
    
    @Override
    protected void handleRequest(String message)
    {
        System.out.println("GeneralSupportHandler: Processing request. " + message);
        
    }
}


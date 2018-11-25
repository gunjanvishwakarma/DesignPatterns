package com.gunjan.chainofresponsibility;

import com.gunjan.chainofresponsibility.handlers.Handler;

public class RequestorClientTest
{
    
    public static void main(String[] args)
    {
        new RequestorClientTest().testGetHandlerChain();
    }
    
    public void testGetHandlerChain()
    {
        
        Handler handler = RequestorClient.getHandlerChain();
        handler.receiveRequest(Handler.TECHNICAL, " I'm having problem with my internet connectivity.");
        System.out.println("............................................");
        handler.receiveRequest(Handler.BILLING, "Please resend my bill of this month.");
        System.out.println("............................................");
        handler.receiveRequest(Handler.GENERAL, "Please send any other plans for home users.");
    }
}
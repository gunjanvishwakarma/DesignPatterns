package com.gunjan.chainofresponsibility;

import com.gunjan.chainofresponsibility.handlers.Handler;
import com.gunjan.chainofresponsibility.handlers.BillingSupportHandler;
import com.gunjan.chainofresponsibility.handlers.GeneralSupportHandler;
import com.gunjan.chainofresponsibility.handlers.TechnicalSupportHandler;

public class RequestorClient
{
    
    public static Handler getHandlerChain()
    {
        
        
        Handler technicalSupportHandler = new TechnicalSupportHandler(Handler.TECHNICAL);
        Handler billingSupportHandler = new BillingSupportHandler(Handler.BILLING);
        Handler generalSupportHandler = new GeneralSupportHandler(Handler.GENERAL);
        
        technicalSupportHandler.setNextHandler(billingSupportHandler);
        billingSupportHandler.setNextHandler(generalSupportHandler);
        
        return technicalSupportHandler;
    }
    
}

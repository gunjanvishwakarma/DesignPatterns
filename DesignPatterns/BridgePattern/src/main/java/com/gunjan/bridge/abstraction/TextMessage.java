package com.gunjan.bridge.abstraction;

import com.gunjan.bridge.implementation.MessageSender;

public class TextMessage extends Message{

    public TextMessage(MessageSender messageSender){
        super(messageSender);
    }
    @Override
    public void send(){
      messageSender.sendMessage();
    }

}

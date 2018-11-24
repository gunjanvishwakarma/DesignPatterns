import com.gunjan.bridge.abstraction.Message;
import com.gunjan.bridge.abstraction.TextMessage;
import com.gunjan.bridge.implementation.EmailMessageSender;
import com.gunjan.bridge.implementation.MessageSender;
import com.gunjan.bridge.implementation.TextMessageSender;

public class MessageTest
{
    
    public static void main(String[] args)
    {
        new MessageTest().testSend();
    }
    
    public void testSend()
    {
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();
        
        MessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new TextMessage(emailMessageSender);
        emailMessage.send();
    }
}
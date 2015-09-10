package SpringHelloWorld2.SpringHelloWorld2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApplication {
MessageService messageService ;
@Autowired
public void setService(MessageService msgService)
{
	this.messageService = msgService ;
}
public boolean processMessage(String msg, String rec)
{
	return messageService.SendMessage(msg, rec) ;
	
}
}

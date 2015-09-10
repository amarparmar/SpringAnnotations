package SpringHelloWorld2.SpringHelloWorld2;

public class EmailService implements MessageService {

public boolean SendMessage(String msg, String rec) 
{
	System.out.println("Send email to " +rec+ "with message " + msg) ;
	return true ;
}


}

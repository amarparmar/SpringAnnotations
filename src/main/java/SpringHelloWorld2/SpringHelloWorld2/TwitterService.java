package SpringHelloWorld2.SpringHelloWorld2;

public class TwitterService implements MessageService {
	public boolean SendMessage(String message, String rec)
	{
		System.out.println("Twitter message sent to " +rec+ "with message" +message) ;
		return true ;
	}

}

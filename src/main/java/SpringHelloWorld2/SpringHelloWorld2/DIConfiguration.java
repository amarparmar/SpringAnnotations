package SpringHelloWorld2.SpringHelloWorld2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value={"SpringHelloWorld2.SpringHelloWorld2"})
public class DIConfiguration {

@Bean
public MessageService getMessageService()
{
	return new TwitterService() ;
}
}

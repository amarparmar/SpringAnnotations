package SpringHelloWorld2.SpringHelloWorld2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class) ;
MyApplication app = context.getBean(MyApplication.class) ;
app.processMessage("Hello Amarjeet", "amarjeet@yah.com") ;
context.close();
	}

}

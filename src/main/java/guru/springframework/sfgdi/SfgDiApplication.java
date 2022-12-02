package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controllers.MyController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		// get handle on spring application context
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		// ask context for instance of controller
		MyController myController = (MyController)ctx.getBean("myController");

		String greetings = myController.sayHello();

		System.out.println(greetings);

	}

}

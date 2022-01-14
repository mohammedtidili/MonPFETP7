package cigma.pfe.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;

public class MonApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		ClientController crtl = (ClientController) applicationContext.getBean("controller");
		Client client1 = (Client) applicationContext.getBean("client");
		crtl.save(client1);

	}

}

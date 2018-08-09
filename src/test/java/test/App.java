package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import repositories.ClientRepository;
import repositories.VolRepository;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		VolRepository volRepository = ctx.getBean(VolRepository.class);

	}

}

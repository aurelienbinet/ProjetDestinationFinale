package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import repositories.AeroportRepository;
import repositories.ClientRepository;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		AeroportRepository aeroportRepository = ctx.getBean(AeroportRepository.class);
		aeroportRepository.findCustomByIdWithVolEscale((long) 100);

	}

}

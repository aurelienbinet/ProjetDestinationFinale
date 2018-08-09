package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import repositories.AeroportRepository;
import repositories.ClientRepository;
import repositories.CompagnieAerienneRepository;
import repositories.PassagerRepository;
import repositories.VilleRepository;
import repositories.VolRepository;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		AeroportRepository aeroportRepository = ctx.getBean(AeroportRepository.class);
//		aeroportRepository.findCustomByIdWithVolEscale((long) 100);
//		aeroportRepository.findCustomByIdWithVille((long) 100);
//		aeroportRepository.findCustomByIdWithVolArrive((long) 100);
//		aeroportRepository.findCustomByIdWithVolDepart((long) 100);
		
		VilleRepository villeRepository = ctx.getBean(VilleRepository.class);
		villeRepository.findCustomAeroportByIdWithVille((long) 100);
	
//		VolRepository volRepository = ctx.getBean(VolRepository.class);
//		//volRepository.findcu
//	
//		PassagerRepository passagerRepository = ctx.getBean(PassagerRepository.class);
//		passagerRepository.findCustomByIdWithReservation((long) 100);
//	
//		ClientRepository clientRepository = ctx.getBean(ClientRepository.class);
//		clientRepository.findCustomByIdWithReservation((long) 100);
		
		CompagnieAerienneRepository caRepository = ctx.getBean(CompagnieAerienneRepository.class);
		caRepository.findCustomVolByIdWithCompagnie((long) 100);
	
	}

}

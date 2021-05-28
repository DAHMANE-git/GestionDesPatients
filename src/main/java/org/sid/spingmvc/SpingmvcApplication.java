package org.sid.spingmvc;

import java.util.Date;

import org.sid.spingmvc.dao.PatientRepository;
import org.sid.spingmvc.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpingmvcApplication implements CommandLineRunner{
	@Autowired
	private PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpingmvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		patientRepository.save(new Patient(null,"hassan",new Date(),false,4));
		patientRepository.save(new Patient(null,"mohammed",new Date(),false,6));
		patientRepository.save(new Patient(null,"Samira",new Date(),false,9));

		
		patientRepository.findAll().forEach(p->{
			System.out.println(p.getName());
		});
	}

}

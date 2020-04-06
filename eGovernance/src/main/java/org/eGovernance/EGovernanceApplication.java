package org.eGovernance;

import java.util.stream.Stream;

import org.eGovernance.model.UserDetails;
import org.eGovernance.repository.UserDetailsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EGovernanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EGovernanceApplication.class, args);
	}
	
	/*
	 * @Bean CommandLineRunner userDetails(UserDetailsRepository
	 * userDetailsRepository) {
	 * 
	 * return args-> {
	 * 
	 * 
	 * UserDetails u=new UserDetails(); u.setEmail("VISHAL31GUPTA@GMAIL.COM");
	 * u.setFirstName("Vishal");
	 * 
	 * Stream.of(u) .forEach(userDetails->{userDetailsRepository.save(userDetails)
	 * .subscribe(System.out::println);});;
	 * 
	 * }; }
	 */

}

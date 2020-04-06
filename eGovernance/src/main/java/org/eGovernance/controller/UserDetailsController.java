package org.eGovernance.controller;

import org.eGovernance.model.UserDetails;
import org.eGovernance.service.UserDetailsSVC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class UserDetailsController {

	@Autowired
	UserDetailsSVC userDetailsSVC;
	
	@GetMapping("/save")
	public Mono<UserDetails> saveUserDetails()
	{
		UserDetails u=new UserDetails();
		u.setEmail("VISHAL31GUPTA@GMAIL.COM");
		u.setFirstName("Pankaj");
		u.setLastName("Gupta");
		
		return userDetailsSVC.insert(u);
		
	}
	
	@GetMapping("/all")
	public Flux<UserDetails> getAll()
	{
		
		return userDetailsSVC.findAll();
	}
	
}

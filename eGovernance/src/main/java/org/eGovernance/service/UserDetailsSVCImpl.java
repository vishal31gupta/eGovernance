package org.eGovernance.service;

import org.eGovernance.model.UserDetails;
import org.eGovernance.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class UserDetailsSVCImpl extends BaseSVCImpl implements UserDetailsSVC{

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Override
	public Mono<UserDetails> insert(UserDetails userDetails) {
		
		sendMailToUser(userDetails.getFirstName(), userDetails.getUserName(), userDetails.getEmail());
		
		userDetailsRepository.save(userDetails).subscribe();
		return null;
	}
	
	public void sendMailToUser(String name, String userName, String mailId)
	{
		StringBuilder text=new StringBuilder();
		text.append("Dear "+name+",\n\n");
		text.append("You have been successfully registered in eGovernance. Please find below your login credentials\n\n");
		text.append("User Name : "+userName+"\n");
		text.append("Password : "+getRandomString(10));
		sendMail(mailId, "Registration Successful in eGovernance!!!", text.toString());
	}
	
	public Flux<UserDetails> findAll(){
		
		return userDetailsRepository.findAll();
	}
	
	
}

package org.eGovernance.service;

import org.eGovernance.model.UserDetails;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserDetailsSVC extends BaseSVC{

	Mono<UserDetails> insert(UserDetails userDetails);
	public Flux<UserDetails> findAll();
	
}

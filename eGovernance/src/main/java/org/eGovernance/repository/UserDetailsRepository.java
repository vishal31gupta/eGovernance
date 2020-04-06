package org.eGovernance.repository;

import java.math.BigInteger;

import org.eGovernance.model.UserDetails;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends ReactiveMongoRepository<UserDetails, String>{

}

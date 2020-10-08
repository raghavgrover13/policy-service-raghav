package com.customer.policyservicerg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.customer.policyservicerg.model.Policy;

@Repository
public interface PolicyRepository extends MongoRepository<Policy, String> {

}

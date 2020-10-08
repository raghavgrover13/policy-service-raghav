package com.customer.policyservicerg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.policyservicerg.model.Customer;
import com.customer.policyservicerg.model.Policy;
import com.customer.policyservicerg.repository.PolicyRepository;

@Service
public class PolicyService {

	@Autowired
	CustomerService customerService;
	
	@Autowired
	PolicyRepository policyRepository;
	
	

	public Policy createPolicy(Policy policy) {
		Customer customer;
		customer=customerService.getCustomerDetails(policy.getCustomerDetails().getCustomerId());
		policy.setCustomerDetails(customer);
		return policyRepository.save(policy);
		
	}
	
	public Policy createPolicye(Policy policy) {
		Customer customer;
		customer=customerService.getCustomerDetailsExch(policy.getCustomerDetails().getCustomerId());
		policy.setCustomerDetails(customer);
		return policyRepository.save(policy);
		
	}
	
	public Policy createPolicyg(Policy policy) {
		Customer customer;
		customer=customerService.getCustomerDetailsObject(policy.getCustomerDetails().getCustomerId());
		policy.setCustomerDetails(customer);
		return policyRepository.save(policy);
		
	}



	public List<Policy> getPolicies() {
		return policyRepository.findAll();
	}

	public String deletePolicy(String policyId) {
		
		policyRepository.deleteById(policyId);
		return "The policy is deleted succesfully :"+policyId;
	}

	

	
	
}

package com.customer.policyservicerg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customer.policyservicerg.model.Policy;
import com.customer.policyservicerg.service.PolicyService;

@RestController
public class PolicyController {
	
	@Autowired
	PolicyService policyService;
	
	@RequestMapping(value="/hello")
	public String hello() {
		return "Hello from Restful Service";
	};

	
   @RequestMapping(value="/policy" , method= RequestMethod.POST)
   public Policy createPolicy(@RequestBody Policy policy)
   {
	   
	   return policyService.createPolicy(policy);
	   
   }
   
   @RequestMapping(value="/policye" , method= RequestMethod.POST)
   public Policy createPolicye(@RequestBody Policy policy)
   {
	   
	   return policyService.createPolicye(policy);
	   
   }
   
   @RequestMapping(value="/policyg" , method= RequestMethod.POST)
   public Policy createPolicyg(@RequestBody Policy policy)
   {
	   
	   return policyService.createPolicyg(policy);
	   
   }
   
   @RequestMapping(value="/policies", method= RequestMethod.GET)
   public List<Policy> getPolicies()
   {
	   return policyService.getPolicies();
   }
   
   @RequestMapping(value="/policyd/{policyId}",method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
   public String deletePolicy(@PathVariable("policyId") String policyId)
   {
	   return policyService.deletePolicy(policyId);
   }
	
}

package com.zoho.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entityes.Billing;
import com.zoho.repository.BillingRepository;

@Service
public class BillingServicesImpl implements BillingServices {
	
	@Autowired
	private BillingRepository billingRepo;

	@Override
	public void generateInvoice(Billing billing) {
		billingRepo.save(billing);

	}

}

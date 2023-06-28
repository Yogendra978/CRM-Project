package com.zoho.services;

import java.util.List;

import com.zoho.entityes.Lead;

public interface LeadServices {
	
	public void saveLead(Lead lead);
	
	public List<Lead> getAllLeads();

	public Lead findLeadById(long id);

	public void deleteOneLead(long id);

	

	

	
}

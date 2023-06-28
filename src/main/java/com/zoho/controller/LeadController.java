package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entityes.Contacts;
import com.zoho.entityes.Lead;
import com.zoho.services.ContactsServices;
import com.zoho.services.LeadServices;

@Controller
public class LeadController {
	
	@Autowired
	private LeadServices LeadServices;
	
	@Autowired
	private ContactsServices ContactService;

	@RequestMapping(value = "/create",method = RequestMethod.GET)
	public String viewCreateLeadForm() {
		return "create_lead";
		
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveOneLead(@ModelAttribute("lead") Lead lead,Model model) {
		LeadServices.saveLead(lead);
		model.addAttribute("lead",lead);
		return "lead_info";
	}
	
	@RequestMapping("/listleads")
	public String listLead(Model model) {
		List<Lead> leads = LeadServices.getAllLeads();
		model.addAttribute("leads",leads);
		return "list_leads";
	}
	
	@RequestMapping("/leadinfo")
	public String leadInfo(@RequestParam("id") long id,Model model) {
		 Lead lead = LeadServices.findLeadById(id);
		model.addAttribute("lead",lead);
		return "lead_info";
		
	}
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id,Model model) {
		Lead lead = LeadServices.findLeadById(id);
		Contacts contact = new Contacts();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		ContactService.saveContactInfomation(contact);
		
		LeadServices.deleteOneLead(id);
		
		List<Contacts> contacts = ContactService.getAllContacts();
		model.addAttribute("contacts",contacts);
		return "list_contacts";
	}
	

}

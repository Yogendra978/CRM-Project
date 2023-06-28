package com.zoho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entityes.Billing;
import com.zoho.entityes.Contacts;
import com.zoho.services.BillingServices;
import com.zoho.services.ContactsServices;

@Controller
public class BillingController {

	@Autowired
	private ContactsServices contactServices;
	
	@Autowired
	private BillingServices billingServices;
	
	@RequestMapping("/billingForm")
	public String viewbillingForm(@RequestParam("contactId") long id,Model model) {
		Contacts contacts = contactServices.findLeadById(id);
		model.addAttribute("contacts",contacts);
		return "create_bill";
	}
	
	@RequestMapping("/geneteateBill")
	public String generateBill(@ModelAttribute("billing") Billing billing,Model model) {
		billingServices.generateInvoice(billing);
		model.addAttribute("billing",billing);
		return "list_contacts";
	}
	
	
}

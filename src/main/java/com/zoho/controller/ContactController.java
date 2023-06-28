package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zoho.entityes.Contacts;
import com.zoho.services.ContactsServices;

@Controller
public class ContactController {

	@Autowired
	private ContactsServices contactServices;
	
	@RequestMapping("/listcontacts")
	public String listContacts(Model model) {
		List<Contacts> contacts = contactServices.getAllContacts();
		model.addAttribute("contacts",contacts);
		return "list_contacts";
	}
}

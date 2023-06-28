package com.zoho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entityes.Contacts;
import com.zoho.repository.ContactsRepo;

@Service
public class ContactsServicesImpl implements ContactsServices {
	
	@Autowired
	private ContactsRepo contactsRepo;

	@Override
	public void saveContactInfomation(Contacts contact) {
		contactsRepo.save(contact);
		
	}

	@Override
	public List<Contacts> getAllContacts() {
		List<Contacts> findAll = contactsRepo.findAll();
		return findAll;
	}

	@Override
	public Contacts findLeadById(long id) {
		Optional<Contacts> findById = contactsRepo.findById(id);
		Contacts contacts = findById.get();
		return contacts;
	}

	@Override
	public void deleteOneContacts(long id) {
		contactsRepo.deleteById(id);
		
	}
	
	
}

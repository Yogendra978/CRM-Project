package com.zoho.services;

import java.util.List;

import com.zoho.entityes.Contacts;

public interface ContactsServices {
	public void saveContactInfomation(Contacts contact);
	public List<Contacts> getAllContacts();
	public Contacts findLeadById(long id);
	public void deleteOneContacts(long id);
}

package com.zoho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho.entityes.Contacts;

public interface ContactsRepo extends JpaRepository<Contacts, Long>{

}

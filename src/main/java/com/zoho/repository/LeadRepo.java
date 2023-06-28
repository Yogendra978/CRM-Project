package com.zoho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho.entityes.Lead;

public interface LeadRepo extends JpaRepository<Lead, Long> {
	

}

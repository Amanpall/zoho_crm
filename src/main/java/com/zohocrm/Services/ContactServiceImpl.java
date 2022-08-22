package com.zohocrm.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Entities.Contact;

import com.zohocrm.Repositries.ContactRepositry;

@Service
public class ContactServiceImpl implements ContactService{
@Autowired
	private ContactRepositry CallContactRepo;
	
	@Override
	public void saveContact(Contact contact) {
		try {
			CallContactRepo.save(contact);
		} catch (Exception e) {
		}
		

	}

	@Override
	public List<Contact> Listall() {
		List<Contact> list = CallContactRepo.findAll();
		
		return list;
	}

	@Override
	public Contact GetcontactID(long id) {
		Optional<Contact> Findbyid = CallContactRepo.findById(id);
		 Contact  contact= Findbyid.get();
		 return  contact;
		
	}


	}


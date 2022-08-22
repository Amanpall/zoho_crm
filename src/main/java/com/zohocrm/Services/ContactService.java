package com.zohocrm.Services;

import java.util.List;

import com.zohocrm.Entities.Contact;



public interface ContactService {
public void saveContact(Contact contact);
public List<Contact> Listall();
public Contact GetcontactID(long id);

}

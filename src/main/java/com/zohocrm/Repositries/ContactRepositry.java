package com.zohocrm.Repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.Entities.Contact;


public interface ContactRepositry extends JpaRepository< Contact, Long> {

}

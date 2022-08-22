package com.zohocrm.Repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.Entities.Lead;

public interface LeadRepositries extends JpaRepository<Lead , Long> {

}

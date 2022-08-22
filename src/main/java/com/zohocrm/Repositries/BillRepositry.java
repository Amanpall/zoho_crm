package com.zohocrm.Repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.Entities.Bill;


public interface BillRepositry extends JpaRepository<Bill , Long> {

}

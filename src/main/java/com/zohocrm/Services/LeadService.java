package com.zohocrm.Services;

import java.util.List;

import com.zohocrm.Entities.Lead;

public interface LeadService {
public void saveLead(Lead LeadContainer);
public List<Lead> Listall();
public Lead GetleadID(long id);
public void Deletelead(long id);
}

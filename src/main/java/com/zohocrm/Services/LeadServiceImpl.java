package com.zohocrm.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Entities.Lead;
import com.zohocrm.Repositries.LeadRepositries;
@Service
public class LeadServiceImpl implements LeadService {
@Autowired
	private LeadRepositries CallleadRepo;
	
	@Override
	public void saveLead(Lead LeadContainer) {
		CallleadRepo.save(LeadContainer);

	}

	@Override
	public List<Lead> Listall() {
		List<Lead> list = CallleadRepo.findAll();
		
		return list;
	}

	@Override
	public Lead GetleadID(long id) {
		Optional<Lead> Findbyid = CallleadRepo.findById(id);
		 Lead  lead= Findbyid.get();
		 return  lead;
	}

	@Override
	public void Deletelead(long id) {
		CallleadRepo.deleteById(id);
	}
	
}
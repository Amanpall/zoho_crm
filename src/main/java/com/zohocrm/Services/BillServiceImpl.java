package com.zohocrm.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Entities.Bill;
import com.zohocrm.Repositries.BillRepositry;
@Service 
public class BillServiceImpl implements BillService {

	
	@Autowired 
	private BillRepositry CallBillRepo;
	
	@Override
	public void SaveBills(Bill bill) {
		CallBillRepo.save(bill);
	}

	@Override
	public List<Bill> listallBill() {
		List<Bill> all = CallBillRepo.findAll();
		return all;
	}

}

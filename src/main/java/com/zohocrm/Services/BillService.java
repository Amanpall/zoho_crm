package com.zohocrm.Services;

import java.util.List;

import com.zohocrm.Entities.Bill;

public interface BillService {
public void SaveBills(Bill bill);

public List<Bill> listallBill();
}

package com.zohocrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.zohocrm.Entities.Bill;
import com.zohocrm.Services.BillService;

@Controller
public class BillController {
@Autowired
private BillService CallBillService;
	@RequestMapping("/vanshu")
	public String SaveBillDetail(@ModelAttribute("bill") Bill bill,ModelMap model) {
		CallBillService.SaveBills(bill);
		model.addAttribute("Msg3", "The Bill Is Genrated**");
		return "Lead_info2";
		
		
	}
	@RequestMapping("/ListallBills")
public String Listall(ModelMap model)	{

		List<Bill> bill = CallBillService.listallBill();
model.addAttribute("bill", bill);
		
		return "Bill_list";
}
}


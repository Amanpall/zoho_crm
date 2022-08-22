package com.zohocrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.Entities.Contact;
import com.zohocrm.Services.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService CallContactService;
	
	@RequestMapping("/contact all")
	public String ContactList(ModelMap model) {
		 List<Contact> Contacts = CallContactService.Listall();
		  model.addAttribute("Contacts" ,Contacts);
		  return "Contact_list";
	}
	@RequestMapping("/GetContactById")
	public String getContactbyId(@RequestParam("id") long id,ModelMap InbuiltClass) {
		Contact aman = CallContactService.GetcontactID(id);
		InbuiltClass.addAttribute("aman", aman);
		return "Lead_info2";
		
	}
	
}

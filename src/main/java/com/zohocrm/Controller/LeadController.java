package com.zohocrm.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.Entities.Contact;
import com.zohocrm.Entities.Lead;
import com.zohocrm.Services.ContactService;
import com.zohocrm.Services.LeadService;

@Controller 
public class LeadController {
	@Autowired
	private LeadService CallLeadService;
	@Autowired
	private ContactService CallContactService;
@RequestMapping("/View")
	public String ViewCreateleadpage() {
		return "Lead_page";
		
	}
	
@RequestMapping("/Save")
public String SaveOneLead(@ModelAttribute("LeadContainerr") Lead LeadContainer,ModelMap InbuiltClass) {
	CallLeadService.saveLead(LeadContainer);
	InbuiltClass.addAttribute("msg" ,"The Lead is Saved!");
	
	return "Lead_page";
	
}
@RequestMapping("listallLeads")
public String ListAll(ModelMap modelmap){
	List<Lead> listall = CallLeadService.Listall();
	modelmap.addAttribute("listall", listall);
	return "Lead_list";
}
@RequestMapping("/getleadById")
public String getleadbyId(@RequestParam("id") long id,ModelMap InbuiltClass) {
	Lead LeadContainer = CallLeadService.GetleadID(id);
	InbuiltClass.addAttribute("LeadContainer", LeadContainer);
	return "Lead_info";
	
}
@RequestMapping("/Convertintocontact")
public String ConvertintoContacts(@RequestParam("id") long id, ModelMap model) {
	Lead LeadContainer= CallLeadService.GetleadID(id);
	
	Contact contact=new Contact();
	 contact.setFirstName(LeadContainer.getFirstName());
	 contact.setLastName(LeadContainer.getLastName());
	 contact.setEmail(LeadContainer.getEmail());
	 contact.setLeadSource(LeadContainer.getLeadSource());
	 contact.setMobile(LeadContainer.getMobile());
	 CallContactService.saveContact( contact);
	 CallLeadService.Deletelead(id);
	model.addAttribute("msg2", "Converted to Contacts Succesfully***");
	return "Lead_info";
	
}

}
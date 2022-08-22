package com.zohocrm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.Utility.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService callEmailServic;
@RequestMapping("/EmailSend")
	public String ComposeEmail(@RequestParam("Emailid") String email, ModelMap InbuiltClass) {
	InbuiltClass.addAttribute("email", email);
	
	return "compose_email";
		
	}
@RequestMapping("/SendEmail")
public String Emailsend(@RequestParam("to") String to,@RequestParam("subject") String subject,@RequestParam("text")String text) {
	
	callEmailServic.sendsimplemessage(to, subject, text);
	
	return"compose_email";
	
}
	
}

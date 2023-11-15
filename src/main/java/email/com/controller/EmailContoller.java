package email.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import email.com.service.EmailServer;

@RestController
@RequestMapping("/email")
public class EmailContoller {
		
	@Autowired
	private EmailServer emailServer;
	
	@GetMapping("/send")
	public String sendMail() {
		String to= "bhindaspur@help.com";
		String sub= " HEPL FOR SCHOOL and Hospital";
		String body= "This fund Help this village";
		
		emailServer.sendMail(to, sub, body);
		 return "Email sent successfully! ";
	}
	
}

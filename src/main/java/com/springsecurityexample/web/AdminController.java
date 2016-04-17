package com.springsecurityexample.web;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springsecurityexample.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value="admin", method=RequestMethod.GET)
	public String adminPage(ModelMap model){
		//this is just the username of the user who is logged and sending this particular request
		//System.out.println("The username of the current user is: "+principal.getName());  
		return "admin";
	}
	@RequestMapping(value="adminService", method=RequestMethod.GET)
	public String adminService(ModelMap model){
		adminService.performSomeAdminService();
		return "admin";
	}
	@RequestMapping(value="admin/Service", method=RequestMethod.GET)
	//public String adminSubService(ModelMap model, Principal principal){
	public String adminSubService(ModelMap model){
		//System.out.println("The name of the current user is:  "+principal+"!");
		adminService.performSomeAdminService();
		return "admin";
	}
}

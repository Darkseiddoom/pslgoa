package com.springmvcone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginPageController {
    @Autowired
    private LoginService loginservice;
	@RequestMapping(path="/login.do", method=RequestMethod.GET)
	public String login() {
		return "loginpage";
	}
	
	@RequestMapping(path="/login.do", method=RequestMethod.POST)
	public String check(@RequestParam("login") String login,@RequestParam("password") String password, Model model) {
		if (loginservice.check(login,password))
			return "success";
			else
			{
				model.addAttribute("error", "Invalid login/password");
				return "loginpage";
			}
	}
	
}

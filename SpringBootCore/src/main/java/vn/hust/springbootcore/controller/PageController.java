package vn.hust.springbootcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.hust.springbootcore.model.User;
import vn.hust.springbootcore.service.LoginService;

@Controller
public class PageController {
	@Autowired
	private LoginService service;

	@RequestMapping(value = { "/welcome", "/" }, method = RequestMethod.GET)
	public String showWelcome() {
		return "welcome";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin() {
		return "login";
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String showHome(@ModelAttribute User user) {
		if (service.checkLogin(user)) {
			return "home";
		} else {
			return "redirect:login?message=error";
		}
	}

}

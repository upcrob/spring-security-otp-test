package com.upcrob.springsecurity.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping(value = { "/", "/public" }, method = RequestMethod.GET)
	public ModelAndView publicPage() {

		ModelAndView model = new ModelAndView();
		model.setViewName("public");
		return model;

	}

	@RequestMapping(value = "/private", method = RequestMethod.GET)
	public ModelAndView privatePage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("private");
		return model;

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		return model;
	}
}
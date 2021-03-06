package com.sefaarslan.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sefaarslan.service.BlogService;

@Controller
public class PetClinicController {
	
	@Autowired
	private BlogService blogService;
	
	@RequestMapping("/pcs")
	@ResponseBody
	public String welcome() {
		return "Welcome to My Blog!";
	}
	
	@RequestMapping("/users")
	public ModelAndView getUsers() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("users", blogService.findUsers());
		mav.setViewName("users");
		return mav;
	}
}

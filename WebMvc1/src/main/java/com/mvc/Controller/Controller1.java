package com.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller1 {
	@RequestMapping(path="/hey",method=RequestMethod.POST)
	public String Map(@RequestParam("fname") String fname,@RequestParam("lname")String lname,Model model) {
		model.addAttribute("fname",fname);
		model.addAttribute("lname",lname);
		return "index";
	}
	@RequestMapping("/output")
	public String m1() {
		return "output";
	}

}

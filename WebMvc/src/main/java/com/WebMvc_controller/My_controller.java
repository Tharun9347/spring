package com.WebMvc_controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class My_controller {
	@RequestMapping("/in")
	//@ResponseBody
	public String add() {
		//String s="Tharun";
		return "index";
	}
	@RequestMapping("/multi")
	public ModelAndView multi(HttpServletRequest request)
	{
		int a=Integer.parseInt(request.getParameter("a"));
		int b=Integer.parseInt(request.getParameter("b"));
		int c=a*b;
		ModelAndView mv=new ModelAndView();
		mv.addObject("res",c);
		mv.setViewName("Display");
		return mv;
	}
	@RequestMapping("pv/{id}")
	public ModelAndView hey(@PathVariable("id") int a)
	{
		ModelAndView mv1=new ModelAndView();
		mv1.addObject("res",a);
		mv1.setViewName("dis");
		//System.out.println(a);
		return mv1;
	}

}

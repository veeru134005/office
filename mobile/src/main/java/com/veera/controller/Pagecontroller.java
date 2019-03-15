package com.veera.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.veera.back.daointer.DaoInter;

@Controller
public class Pagecontroller {

	@Autowired
	private DaoInter categoryDao;

	@RequestMapping(value = { "/", "/index", "/home" })
	public ModelAndView page() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		
		mv.addObject("catagories",categoryDao.list());
		
		mv.addObject("userClickHome", true);

		return mv;

	}

	@RequestMapping("/about")
	public ModelAndView about() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About");
		mv.addObject("userClickAbout", true);

		return mv;
	}

	@RequestMapping("/contact")
	public ModelAndView contact() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "contact");
		mv.addObject("userClickContact", true);

		return mv;

	}

}

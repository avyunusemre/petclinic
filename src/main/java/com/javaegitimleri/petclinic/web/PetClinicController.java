package com.javaegitimleri.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.javaegitimleri.petclinic.service.PetClinicService;

@Controller
public class PetClinicController {
	
	@Autowired
	private PetClinicService petClinicService;

	@RequestMapping("/login.html")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}

	@RequestMapping(value = {"/","index.html"})
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/owners")
	public ModelAndView getOwners() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("owners",petClinicService.findOwners());
		mav.setViewName("owners");
		return mav;
	}
	
	@RequestMapping("/pcs")
	@ResponseBody // => bu anotasyon olmazsa controller bir view return edeceğini düşünür ve return degerini
				  // view değeri olarak döndürmeye calısır.
	public String welcome() {
		return "Welcome to PetClinic World";
	}
}

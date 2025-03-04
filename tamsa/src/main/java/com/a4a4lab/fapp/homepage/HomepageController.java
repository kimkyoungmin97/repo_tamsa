package com.a4a4lab.fapp.homepage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {
	
	@Autowired
	HomepageService homepageService;
	
	@RequestMapping(value ="/homepage/homepageXdmList")
	public String homepageXdmList(Model model) {
		
		model.addAttribute("list", homepageService.selectList());
		
		return "homepage/homepageXdmList";
	}
	
	@RequestMapping(value="/homepage/homepageXdmView")
	public String homepageXdmView(Model model, HomepageDto homepageDto) {
		
		model.addAttribute("item", homepageService.selectOne(homepageDto));
		
		return "homepage/homepageXdmView";
	}

}

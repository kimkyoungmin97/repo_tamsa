package com.a4a4lab.fapp.affiliation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AffiliationController {
	
	@Autowired
	AffiliationService affiliationService;
	@RequestMapping(value ="/affiliation/affiliationXdmList")
	public String affiliationXdmList(Model model) {
		model.addAttribute("list", affiliationService.selectList());
		return "affiliation/affiliationXdmList";
	}
	@RequestMapping(value="/affiliation/affiliationXdmView")
	public String affiliationView(Model model, AffiliationDto affiliationDto) {
		model.addAttribute("item", affiliationService.selectOne(affiliationDto));
		return"affiliation/affiliationXdmView";
	}

}

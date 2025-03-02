package com.a4a4lab.fapp.grouptype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GrouptypeController {
	
	@Autowired
	GrouptypeService grouptypeService;
	@RequestMapping(value ="/grouptype/grouptypeXdmList")
	public String codeGroupXdmList(Model model) {
		
		model.addAttribute("list", grouptypeService.selectList());
		
		return "grouptype/grouptypeXdmList";
	}
	

}

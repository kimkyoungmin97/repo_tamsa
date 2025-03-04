package com.a4a4lab.fapp.addcontact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddContactController {
	
	@Autowired
	AddContactService addContactService;
	@RequestMapping(value="/addcontact/addcontactXdmList")
	public String addcontactXdmList(Model model){
		
		model.addAttribute("list", addContactService.selectList());
		
		
		return "addcontact/addcontactXdmList";
	}
	@RequestMapping(value="/addcontact/addcontactXdmView")
	public String addcontactXdmView(Model model, AddContactDto addContactDto){
		model.addAttribute("item", addContactService.selectOne(addContactDto));
		return "addcontact/addcontactXdmView";
	}

}

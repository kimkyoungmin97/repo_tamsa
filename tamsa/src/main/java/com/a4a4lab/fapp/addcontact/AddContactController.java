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
	@RequestMapping(value="/addcontact/addcontactXdmForm")
	public String addcontactXdmForm() {
		return "addcontact/addcontactXdmForm";
	}
	@RequestMapping(value="addcontact/addcontactXdmInst")
	public String addcontactXdmInst(AddContactDto addContactDto) {
		addContactService.insert(addContactDto);
		return "redirect:/addcontact/addcontactXdmList";
	}
	@RequestMapping(value="addcontact/addcontactXdmMform")
	public String addcontactXdmMform(Model model, AddContactDto addContactDto) {
		model.addAttribute("item", addContactService.selectOne(addContactDto));
		return "addcontact/addcontactXdmMform";
	}
	@RequestMapping(value="addcontact/addcontactXdmUpdt")
	public String addcontactXdmUpdt(AddContactDto addContactDto) {
		addContactService.update(addContactDto);
		return "redirect:/addcontact/addcontactXdmList";
	}

}

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
	public String grouptypeXdmList(Model model) {
		
		model.addAttribute("list", grouptypeService.selectList());
		
		return "grouptype/grouptypeXdmList";
	}
	
	@RequestMapping(value="/grouptype/grouptypeXdmView")
	public String grouptypeXdmView(Model model, GrouptypeDto grouptypeDto) {
		model.addAttribute("item", grouptypeService.selectOne(grouptypeDto));
		return "grouptype/grouptypeXdmView";
	}
	@RequestMapping(value="/grouptype/grouptypeXdmForm")
	public String grouptypeXdmForm() {
		return "grouptype/grouptypeXdmForm";
	}
	@RequestMapping(value="grouptype/grouptypeXdmInst")
	public String grouptypeXdmInst(GrouptypeDto grouptypeDto) {
		grouptypeService.insert(grouptypeDto);
		return "redirect:/grouptype/grouptypeXdmList";
	}
	
	@RequestMapping(value="/grouptype/grouptypeXdmMform")
	public String grouptypeXdmMform(Model model, GrouptypeDto grouptypeDto) {
		
		model.addAttribute("item", grouptypeService.selectOne(grouptypeDto));
		return "grouptype/grouptypeXdmMform";
	}
	@RequestMapping(value="/grouptype/grouptypeXdmUpdt")
	public String grouptypeXdmUpdt(GrouptypeDto grouptypeDto) {
		grouptypeService.update(grouptypeDto);
		return "redirect:/grouptype/grouptypeXdmList";
	}
	

}

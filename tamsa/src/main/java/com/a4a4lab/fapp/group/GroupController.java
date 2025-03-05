package com.a4a4lab.fapp.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GroupController {
	
	@Autowired
	GroupService groupService;
	@RequestMapping(value ="/group/groupXdmList")
	public String groupXdmList(Model model) {
		model.addAttribute("list", groupService.selectList());
		
		return "group/groupXdmList";
	}
	
	@RequestMapping(value="/group/groupXdmView")
	public String groupXdmView(Model model, GroupDto groupDto) {
		
		model.addAttribute("item", groupService.selectOne(groupDto));
		return "group/groupXdmView";
	}
	@RequestMapping(value="/group/groupXdmForm")
	public String groupXdmForm() {
		return "group/groupXdmForm";
	}
	@RequestMapping(value="/group/groupXdmInst")
	public String groupXdmInst(GroupDto groupDto) {
		groupService.insert(groupDto);
		return "redirect:/group/groupXdmList";
	}

}

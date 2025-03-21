package com.a4a4lab.fapp.date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	
	@Autowired
	DateService dateService;
	@RequestMapping(value ="/date/dateXdmList")
	public String dateXdmList(Model model) {
		model.addAttribute("list", dateService.selectList());
		
		return "date/dateXdmList";
	}
	@RequestMapping(value="/date/dateXdmView")
	public String dateXdmView(Model model, DateDto dateDto) {
		model.addAttribute("item", dateService.selectOne(dateDto));
		return "date/dateXdmView";
	}
	@RequestMapping(value="/date/dateXdmForm")
	public String dateXdmForm() {
		return "date/dateXdmForm";
	}
	@RequestMapping(value="/date/dateXdmInst")
	public String dateXdmInst(DateDto dateDto) {
		dateService.insert(dateDto);
		return "redirect:/date/dateXdmList";
	}
	@RequestMapping(value="/date/dateXdmMform")
	public String dateXdmMform(Model model, DateDto dateDto) {
		model.addAttribute("item", dateService.selectOne(dateDto));
		return "date/dateXdmMform";
	}
	@RequestMapping(value="/date/dateXdmUpdt")
	public String dateXdmUpdt(DateDto dateDto) {
		dateService.update(dateDto);
		return "redirect:/date/dateXdmList";
	}

}

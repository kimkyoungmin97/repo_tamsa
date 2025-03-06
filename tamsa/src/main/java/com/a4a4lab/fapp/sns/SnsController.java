package com.a4a4lab.fapp.sns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SnsController {
	
	@Autowired
	SnsService snsService;
	
	@RequestMapping(value ="/sns/snsXdmList")
	public String snsXdmList(Model model) {
		
		model.addAttribute("list", snsService.selectList());
		
		return "sns/snsXdmList";
	}
	
	@RequestMapping(value ="/sns/snsXdmView")
	public String snsXdmView(Model model, SnsDto snsDto) {
		
		model.addAttribute("item", snsService.selectOne(snsDto));
		return "sns/snsXdmView";
	}
	@RequestMapping(value="/sns/snsXdmForm")
	public String snsXdmForm() {
		return "sns/snsXdmForm";
	}
	
	@RequestMapping(value="/sns/snsXdmInst")
	public String snsXdmInst(SnsDto snsDto) {
		
		snsService.insert(snsDto);
		return "redirect:/sns/snsXdmList";
	}
	
	@RequestMapping(value="/sns/snsXdmMform")
	public String snsXdmMform(Model model, SnsDto snsDto) {
		model.addAttribute("item", snsService.selectOne(snsDto));
		return "sns/snsXdmMform";
	}
	@RequestMapping(value="/sns/snsXdmUpdt")
	public String snsXdmUpdt(SnsDto snsDto) {
		snsService.update(snsDto);
		return "redirect:/sns/snsXdmList";
	}
	

}

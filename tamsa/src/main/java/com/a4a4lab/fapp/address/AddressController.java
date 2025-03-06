package com.a4a4lab.fapp.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddressController {
	
	@Autowired
	AddressService addressService;
	@RequestMapping(value="/address/addressXdmList")
	public String addressXdmList(Model model) {
		
		model.addAttribute("list",addressService.selectList());
		return "address/addressXdmList";
	}
	@RequestMapping(value="/address/addressXdmView")
	public String addressXdmView(Model model, AddressDto addressDto) {
		model.addAttribute("item", addressService.selectOne(addressDto));
		return "address/addressXdmView";
	}
	@RequestMapping(value="/address/addressXdmForm")
	public String addressXdmForm() {
		return "address/addressXdmForm";
	}
	@RequestMapping(value="/address/addressXdmInst")
	public String addressXdmInst(AddressDto addressDto) {
		addressService.insert(addressDto);
		return "redirect:/address/addressXdmList";
	}
	@RequestMapping(value="/address/addressXdmMform")
	public String addressXdmMform(Model model, AddressDto addressDto) {
		model.addAttribute("item", addressService.selectOne(addressDto));
		return "address/addressXdmMform";
	}
	@RequestMapping(value="/address/addressXdmUpdt")
	public String addressXdmUpdt(AddressDto addressDto) {
		addressService.update(addressDto);
		
		return "redirect:/address/addressXdmList";
	}

}

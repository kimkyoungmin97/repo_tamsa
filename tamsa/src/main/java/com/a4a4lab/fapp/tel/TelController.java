package com.a4a4lab.fapp.tel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TelController {
	
	// 입력되는 주소에 매칭이 되는 html 정보를 정의
	// html로 데이터 전달
	
	@Autowired
	TelService telService;
	
//	@RequestMapping(value ="/tel/telXdmList")
//	public String codeGroupXdmList(Model model) {
//		
//		List<TelDto> telDtos = new ArrayList<>();
//		
//		telDtos = telService.selectList();
//		
//		model.addAttribute("list", telDtos);
//		
//		return "tel/telXdmList";
//	}
	@RequestMapping(value ="/tel/telXdmList")
	public String telXdmList(Model model) {
		
		model.addAttribute("list", telService.selectList());
		
		return "tel/telXdmList";
	}
	@RequestMapping(value ="/tel/telXdmView")
	public String telXdmView(Model model, TelDto telDto ) {
		
		
		model.addAttribute("item", telService.selectOne(telDto));
		
		return "tel/telXdmView";
	}
	

	

}

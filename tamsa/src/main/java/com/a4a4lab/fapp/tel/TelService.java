package com.a4a4lab.fapp.tel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelService {
	
	//로직을 정의 하는 부분
	//여러건의 데이터를 가지고 온다.
	
	@Autowired
	TelDao telDao;
	// TelDao telDao = new TelDao();
	
//	public List<TelDto> selectList(){
//		List<TelDto> telDtos = new ArrayList<>(); 
//		
//		telDtos = telDao.selectList();
//		
//		return telDtos;
//	}
	public List<TelDto> selectList(){
		
		return  telDao.selectList();
	}
	public TelDto selectOne(TelDto telDto){
		
		return  telDao.selectOne(telDto);
	}
	
	public int insert(TelDto telDto) {
		
		return telDao.insert(telDto);
	}
	public int update(TelDto telDto) {
		return telDao.update(telDto);
	}
	
	

}

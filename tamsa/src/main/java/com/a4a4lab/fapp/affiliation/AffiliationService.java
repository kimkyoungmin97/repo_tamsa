package com.a4a4lab.fapp.affiliation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AffiliationService {
	
	@Autowired
	AffiliationDao affiliationDao;
	
	public List<AffiliationDto> selectList(){
		return affiliationDao.selectList();
	}
	public AffiliationDto selectOne(AffiliationDto affiliationDto) {
		return affiliationDao.selectOne(affiliationDto);
		
	}

}

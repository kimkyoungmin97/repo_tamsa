package com.a4a4lab.fapp.affiliation;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AffiliationDao {
	
	public List<AffiliationDto> selectList();
	public AffiliationDto selectOne(AffiliationDto affiliationDto);

}

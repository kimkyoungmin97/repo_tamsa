package com.a4a4lab.fapp.tel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface TelDao {
	
	// mapper에서 해당하는 쿼리와 연결 시켜 주고
	// 쿼리 결과를 가져옴
	
	public List<TelDto> selectList();
	public TelDto selectOne(TelDto telDto);
	

}

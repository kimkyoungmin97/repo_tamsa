package com.a4a4lab.fapp.date;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface DateDao {
	
	public List<DateDto> selectList();
	public DateDto selectOne(DateDto dateDto);

}

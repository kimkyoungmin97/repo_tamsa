package com.a4a4lab.fapp.date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DateService {
	
	@Autowired
	DateDao dateDao;
	public List<DateDto> selectList() {
		return dateDao.selectList();
	}
	public DateDto selectOne(DateDto dateDto) {
		return dateDao.selectOne(dateDto);
	}
	public int insert(DateDto dateDto) {
		return dateDao.insert(dateDto);
	}
	public int update(DateDto dateDto) {
		return dateDao.update(dateDto);
	}

}

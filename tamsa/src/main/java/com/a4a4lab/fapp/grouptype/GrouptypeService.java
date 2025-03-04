package com.a4a4lab.fapp.grouptype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class GrouptypeService {
	
	@Autowired
	GrouptypeDao grouptypeDao;
	
	public List<GrouptypeDto> selectList(){
		return grouptypeDao.selectList();
	}
	public GrouptypeDto selectOne(GrouptypeDto grouptypeDto) {
		
	
		return grouptypeDao.selectOne(grouptypeDto);
	}

}

package com.a4a4lab.fapp.grouptype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrouptypeService {
	
	@Autowired
	GrouptypeDao grouptypeDao;
	
	public List<GrouptypeDto> selectList(){
		return grouptypeDao.selectList();
	}

}

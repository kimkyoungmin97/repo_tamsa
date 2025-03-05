package com.a4a4lab.fapp.group;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {
	
	@Autowired
	GroupDao groupDao;
	
	public List<GroupDto> selectList() {
		return groupDao.selectList();
	}
	
	public GroupDto selectOne(GroupDto groupDto) {
		return groupDao.selectOne(groupDto);
		
	}
	public int insert(GroupDto groupDto) {
		return groupDao.insert(groupDto);
	}
	
	

}

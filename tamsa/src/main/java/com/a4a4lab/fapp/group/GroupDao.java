package com.a4a4lab.fapp.group;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface GroupDao {
	
	public List<GroupDto> selectList();
	public GroupDto selectOne(GroupDto groupDto);
	
	

}

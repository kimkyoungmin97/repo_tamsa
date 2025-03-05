package com.a4a4lab.fapp.grouptype;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface GrouptypeDao {
	
	public List<GrouptypeDto> selectList();
	public GrouptypeDto selectOne(GrouptypeDto grouptypeDto);
	public int insert(GrouptypeDto grouptypeDto);

}

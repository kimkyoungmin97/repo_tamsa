package com.a4a4lab.fapp.addcontact;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AddContactDao {
	
	public List<AddContactDto> selectList();
	public AddContactDto selectOne(AddContactDto addContactDto);
	public int insert(AddContactDto addContactDto);
	public int update(AddContactDto addContactDto);

}

package com.a4a4lab.fapp.addcontact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddContactService {
	
	@Autowired
	AddContactDao addContactDao;
	
	public List<AddContactDto> selectList(){
		
		return addContactDao.selectList();
	}
	public AddContactDto selectOne(AddContactDto addContactDto) {
		return addContactDao.selectOne(addContactDto);
	}
	

}

package com.a4a4lab.fapp.address;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
	
	@Autowired
	AddressDao addressDao;
	
	public List<AddressDto> selectList(){
		return addressDao.selectList();
	}
	public AddressDto selectOne(AddressDto addressDto) {
		return addressDao.selectOne(addressDto);
	}

}

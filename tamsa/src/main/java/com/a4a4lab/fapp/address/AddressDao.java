package com.a4a4lab.fapp.address;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao {
	
	public List<AddressDto> selectList();
	public AddressDto selectOne(AddressDto addressDto);

}

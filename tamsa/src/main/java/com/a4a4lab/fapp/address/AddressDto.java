package com.a4a4lab.fapp.address;

public class AddressDto {
	
	private String seq;
	private Integer representativeAddress;
	private String addressType;
	private String address;
	private String zipCode;
	private Integer addContact_seq;
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public Integer getRepresentativeAddress() {
		return representativeAddress;
	}
	public void setRepresentativeAddress(Integer representativeAddress) {
		this.representativeAddress = representativeAddress;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Integer getAddContact_seq() {
		return addContact_seq;
	}
	public void setAddContact_seq(Integer addContact_seq) {
		this.addContact_seq = addContact_seq;
	}
	
	

}

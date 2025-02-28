package com.a4a4lab.fapp.tel;

public class TelDto {
	
	// int -> Integer
	// vachar -> String
	// 원래 seq는 Integer지만 편의상 String으로 한다
	
	private String seq;
	private Integer representativeTel;
	private String telType;
	private String tel;
	private Integer addContact_seq;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public Integer getRepresentativeTel() {
		return representativeTel;
	}
	public void setRepresentativeTel(Integer representativeTel) {
		this.representativeTel = representativeTel;
	}
	public String getTelType() {
		return telType;
	}
	public void setTelType(String telType) {
		this.telType = telType;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Integer getAddContact_seq() {
		return addContact_seq;
	}
	public void setAddContact_seq(Integer addContact_seq) {
		this.addContact_seq = addContact_seq;
	}
	


}

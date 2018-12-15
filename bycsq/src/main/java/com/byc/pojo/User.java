package com.byc.pojo;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String phone;
    private String ver_code;
    private String password;
    private String company;
    private Integer status;
    private String old_phone;
    private String create_time;
    private String end_time;
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getVer_code() {
		return ver_code;
	}
	public void setVer_code(String ver_code) {
		this.ver_code = ver_code;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getOld_phone() {
		return old_phone;
	}
	public void setOld_phone(String old_phone) {
		this.old_phone = old_phone;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
    
    
}

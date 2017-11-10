package com.lstop.pojo;

import java.util.HashSet;
import java.util.Set;

public class Customer {
	private long cust_id;
	private String cust_name;
	private long cust_user_id;
	private long cust_create_id;
	private String cust_source;
	private String cust_industry;
	private String cust_level;
	private String cust_linkman;
	private String cust_phone;
	private String cust_mobile;
	private String cust_address;
	private String cust_code;
	private String cust_fax;
	private String cust_url;
	private Set<Contact> contacts = new HashSet<>();
	
	public Customer(long cust_id, String cust_name, long cust_user_id, long cust_create_id, String cust_source,
			String cust_industry, String cust_level, String cust_linkman, String cust_phone, String cust_mobile,
			String cust_address, String cust_code, String cust_fax, String cust_url, Set<Contact> contacts) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_user_id = cust_user_id;
		this.cust_create_id = cust_create_id;
		this.cust_source = cust_source;
		this.cust_industry = cust_industry;
		this.cust_level = cust_level;
		this.cust_linkman = cust_linkman;
		this.cust_phone = cust_phone;
		this.cust_mobile = cust_mobile;
		this.cust_address = cust_address;
		this.cust_code = cust_code;
		this.cust_fax = cust_fax;
		this.cust_url = cust_url;
		this.contacts = contacts;
	}

	public Customer() {
		super();
	}
	
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public String getCust_code() {
		return cust_code;
	}
	public void setCust_code(String cust_code) {
		this.cust_code = cust_code;
	}
	public String getCust_fax() {
		return cust_fax;
	}
	public void setCust_fax(String cust_fax) {
		this.cust_fax = cust_fax;
	}
	public String getCust_url() {
		return cust_url;
	}
	public void setCust_url(String cust_url) {
		this.cust_url = cust_url;
	}
	public Set<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}
	public long getCust_id() {
		return cust_id;
	}
	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public long getCust_user_id() {
		return cust_user_id;
	}
	public void setCust_user_id(long cust_user_id) {
		this.cust_user_id = cust_user_id;
	}
	public long getCust_create_id() {
		return cust_create_id;
	}
	public void setCust_create_id(long cust_create_id) {
		this.cust_create_id = cust_create_id;
	}
	public String getCust_source() {
		return cust_source;
	}
	public void setCust_source(String cust_source) {
		this.cust_source = cust_source;
	}
	public String getCust_industry() {
		return cust_industry;
	}
	public void setCust_industry(String cust_industry) {
		this.cust_industry = cust_industry;
	}
	public String getCust_level() {
		return cust_level;
	}
	public void setCust_level(String cust_level) {
		this.cust_level = cust_level;
	}
	public String getCust_linkman() {
		return cust_linkman;
	}
	public void setCust_linkman(String cust_linkman) {
		this.cust_linkman = cust_linkman;
	}
	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
	public String getCust_mobile() {
		return cust_mobile;
	}
	public void setCust_mobile(String cust_mobile) {
		this.cust_mobile = cust_mobile;
	}

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_user_id=" + cust_user_id
				+ ", cust_create_id=" + cust_create_id + ", cust_source=" + cust_source + ", cust_industry="
				+ cust_industry + ", cust_level=" + cust_level + ", cust_linkman=" + cust_linkman + ", cust_phone="
				+ cust_phone + ", cust_mobile=" + cust_mobile + ", cust_address=" + cust_address + ", cust_code="
				+ cust_code + ", cust_fax=" + cust_fax + ", cust_url=" + cust_url + ", contacts=" + contacts + "]";
	}
	
	
	
	
}

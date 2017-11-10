package com.lstop.pojo;

public class Contact {
	private long contact_id;// '联系人编号(主键)',
	private String contact_name;// '联系人姓名',
	private long contact_cust_id;// '客户id',外键
	private String contact_gender;// '联系人性别',
	private String contact_phone;// '联系人办公电话',
	private String contact_mobile;// '联系人手机',
	private String contact_email;// '联系人邮箱',
	private String contact_qq;// '联系人qq',
	private String contact_position;// '联系人职位',
	private String contact_memo;// '联系人备注',
	private Customer customer;
	public Contact(long contact_id, String contact_name, long contact_cust_id, String contact_gender,
			String contact_phone, String contact_mobile, String contact_email, String contact_qq,
			String contact_position, String contact_memo,Customer customer) {
		super();
		this.contact_id = contact_id;
		this.contact_name = contact_name;
		this.contact_cust_id = contact_cust_id;
		this.contact_gender = contact_gender;
		this.contact_phone = contact_phone;
		this.contact_mobile = contact_mobile;
		this.contact_email = contact_email;
		this.contact_qq = contact_qq;
		this.contact_position = contact_position;
		this.contact_memo = contact_memo;
		this.customer = customer;
	}
	public Contact() {
		super();
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public long getContact_id() {
		return contact_id;
	}
	public void setContact_id(long contact_id) {
		this.contact_id = contact_id;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public long getContact_cust_id() {
		return contact_cust_id;
	}
	public void setContact_cust_id(long contact_cust_id) {
		this.contact_cust_id = contact_cust_id;
	}
	public String getContact_gender() {
		return contact_gender;
	}
	public void setContact_gender(String contact_gender) {
		this.contact_gender = contact_gender;
	}
	public String getContact_phone() {
		return contact_phone;
	}
	public void setContact_phone(String contact_phone) {
		this.contact_phone = contact_phone;
	}
	public String getContact_mobile() {
		return contact_mobile;
	}
	public void setContact_mobile(String contact_mobile) {
		this.contact_mobile = contact_mobile;
	}
	public String getContact_email() {
		return contact_email;
	}
	public void setContact_email(String contact_email) {
		this.contact_email = contact_email;
	}
	public String getContact_qq() {
		return contact_qq;
	}
	public void setContact_qq(String contact_qq) {
		this.contact_qq = contact_qq;
	}
	public String getContact_position() {
		return contact_position;
	}
	public void setContact_position(String contact_position) {
		this.contact_position = contact_position;
	}
	public String getContact_memo() {
		return contact_memo;
	}
	public void setContact_memo(String contact_memo) {
		this.contact_memo = contact_memo;
	}
	@Override
	public String toString() {
		return "Contact [contact_id=" + contact_id + ", contact_name=" + contact_name + ", contact_cust_id="
				+ contact_cust_id + ", contact_gender=" + contact_gender + ", contact_phone=" + contact_phone
				+ ", contact_mobile=" + contact_mobile + ", contact_email=" + contact_email + ", contact_qq="
				+ contact_qq + ", contact_position=" + contact_position + ", contact_memo=" + contact_memo
				+ ", customer=" + customer + "]";
	}
}

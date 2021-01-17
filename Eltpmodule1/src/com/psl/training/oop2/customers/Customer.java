package com.psl.training.oop2.customers;

public class Customer 
{
	private int id;
	private String name;
	private String homePhone;
	private String cellPhone;
	private String workPhone;
	private String street;
	private String city;
	private String state;
	private int zip;
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setPrintingAddress(String street,String city, String state, int zip) {
		this.street=street;
		this.city =city;
		this.state = state;
		this.zip = zip;
	}
	public void setPhoneNumbers(String homePhone,String cellPhone,String workPhone)
	{
		this.homePhone = homePhone;
		this.cellPhone = cellPhone;
		this.workPhone = workPhone;
	}
	
	public String getCustomerDetails() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	public String printPhoneNumbers() {
		return "PhoneNumbers [homePhone=" +homePhone +", cellPhone=" +cellPhone+ ", workPhone=" + workPhone + "]";
	}
	public String printShippingAddress() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zip="
				+ zip + "]";
	}
	

}

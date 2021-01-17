package com.psl.training.exception.bean;

import java.util.Date;
import java.util.regex.Pattern;


public class Contact {
	private String firstName;
	private String middleName;
	private String lastName;
	private String dob ;
	private String Gender;
	private Date anniversary = new Date();
	private String Address;
	private String Area;
	private String City;
	private int pincode;
	private String state;
	private String country;
	private String telephoneNo;
	private String mobileNo;
	private String email;
	private String website;
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public Date getAnniversary() {
		return anniversary;
	}

	public void setAnniversary(Date anniversary) {
		this.anniversary = anniversary;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTelephoneNo() {
		return telephoneNo;
	}

	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public int validate() throws Exception {
		int flag = 1;
		
		if(firstName=="") {
			flag=0;
			throw new Exception("First Name cannot be empty");
			
		}
		else if(lastName=="") {
			flag=0;
			throw new Exception("Last Name cannot be empty");
		}
		else if(dob=="") {
			flag=0;
			throw new Exception("Date of Birth cannot be empty");
		}
		else if(telephoneNo=="" || mobileNo=="") {
			flag=0;
			throw new Exception("At least 1 contact number is required");
		}
		else if(email=="")
		{
			flag=0;
			throw new Exception("Email field is compulsory");
		}
		else if(email!=null) {
			
			String email_reg = "^[A-Za-z0-9+_.-]+@(.+)$";
			boolean b = email.matches(email_reg);
			if(b==false) {
				flag=0;
				throw new Exception("Enter email in correct format");
			}
		}
		return flag;
		
	}

}

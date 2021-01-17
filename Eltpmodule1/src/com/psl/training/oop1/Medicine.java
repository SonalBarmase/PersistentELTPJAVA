package com.psl.training.oop1;

public class Medicine {
	private String name;
	private String address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
	
	public String displayLabel() {
		return "Medicine [name=" + name + ", address=" + address + "]";
	}
	
	

}

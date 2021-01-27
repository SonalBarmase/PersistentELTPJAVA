package com.psl.training.inventory.data;

public class Customer {
	private int id;
	private String name;
	private String cellPhone;
	private String street;
	private String city;
	private String state;
	private int zip;
	private PurchaseOrder[] po;
	private int bill;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public void setPhoneNumbers(String cellPhone)
	{
		this.cellPhone = cellPhone;
	}
	
	public String printPhoneNumbers() {
		return "PhoneNumbers [cellPhone=" +cellPhone+ "]";
	}
	public String printShippingAddress() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zip="
				+ zip + "]";
	}
	
	public PurchaseOrder[] getPurchaseOrders() {
		return po;		
	}
	
	public void setPo(PurchaseOrder[] po) {
		this.po = po;
	}
	
	//Sales Info
	public void print() {
		System.out.println(this.id+ " "+ this.name);
		for (PurchaseOrder purchaseOrder : po) {
			purchaseOrder.printDetail();
		}
	}
	//Invoice
	public String CustomerInvoice() {
		String s = "";
		s=s+ this.id+ " "+ this.name;
		for (PurchaseOrder purchaseOrder : po) {
			s=s+purchaseOrder.PurchaseInvoice();
			bill+=purchaseOrder.calculateBill();
		}
		s+="Total Bill:"+bill;
		return s;
	}
	

}

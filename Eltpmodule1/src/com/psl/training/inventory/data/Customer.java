package com.psl.training.inventory.data;

public class Customer {
	private int id;
	private String name;
	private String homePhone;
	private String cellPhone;
	private String workPhone;
	private String street;
	private String city;
	private String state;
	private int zip;
	private PurchaseOrder[] po;
	private int bill;
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
	
	public String printPhoneNumbers() {
		return "PhoneNumbers [homePhone=" +homePhone +", cellPhone=" +cellPhone+ ", workPhone=" + workPhone + "]";
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
	public void CustomerInvoice() {
		System.out.println(this.id+ " "+ this.name);
		for (PurchaseOrder purchaseOrder : po) {
			purchaseOrder.PurchaseInvoice();
			bill+=purchaseOrder.calculateBill();
		}
		System.out.println("Total Bill:"+bill);
	}

}

package com.psl.training.inventory.data;

import java.util.Date;

public class PurchaseOrder {
	private int poNumber;
	private Date orderDate = new Date();
	private Date shipDate = new Date();
	private OrderItem [] oi;
	private int sum;
	
	public void create(int pono,Date orderDt) {
		this.poNumber=pono;
		this.orderDate=orderDt;		
	}
		
	public void setitem(OrderItem[] arr1 ) {
		this.oi=arr1;		
	}
	
	public void setShipDate(Date date) {
		shipDate=date;
	}


	public String printlabel() {
		return "PurchaseOrder [poNumber=" + poNumber + ", orderDate=" + orderDate + ", shipDate=" + shipDate + "]";
	}
	
	
	//calculating bill
	public int calculateBill() {
		for (OrderItem orderItem : oi) {
			sum+=orderItem.cost();
		}
		return sum;
	}
	
	//Printing Sales info
	public void printDetail() {
		for (OrderItem orderItem : oi) {
			System.out.println(orderItem.printQuantity());
		}
	}
	//Printing invoice
	public void PurchaseInvoice() {
		for (OrderItem orderItem : oi) {
			System.out.println(orderItem.OrderInvoice()+" \nOrderDate:"+this.orderDate);
		}
	}
}

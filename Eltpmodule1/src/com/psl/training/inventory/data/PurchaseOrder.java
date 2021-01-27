package com.psl.training.inventory.data;

import java.time.LocalDate;

public class PurchaseOrder {
	private int poNumber;
	private LocalDate orderDate;
	public LocalDate shipDate;
	public LocalDate getShipDate() {
		return shipDate;
	}
	private OrderItem [] oi;
	private int sum;
	
	public void create(int pono,LocalDate orderDt) {
		this.poNumber=pono;
		this.orderDate=orderDt;		
	}
		
	public void setitem(OrderItem[] arr1 ) {
		this.oi=arr1;		
	}
	
	public void setShipDate(LocalDate date) {
		shipDate=date;
	}


	public String printlabel() {
		return "PurchaseOrder [poNumber=" + poNumber + ", orderDate=" + orderDate + ", shipDate=" + shipDate + "]";
	}
	
	
	public int getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(int poNumber) {
		this.poNumber = poNumber;
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
	public String PurchaseInvoice() {
		String s="";
		for (OrderItem orderItem : oi) {
			s+=orderItem.OrderInvoice()+" \nOrderDate:"+this.orderDate;
		}
		return s;
	}
}

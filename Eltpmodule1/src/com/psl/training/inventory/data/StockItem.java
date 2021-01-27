package com.psl.training.inventory.data;

import java.util.Scanner;

public class StockItem 
{
	private int itemNumber;
	private String itemDescription;
	private double itemPrice;
	private int quantity;
	
	public int getQuantity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Quantity:");
		this.quantity= sc.nextInt();
		sc.close();
		return quantity;		
	}
	
	
	public double getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}


	public void getItem() {
		System.out.println(itemNumber+" "+itemDescription+" "+itemPrice);
	}
	public void setItem(int itemNumber,String itemDescription,double itemPrice) {
		this.itemNumber=itemNumber;
		this.itemDescription = itemDescription;
		this.itemPrice=itemPrice;		
	}

	//Sales
	public String printDescription() {
		return (itemDescription);
	}
	
	//Invoice
	public String StockInvoice() {
		return ("ItemNumber:" +itemNumber+" ItemDescription:"+itemDescription+" Quantity:"+quantity);
	}
	

}

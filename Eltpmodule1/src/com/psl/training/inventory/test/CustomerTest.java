package com.psl.training.inventory.test;

import com.psl.training.inventory.data.Customer;
import com.psl.training.inventory.data.OrderItem;
import com.psl.training.inventory.data.PurchaseOrder;
import com.psl.training.inventory.data.StockItem;

public class CustomerTest {
	public static void main(String[] args) {

		Customer c1 = new Customer(101, "Jamie");
		c1.setPrintingAddress("43,Park Avenue", "Mumbai", "Maharashtra", 400020);
		c1.setPhoneNumbers("8648280921", "6782194983", "8319949489");

		Customer c2 = new Customer(102, "Bill");
		c2.setPrintingAddress("Pratap Nagar", "Nagpur", "Maharashtra", 440022);
		c2.setPhoneNumbers("6767454754", "9899753654", "7899443647");

		Customer c3 = new Customer(103, "Joe");
		c3.setPrintingAddress("Shivaji Nagar", "Pune", "Maharashtra", 342120);
		c3.setPhoneNumbers("9877856453", "5478989544", "9645447687");

		StockItem s1 = new StockItem();
		s1.setItem(1, "Milk", 50);
		StockItem s2 = new StockItem();
		s2.setItem(2, "Chicken", 100);
		StockItem s3 = new StockItem();
		s3.setItem(3, "Egg", 10);
		StockItem s4 = new StockItem();
		s4.setItem(4, "Apple", 20);
		StockItem s5 = new StockItem();
		s5.setItem(5, "Orange", 20);

		//first Purchase
		PurchaseOrder P1 = new PurchaseOrder();
		P1.create(101, new java.util.Date(System.currentTimeMillis()));
		P1.setShipDate(new java.util.Date(System.currentTimeMillis()));
		OrderItem type1[] = new OrderItem[3];
		type1[0] = new OrderItem(2, s1);
		type1[1] = new OrderItem(2, s2);
		type1[2] = new OrderItem(12, s3);
		P1.setitem(type1);

		//Second Purchase
		PurchaseOrder P2 = new PurchaseOrder();
		P2.create(102, new java.util.Date(System.currentTimeMillis()));
		P2.setShipDate(new java.util.Date(System.currentTimeMillis()));
		OrderItem type2[] = new OrderItem[2];
		type2[0] = new OrderItem(5, s4);
		type2[1] = new OrderItem(10, s5);
		P2.setitem(type2);

		//Third Purchase
		PurchaseOrder P3 = new PurchaseOrder();
		P3.create(103, new java.util.Date(System.currentTimeMillis()));
		P3.setShipDate(new java.util.Date(System.currentTimeMillis()));
		OrderItem type3[] = new OrderItem[2];
		type3[0] = new OrderItem(5, s2);
		type3[1] = new OrderItem(10, s4);
		P3.setitem(type3);

		PurchaseOrder po_jamie[] = new PurchaseOrder[2];
		po_jamie[0] = P1;
		po_jamie[1] = P2;
		c1.setPo(po_jamie);
		
		PurchaseOrder po_bill[] = new PurchaseOrder[1];
		po_bill[0] = P3;
		c2.setPo(po_bill);

		/*	System.out.println("Orders Shipped !!");
		System.out.println(P1.printlabel());
		System.out.println(P2.printlabel());
		System.out.println(P3.printlabel());

		System.out.println("\n\nPrinting total sales by customer");
		
		System.out.println("Total sales of customer1");
		c1.print();
		
		System.out.println("\nTotal sales of customer2");
		c2.print();*/

		System.out.println("\n\nPrint all invoices");

		System.out.println("Invoice of Customer1");
		c1.CustomerInvoice();
	//	System.out.println("\nInvoice of Customer2");
	//	c2.CustomerInvoice();
		
	}
}

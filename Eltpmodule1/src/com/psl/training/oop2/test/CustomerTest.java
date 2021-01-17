package com.psl.training.oop2.test;

import com.psl.training.oop2.customers.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(101,"Sam");
		Customer c2 = new Customer(201,"Ricky");
		Customer c3 = new Customer(301,"Eric");
		
		c1.setPhoneNumbers("8648280921", "6782194983", "8319949489");
		c2.setPhoneNumbers("6767454754", "9899753654", "7899443647");
		c3.setPhoneNumbers("9877856453", "5478989544", "9645447687");
		
		c1.setPrintingAddress("43,Park Avenue", "Mumbai", "Maharashtra", 400020);
		c2.setPrintingAddress("Pratap Nagar", "Nagpur", "Maharashtra", 440022);
		c3.setPrintingAddress("Shivaji Nagar", "Pune", "Maharashtra", 342120);
		
		System.out.println("Customer 1 details");
		System.out.println(c1.getCustomerDetails());
		System.out.println(c1.printPhoneNumbers());
		System.out.println(c1.printShippingAddress());
		System.out.println();
		
		System.out.println("Customer 2 details");
		System.out.println(c2.getCustomerDetails());
		System.out.println(c2.printPhoneNumbers());
		System.out.println(c2.printShippingAddress());
		System.out.println();
		
		System.out.println("Customer 3 details");
		System.out.println(c3.getCustomerDetails());
		System.out.println(c3.printPhoneNumbers());
		System.out.println(c3.printShippingAddress());
	}

}

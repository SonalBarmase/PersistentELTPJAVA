package com.psl.training.exception.bean;

public class ArrayStack {

	public Contact[] contact;
	public int stackTop;

	public ArrayStack( int size )
	{
		contact = new Contact[size];      
		stackTop = 0;
	}

	public void push( Contact c ) throws Exception
	{
		if ( stackTop == contact.length )
		{
			throw new Exception("Stack Full");
		}
		if(contact==null)
		{
			throw new Exception("Not initialized");
		}

		contact[stackTop] = c;        
		stackTop++;                
	}

	public Contact  pop ( ) throws Exception
	{
		Contact returnContact;

		if ( stackTop == 0 )
		{
			throw new Exception("Stack empty");
		}

		returnContact = contact[ stackTop-1 ];  
		stackTop--;                        

		return returnContact;
	}
}



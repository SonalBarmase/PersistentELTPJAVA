package com.psl.training.inventory.exception;

public class MyException2 {
	public void dataCheck(String [] str) throws InsufficientDataException{
		if(str.length!=4){
			throw new InsufficientDataException("InsufficientDataException");
		}
	}
}

package com.psl.training.inventory.exception;

public class MyException1 {
	public void dataCheck(String [] str) throws InsufficientDataException{
		if(str.length!=9){
			throw new InsufficientDataException("InsufficientDataException");
		}
	}
}


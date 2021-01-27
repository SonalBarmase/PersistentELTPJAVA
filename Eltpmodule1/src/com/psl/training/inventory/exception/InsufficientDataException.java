package com.psl.training.inventory.exception;

public class InsufficientDataException extends Exception
{
    public InsufficientDataException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
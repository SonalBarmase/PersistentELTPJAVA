package com.psl.training.collection.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class TestCityState {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String,String> cityState = new HashMap<>();
		try {
			FileInputStream fis=new FileInputStream("city.txt");
			Scanner sc=new Scanner(fis);
			while(sc.hasNextLine())  
			{  
			String[] val = sc.nextLine().split("-");
			cityState.put(val[0], val[1]);
			
			}  
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	/*	System.out.println("Getting all cities");
		for(Map.Entry<String, String> cs:cityState.entrySet()) 
		{
			System.out.println(cs.getKey());			
		}
		
		System.out.println("Getting all cities");
		for(Map.Entry<String, String> cs:cityState.entrySet()) 
		{
			System.out.println(cs.getKey());			
		}
		
		System.out.println("Enter the state");
		String state = scan.nextLine();
		for(Map.Entry<String, String> cs:cityState.entrySet()) 
		{
			if(cs.getValue().equals(state)) {
				System.out.println("The city of "+state+" is "+cs.getKey());
			}
						
		}
		System.out.println("Enter a new city and state");
		String c1=scan.nextLine();
		String s1=scan.nextLine();
		cityState.put(c1, s1);
		System.out.println("New pair added");*/
		
		System.out.println("Enter the state you want to delete");
		String s2 = scan.nextLine();
		cityState.values().remove(s2);
		System.out.println(cityState);

	}

}

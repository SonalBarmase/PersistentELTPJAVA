package com.psl.training.basics;

import java.util.Scanner;

public class LanguageFundamental {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//1.	Find the maximum of three numbers 
		int num1=0,num2=0,num3=0;
		int res=0;
		System.out.println("Enter the 3 numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		res=calMax(num1,num2,num3);
		System.out.println("The largest number is:"+res);
		
//2.Write a program to check whether the input alphabet is a vowel or not.
		System.out.println("Enter the alphabet");
		char ch = sc.nextLine().charAt(0);
		boolean bool=false;
		bool = checkAlpha(ch);
		if(bool==true) {
			System.out.println("The alphabet is vowel");
		}
		else
		System.out.println("The alphabet is not a vowel");
		
//3.Develop a program, that accepts a deposit amount and calculates amount of interest the deposit amount earns in a year. The bank pays a flat 4% interest for deposits of up to Rs.1000, a flat 4.5% per year for deposits of up to Rs.5000, and a flat 5% for deposits of more than Rs.5000.
        System.out.println("Enter the deposit amount");
        int amount=sc.nextInt();
        double interest = calInterest(amount);
        System.out.println("The amount of interest is "+interest);
     
//4.Develop the program, which accepts the gross pay and produces the amount of tax owed. For a gross pay of $240 or less, the tax is 0%; for over $240 and less than 
//$480, the tax rate is 15%; and for any pay over $480, the tax rate is 28%.
		System.out.println("Enter the gross pay");
		int gross=sc.nextInt();
		double tax = calTax(gross);
		System.out.println("The tax owed is "+tax);
		
//5.Find the number is prime or not.
		System.out.println("Enter the number to check");
		int num = sc.nextInt();
		boolean check = isPrimeNumber(num);
		if(check==true) {
			System.out.println("Number is prime");
		}else
			System.out.println("Number is not prime");
		
//6.Method will accept range value and print all prime numbers from 2 to range on console. 
		System.out.println("Enter the range value");
		int range = sc.nextInt();
		printPrime(range);
		
//7.An old-style movie theater has a simple profit program. Each customer pays $5 per ticket. Every performance costs the theater $20, plus $.50 per attendee. Develop the program that accepts the number of attendees (of a show) and calculates how much income the show earns.
        System.out.println("Enter the number of customers");
        int cus = sc.nextInt();
        float profit = calculateProfit(cus);
        System.out.println("The total amount that the theater earns is "+profit);
		
//8.Electricity board
		System.out.println("Enter the connection type and units");
		String type =sc.nextLine();
		int unit = sc.nextInt();
		float bill = calculateBill(type,unit);
		System.out.println("Electricity Bill amount:"+bill);

//9.Credit Card
		System.out.println("Enter the total charges");
		double charges=sc.nextDouble();
		double payBack = calPayBackAmount(charges);
		System.out.println("Pay Back amount:"+payBack);

//10.Matrix Multiplication
		displayMultiplicationMatrix();
		sc.close();
}//main close
	

/*------------------1--------------------*/
	static int calMax(int x,int y,int z) {
		int res = (x>y?x:(y>z?y:z));
		return res;
	}
	
/*------------------2--------------------*/
	static boolean checkAlpha(char alph) {
		boolean b=false;
		if(alph=='A'||alph=='E'||alph=='I'||alph=='O'||alph=='U'||alph=='a'||alph=='e'||alph=='i'||alph=='o'||alph=='u')
		{
			b=true;
		}
		return b;		
	}

/*------------------3--------------------*/
	static double calInterest(int amt){
		double interestAmt;
		if(amt<=1000) 
		{
			interestAmt = (amt*4)/100;
		}
		else if(amt>1000 && amt<=5000)
		{
			interestAmt = (amt*4.5)/100;
		}
		else
		{
			interestAmt = (amt*5)/100;
		}
		return interestAmt;
	}
	
/*------------------4---------------------------*/
	static double calTax(int gp)
	{
		if (gp<240)
		     return(0*gp);
		   else if((gp>240)&&(gp<480))
		     return(0.15*gp);
		   else
		     return(0.28*gp);
		}

/*------------------------5-----------------------*/
	static boolean isPrimeNumber( int num)
	{
		boolean bool = true;
		if(num<=1) {
			return false;
		}
		else {
			for(int i=2;i<=num/2;i++) {
				if(num%2==0) {
					bool=false;
					break;
				}
			}
		}
		return bool;
	}

/*----------------------6-----------------------*/
	static void printPrime(int maxVal)
	{
		int count;
		for(int i = 0 ; i <= maxVal ; i++)
		{
			count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
				System.out.print(i+" ");
		}		
	}
	
/*--------------------7------------------------*/
	static float calculateProfit( int numAttendees) {
		float profit;
		profit = (float) ((5*numAttendees)-(numAttendees*0.5 +20));
		return profit;
	}
	
/*-----------------------8---------------------*/
	static float calculateBill(String type, int unit) {
		float billAmount=0;
		if(type.equalsIgnoreCase("Domestic"))
		{
			if(unit<=100)
				billAmount = (float) (unit*4.0>250?unit*4.0:250);
			else if(unit>100 && unit<=300)
				billAmount = (float) (unit*4.5);
			else if(unit>300 && unit<=500)
				billAmount = (float) (unit*4.75);
			else
				billAmount = (float) (unit*5.0);
		}
		else {
			if(unit<=100)
				billAmount = (float) (unit*4.25>350?unit*4.25:350);
			else if(unit>100 && unit<=300)
				billAmount = (float) (unit*4.75);
			else if(unit>300 && unit<=500)
				billAmount = (float) (unit*5.0);
			else
				billAmount = (float) (unit*5.25);
		}
		return billAmount;
	}
	
/*-----------------------------9------------------------*/
	static double calPayBackAmount(double charge) {
		double pb;
		if(charge<=500)
		{
			pb=(charge/100)*0.25;
		}
		else
		{
			pb=(500/100)*0.25;
			charge=charge-500;
			if(charge<=1000)
			{
				pb=pb+(charge/100)*0.50;
			}
			else
			{
				pb=pb+(1000/100)*0.50;
				charge=charge-1000;
				
				if(charge<=1000)
				{
					pb=pb+(charge/100)*0.75;
				}
				else
				{
					pb=pb+(1000/100)*0.75;
					charge=charge-1000;
				
					if(charge>=1)
					{
						pb=pb+(charge/100)*1.0;
					}
				}
			}
		}
		return pb;
	}
	
/*------------------------10------------------------*/

	 static void displayMultiplicationMatrix() {
		 
		 int[][] multiply = new int[12][12];
		 int i,j;
		for(i=0;i<12;i++) {
			for(j=0;j<12;j++) {
				multiply[i][j] = (i+1)*(j+1);
			}
		}
		 System.out.print("      :");             // Row name column heading
		    for(j = 1 ; j <= 12 ; ++j) 
		         System.out.print((j<10 ? "   ": "  ") + j);
		    System.out.println("\n----------------------------------------------------------");
		      
		for(i=0;i<12;i++) {
			System.out.print("Row" + (i<9 ? "  ":" ") + (i+1) + ":");
			for(j=0;j<12;j++) {
				System.out.print((multiply[i][j] < 10 ? "   " : multiply[i][j] < 100 ? "  " : " ") + multiply[i][j]);
			    }
			  System.out.println("");
			}
		}		
}

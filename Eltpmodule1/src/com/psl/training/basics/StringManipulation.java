package com.psl.training.basics;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
/*1.	Find the number of occurrences of given word in a sentence.*/			
		String sentence = "This is my cat . The color of cat is white";
		System.out.println("cat is repeated "+check(sentence,"cat")+" times");

/*2.Ezee Shop has an online portal where customers can check about different products. Customers can search for products by giving a key word. Write a program that accepts a product name and a key word, and checks if the key word is present in the given product name.*/
		System.out.println("Enter the keyword to check");
		String key = sc.nextLine();
		System.out.println("Is the Product present: "+isPresent(initProductNames(),key));

/*3.Write a program to find the availability of given number in the list.*/
		int[] nos = {12,2,3,34,5,6,72,89,23};
		int pos=findPosition(2,nos);
		if(pos==-1) {
			System.out.println("The number is not present in the list");
		}else
		System.out.println("The position of the number in the list is "+pos);

/*4.Write a program that will reverse the sequence of letters in each word of a chosen paragraph .*/
		System.out.println("Enter the String to reverse");
		String str2= sc.nextLine();
		System.out.println("The reverse string is "+makeReverse(str2));
		
/*5.Write a function find and replace which will replace the given string from the source string.*/
		String str = "To be or to not be";
		System.out.println("Enter the string to replace");
		String original= sc.nextLine();
		System.out.println("Enter the string to replace with");
		String replace= sc.nextLine();
		System.out.println(findAndReplace(str,original,replace));
		
/*6. Write a function findPrime which will accept range of values from user and return int array from
function and print all numbers from it*/ 

		System.out.println("Enter the starting number");
		int start = sc.nextInt();
		System.out.println("Enter the ending number");
		int end = sc.nextInt();
		int [] prime = new int[end-start];
		prime = findPrime(start,end);
		System.out.println("The prime numbers in the range:");
		for(int i=0;i<prime.length;i++) 
		{
			if(prime[i]==0) {
				break;
			}
			System.out.print(prime[i]+" ");
		}
		
/*7.Write a function to find various combinations of entered string*/
		
		System.out.println("Enter the string to find the combination");
		String str1 = sc.nextLine();  
        int len = str1.length();
        System.out.println("All the combinations of the string are: ");  
        getCombinations(str1, 0, len);
        
/*8.Create a two dimensional character array which will accept only two characters X or O. 
 * populate array with different combinations of X and O characters. 
 * If Same character appears at either diagonal position or in the same line,  
 * return that  character.
 */
        char [][] tictac = new char[3][3];
        char ch;
        System.out.println("Enter the value in matrix (Only X and O)");
        for(int i=0;i<3;i++) {
        	for(int j=0;j<3;j++) {
        		tictac[i][j]=sc.next().charAt(0);
        	}
        }
        ch = charCheck(tictac);
        if(ch=='X'||ch=='O') {
        	System.out.println("The repeated character :"+ch);
        }
        else {
        	System.out.println("No common character at line and diagonal");
        }
  sc.close();
  
	
}//main end

	/*--------------------1-----------------------*/
	static int check(String sentence,String word)
	{
		int count=0;
		String [] words = sentence.split(" ");
		for(int i=0;i<words.length;i++) {
			if(words[i].equals(word)) {
			   count++;
			}			
		}
		return count;
	}
	/*--------------------2-----------------------*/
	static String[] initProductNames()
	{
	
		String []productNames = {"Chocolates","Accessories","Stationary","Soaps","Detergents","bakeryitems","dairyproducts","oil","clothes"};
		return productNames;
	}
	
	static boolean isPresent(String[] productNames, String keyword) {
		boolean bool=false;
		for(int i=0;i<productNames.length;i++)
		{
			if(productNames[i].equals(keyword))
			{
				bool=true;
			}
		}
		return bool;
	}
	/*--------------------3-----------------------*/
	static int findPosition(int num,int[] nos) {
		int pos=-1;
		for(int i=0;i<nos.length;i++)
		{
			if(nos[i]==num)
			{
				pos=i;
			}
		}
		return pos;
	}
	
	/*--------------------4-----------------------*/
	static String  makeReverse(String str)
	{
		String [] str1 =str.split(" ");
		String strrev="";
		for(int i=0;i<str1.length;i++)
		{
			String s1 = new StringBuffer(str1[i]).reverse().toString();
			strrev+=s1;
			if(i!=str1.length-1) {
				strrev+=" ";
			}
		}
		return strrev;
	}
	
	/*--------------------5-----------------------*/
	static String findAndReplace(String str,String old,String replace)
	{
		String seq[] = str.split(" ");
		String out = "";
		for(int i=0;i<seq.length;i++) {
			if(seq[i].equals(old))
			{
				seq[i]=replace;
				
			}
			out+=seq[i];
			if(i!=seq.length-1) {
				out+=" ";
			}			
		}		
		return out;
	}
	/*--------------------6-----------------------*/
	static int[] findPrime(int start, int end) 
	{
		int count;
		int [] prime = new int[end-start];
		int k=0;
		for(int i = start ; i <= end ; i++)
		{
			count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
			{
				prime[k]=i;
				System.out.println(prime[k]);
				k++;
				
			}
		}
		return prime;
	}
	/*--------------------7-----------------------*/  
	    public static String swapString(String a, int i, int j) {  
	        char[] b =a.toCharArray();  
	        char ch;  
	        ch = b[i];  
	        b[i] = b[j];  
	        b[j] = ch;  
	        return String.valueOf(b);  
	    }  
    
	    public static void getCombinations(String str, int start, int end)  
	    {  
	        String [] combination = new String [20];
	    	int k=0;
	        if (start == end-1) {
	            combination[k]=str;
	            System.out.println(combination[k]);
	            k++;
	        }
	        else  
	        {  
	            for (int i = start; i < end; i++)  
	            {  
	                
	                str = swapString(str,start,i);  
	                getCombinations(str,start+1,end);
	                str = swapString(str,start,i);  
	            }  
	        }
	     } 

	/*--------------------8-----------------------*/
	static char charCheck(char[][] a) {
	    	char ch='z';
	    	if(a[0][0]==a[0][1]&&a[0][1]==a[0][2])
	    	{
	    		ch=a[0][0];
	    	}
	    	else if(a[1][0]==a[1][1]&&a[1][1]==a[1][2])
	    	{
	    		ch=a[1][0];
	    	}
	    	else if(a[2][0]==a[2][1]&&a[2][1]==a[2][2])
	    	{
	    		ch=a[2][0];
	    	}
	    	else if(a[0][0]==a[1][1]&&a[0][0]==a[2][2])
	    	{
	    		ch=a[0][0];
	    	}
	    	else {
	    		
	    	}
	    	return ch;
		}
    
}// class end

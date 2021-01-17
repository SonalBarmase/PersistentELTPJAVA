package com.psl.training.basics;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	//1.Find the total of even numbers present in an array	
		int evencount =0;	
		evencount = chkEvenCount(arr);
		System.out.println("The total even numbers present in array : "+evencount);
	
	//2.Print all even and multiple of 5 numbers from an array
		int evenMultiple = 0;
		evenMultiple = chkMultiple(arr);
		System.out.println("The total even multiples of 5 present in array : "+evenMultiple);
		
	//3.Find the total characters present in a String
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		int charCnt = chkCharCount(str);
		System.out.println("Total characters present in string:"+charCnt);

	//4.Find the total vowels present in a String
		int vowelCnt = chkVowelCount(str);
		System.out.println("Vowel count:"+vowelCnt);
		
		
	//5.Find the total spaces present in a String
		int space = chkSpaceCount(str);
		System.out.println("Space count:"+space);
		
	//6. Print the following patterns
	//6a.
		printTrianglePattern();
		
	//6b.
		System.out.println("Enter string");
		String s = sc.nextLine();
		printStringPattern(s);
		
	//6c.
		System.out.println("Enter string");
		String s1 = sc.nextLine();
		stringSplit(s1);
		
		sc.close();
}

/*------------------------1----------------------*/
	  static int chkEvenCount(int[] arr) {
		int count=0;
		for(int i:arr) {
			if(i%2==0) {
				count++;
			}
		}
		return count;
	}

/*---------------------2---------------------*/
	  static int chkMultiple(int[] arr) {
			int count = 0;
			for(int i:arr) {
				if(i%2==0 && i%5==0) {
					count++;
				}
			}
			return count;
		}
	  
/*--------------------3------------------------*/
	  static int chkCharCount(String str) {
			int charCnt = 0;
			for(int i=0;i<str.length();i++) {
				if(Character.isAlphabetic(str.charAt(i)))
					charCnt++;
			}
			return charCnt;
		}

/*--------------------4------------------------*/
	  static int chkVowelCount(String str) {
		  int cnt =0;
		  for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
					cnt++;
			}
			return cnt;
		}
	  
/*----------------------5--------------------*/
	  static int chkSpaceCount(String str) {
			int spaceCnt =0;
			for(int i=0;i<str.length();i++) {
				if(Character.isSpaceChar(str.charAt(i))) {
					spaceCnt++;
				}
			}
			return spaceCnt;
		}
	  
/*--------------------6a---------------------*/
	  static void printTrianglePattern() {
		  for (int i= 1; i<= 4 ; i++)
	        {
	            for (int j=1; j<=i; j++) 
	            { 
	            	System.out.print(j+ " ");
	            }
	            System.out.println("");
	        }
		  for (int i=4; i>=0; i--)
	        {
	            for(int j=1; j <= i-1;j++)
	            {
	                System.out.print(j+ " ");
	            }
	            System.out.println("");
	        }			
		}
	  
/*--------------------6b-------------------------*/
	  static void printStringPattern(String s) 
	    {
		  for (int i= 0; i< s.length() ; i++)
	        {
	            for (int j=0; j<=i; j++) 
	            { 
	            	System.out.print(s.charAt(j)+ " ");
	            }
	            System.out.println("");
	        }			
		}
	  
/*--------------------6c-------------------------*/
	  static void stringSplit(String str) {
			String [] seq = str.split(" ");
			for(String s:seq) {
				System.out.println(s);
			}
			
		}

	  

}

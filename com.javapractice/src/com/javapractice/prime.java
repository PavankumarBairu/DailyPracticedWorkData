package com.javapractice;

import java.util.Scanner;

public class prime {

	
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Please enter your First Number");
//		Integer n1 = s.nextInt();
//		System.out.println("Please enter your Second Number");
//		Integer n2= s.nextInt();
//		s.close();
		
		int n=11;
		boolean isPrime = true;
		if(n!=1 && n!=2) 
		{
			int i=2;
			while(i<n)
			{
				if(n%i==0) 
				{
					isPrime = false;
					break;
				}
				i++;
			}
			
		}
		if(isPrime) {
			System.out.println("Its a Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}
}
		

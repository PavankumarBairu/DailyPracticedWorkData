/*
 * Print 1 to 100 values
 * Print even numbers between 200 to 500
 * numbers which are divisible by 7 from the range 150 to 200
 * print prime numbers between 50 150
 * sum of even numbers bw 40 to 80
 * odd numbers between 200  t0 25
 * public static void
 */

package assignments;

import java.util.Scanner;

public class UsingForLoop {
	public static void main(String[] args) {
//		OnetoHundred();
//		EvenNumbers();
//		DivisibleBySeven();
//		SumOfEvenNumbers();
//		OddNumbersinReverseOrder();
		PrimeNUmbers();
	}
	public static void OnetoHundred() {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter your starting  and ending numbernumber");
		int n1=s.nextInt();
		int n2=s.nextInt();
		
		for(int i=n1;i<=n2;i++) {
			System.out.println(i);
		}
	}
	public static void EvenNumbers() {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter your starting  and ending numbernumber");
		int n1=s.nextInt(); // 200 to 500
		int n2=s.nextInt();
		
		for(int i=n1;i<=n2;i++) 
		{
			if(i%2==0) 
			{
				System.out.println(i);
			}
			
		}
	}
	public static void DivisibleBySeven() {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter your starting  and ending numbernumber");
		int n1=s.nextInt(); // 200 to 500
		int n2=s.nextInt();
		
		for(int i=n1;i<=n2;i++) 
		{
			if(i%7==0) 
			{
				System.out.println(i);
			}
			
		}
	}
	public static void SumOfEvenNumbers() {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter your starting  and ending numbernumber");
		int n1=s.nextInt(); // 200 to 500
		int n2=s.nextInt();
		int sum=0;
		for(int i=n1;i<=n2;i++) 
		{
			if(i%2==0) 
			{
				 sum+=i;
			}
			
		}
		System.out.println(sum);
	}
	public static void OddNumbersinReverseOrder() {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter your starting  and ending numbernumber");
		int n1=s.nextInt(); // 200 to 25
		int n2=s.nextInt();
		
		for(int i=n1;i>=n2;i--) 
		{
				System.out.println(i);
		}
	}
	public static void PrimeNUmbers() {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter your starting  and ending numbernumber");
		int n1=s.nextInt(); // 200 to 25
		int n2=s.nextInt();
		
		
		boolean flag = false;
		
		for (int i = n1; i <= n2; i++) {
			boolean isPrime=true;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					isPrime = false;
				}

			}
			if (isPrime)
				System.out.println(i);
		}
		
//		for(int i = n1; i <= n2; i++)
//	    {
//			
//	        flag = false;
//	        for(int j = 2; j < i; j++)
//	        { 
//	            if(i % j == 0)
//	            {
//	                flag = true;
//	            }
//	        }
//	        if(!flag)
//	            System.out.println(i);
//	    }
	}


}

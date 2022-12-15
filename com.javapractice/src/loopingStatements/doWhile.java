package loopingStatements;

import java.util.Scanner;

/*
 * Print 1 to 100 values
 * Print even numbers between 200 to 500
 * numbers which are divisible by 7 from the range 150 to 200
 * print prime numbers between 50 150
 * sum of even numbers bw 40 to 80
 * odd numbers between 200  t0 25
 */

public class doWhile {
	public static int i=0;
	public static void main(String[] args) {
//		vhile();
//		dovhile();
//		DivBy7 ();
		prime_numbers();
//		sum_even();
//		 Odd_numbers();
		
	}
	
	public static void vhile () {
		
		while (i<=10) {
			System.out.println(i);
			i++;
		}		
	}
	
	public static void dovhile() {
				
		do {
			System.out.println(i);
			i++;
		} while (i<5);
	}
	
	public static void DivBy7() {
		int j=150;
		while (j<200) {
			if(j%7==0 || j%5==0) {
				System.out.println(j);
			}
			j++;
		}
	}
	
	public static void prime_numbers() {
		System.out.println("Enter numbers to check prime numbers");
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		boolean flag = false;
		int i, j;
		if (n1 != 1 || n1 != 2) {
			for (i = n1; i < n2; i++) { // 3 < 99 4
				for (j = 1; j < i; j++) { // 0<3 1,

					if (i % j == 1) {
						flag = true;
						System.out.println(i);
						n1++;
					}
					if(flag==true) {
						System.out.println(i);
					}
				}
			}
		}

	}
	public static void sum_even() {
		
		System.out.println("Enter numbers to check sum");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		int c=0;
		s.close();
		while (a<10) {
			if(a%2==0) {
				
				System.out.println(a);
				c = c+a;
				
			}
			a++;
			}
		
		System.out.println(c);
		}
	
	
	public static void Odd_numbers() {
		System.out.println("Enter numbers to check prime numbers");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b= s.nextInt();
		
		System.out.println("Odd numbers are:");
		while (a>=b) {
			if(a%2==1) {
				System.out.println(a);
				
			}			
			a--;
		}
		
	}
			
	
	
	
	
	

}

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
public class forLoop {
	
	public static void main(String[] args) {
		
//		basic_numbers();
//		even_numbers();
//		odd_numbers();
		Prime_numbers();
	}
	
	public static void basic_numbers() {
		System.out.println("enter your starting number:");
//		Scanner s = new Scanner(System.in);
//		int a = s.nextInt();
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
	
	public static void even_numbers() {
		int sum=0;
		for (int i=200;i<=500;i++) {
			if(i%2==0) {
				System.out.println(i);
				sum= sum+i;
			}
		}
		System.out.println("Sum of even numbers:"+sum);
	}
	public static void odd_numbers() {
		
		for(int i =200;i>=25;i--) {
			if(i%2==1) {
				System.out.println(i);
			}
			
		}
	}
	
	public static void Prime_numbers() {
		int count=0;
		for(int i=0;i<100;i++) {
			 {
				if(100%i==0) {
					
			count++;
					
				}
				
			if(count==2) {
			System.out.println(i+"Prime nuber");
		}
	
		}
	
	
		}
}
}

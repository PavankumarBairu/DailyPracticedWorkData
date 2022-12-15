package patterns;

import java.util.Scanner;

public class Patterns3 {
	
	public static void main(String[] args) {
		
//		Rightangle();
//		InvertedRightangle();
//		Leftangle();
		InvertedLeftangle(); 
	}
	
	public static void Rightangle() {
		int my_input,i,j;
		Scanner my_scanner=new Scanner(System.in);
		System.out.println("Defined scanner input");
		System.out.println("Enter of no of rows in your pattern: -");
		my_input=my_scanner.nextInt();
		System.out.println("Thank you for the input,Your pattern is getting ready");
		
		for(i=0;i<my_input;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("* ");	
			}
			System.out.println();
		}
		
	}
	public static void InvertedRightangle() {
		int my_input,i,j;
		Scanner my_scanner=new Scanner(System.in);
		System.out.println("Defined scanner input");
		System.out.println("Enter of no of rows in your pattern: -");
		my_input=my_scanner.nextInt();
		System.out.println("Thank you for the input,Your pattern is getting ready");
		
		for(i=0;i<my_input;i++) {  // no of rows is fine
			for(j=my_input;j>i;j--) {    // 0,5  1,4 2,3 3,2 4,1 
				System.out.print("* ");	
			}
			System.out.println();
		}
		
		for(i=0;i<my_input;i++) {  // no of rows is fine
			for(j=my_input;j>i;j--) {    // 0,5  1,4 2,3 3,2 4,1 
				System.out.print(i);	
			}
			System.out.println();
		}
		for(i=0;i<my_input;i++) {  // no of rows is fine
			for(j=my_input;j>i;j--) {    // 0,5  1,4 2,3 3,2 4,1 
				System.out.print(j);	
			}
			System.out.println();
		}
		
	}
	
	public static void Leftangle() {
		int my_input,i,j,s;
		Scanner my_scanner=new Scanner(System.in);
		System.out.println("Defined scanner input");
		System.out.println("Enter of no of rows in your pattern: -");
		my_input=my_scanner.nextInt();
		System.out.println("Thank you for the input,Your pattern is getting ready");
		
		for(i=0;i<my_input;i++) { // for No of Rows
			for(s=(my_input-1);s>i;s--) {   //0,4 1,3 2,2 3,1 4,0
				System.out.print("-");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void InvertedLeftangle() {
		int my_input,i,j,s;
		Scanner my_scanner=new Scanner(System.in);
		System.out.println("Defined scanner input");
		System.out.println("Enter of no of rows in your pattern: -");
		my_input=my_scanner.nextInt();
		System.out.println("Thank you for the input,Your pattern is getting ready");
		
		for(i=0;i<my_input;i++) { // for No of Rows
			for(s=0;s<i;s++) {  // 0,0 1,1 2,2
				System.out.print(" ");
			}
			for(j=my_input;j>i;j--) { // 0,5 1,4, 2,3
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}

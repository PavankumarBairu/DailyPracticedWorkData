/**
 * 1.given number is even or odd
 * 2.performing arithmetic operation two numbers
 * 3.identifying weekday or weekend
 *  */

package assignments;

import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {
//		EvenOrOdd();
//		ArithmaticOperation();
		weekOrWeekend();
	}
	
	public static void EvenOrOdd() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your number : - /t");
		int n= s.nextInt();
		int remainder = n%2;
		
		switch (remainder) {
		case 0:
			System.out.println("Its an Even Number");
			break;
		case 1:
			System.out.println("Its an Odd Number");
			break;

		default:
			System.err.println("Invalid number");
			break;
		}
		
	}
	public static void ArithmaticOperation() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your number 1 : - ");
		int n1=s.nextInt();
		System.out.println("Please enter your number 2 : - ");
		int n2=s.nextInt();
		System.out.println("Please enter your Operation : - ");
		String s1=s.next();
		Object result=null;
		switch (s1) {
		case "+":
			result=n1+n2;
			break;
		case "-":
			 result=n1-n2;
			break;
		case "/":
			 result=n1/n2;
			break;
		case "*":
			 result=n1*n2;
			break;
		case "%":
			 result=n1%n2;
			break;
		default:
			System.out.println("Invalid operation");
			break;
			
		}
		System.out.println(result);
	}
	public static void weekOrWeekend() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your dayName : - ");
		String dayName= s.next();
		switch (dayName.toLowerCase()) {
		case "monday":
		case "tueday":
		case "wedday":
		case "thuday":
		case "friday":
			System.out.println("Aww, Its a weekday");
			break;
		case "satday":
		case "sunday":
			System.out.println("Yay, Its a weekend.....!");

		default:
			break;
		}
	}

}

package calculator;

import java.util.Scanner;

public class CalculatorClass {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please eneter your first number : -");
		int n1=s.nextInt();
		System.out.println("Please eneter your first number : -");
		int n2=s.nextInt();
		System.out.println("Please eneter your mode of Operator : \t");
		String o1=s.next();
		s.close();
		int res=0;
		if(n1>n2) {
			
			switch(o1)
			{
			case "+": res=n1+n2;System.out.println(res); break;
			case "-": res=n1-n2;System.out.println(res); break;
			case "*": res=n1*n2;System.out.println(res); break;
			case "/": res=n1/n2;System.out.println(res); break;
			case "%": res=n1%n2;System.out.println(res); break;
			default : System.out.println("Invalid operator");
			}
		}
		
	}
}

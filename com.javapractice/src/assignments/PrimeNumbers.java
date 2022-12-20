package assignments;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your starting and ending numbers");
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println("Prime numbers between:"+n1+" to "+n2+" are:-\r");
		s.close();
		while(n1<=n2) {
			int i,n;
			n=n1;
			i=2;
			boolean IsPrime=true;
			if(n!=1 && n!=2) {
				while(i<n) {
					if(n%i==0) {
						IsPrime=false;
						break;
					}
					i++;
				}
			}
			if(IsPrime)
				System.out.println("Prime Number : "+n);
			else
			System.out.println("Not a Prime Number :"+n);
			n1++;
		}
	}

}

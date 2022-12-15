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

public class Whilecase {
	public static void main(String[] args) {
//		OnetoHundred();
//		EvenNumbers();
//		DivisibleBySeven();
//		SumOfEvenNumbers();
//		oddNumbers();
		Primenumbers();
//		CheckPrimeWhileLoop();
	}
	
	public static void OnetoHundred() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your starting number : -");
		int n1=s.nextInt();
		System.out.println("Please enter your ending number : -");
		int n2=s.nextInt();
		int number =n1;
		
		while(number<n2) 
		{
			System.out.println(number);
			number++;
		}
	}
	public static void EvenNumbers()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your starting number : -");	//200
		int n1=s.nextInt();
		System.out.println("Please enter your ending number : -");		//500
		int n2=s.nextInt();
		int number =n1;
		while(number<n2) 
		{	if(number%2==0) 
			{
			System.out.println(number);
			
			}
		number++;
		}
	}
	public static void DivisibleBySeven()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your starting number : -");	//150
		int n1=s.nextInt();
		System.out.println("Please enter your ending number : -");		//200
		int n2=s.nextInt();
		int number =n1;
		while(number<n2) 
		{	if(number%7==0) 
			{
			System.out.println(number);
			
			}
		number++;
		}
	}
	public static void SumOfEvenNumbers()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your starting number : -");	//40
		int n1=s.nextInt();
		System.out.println("Please enter your ending number : -");		//80
		int n2=s.nextInt();
		int number =n1;
		int sum=0;
		while(number<=n2) 
		{	if(number%2==0) 
			{
				sum+=number;
			}
		number++;
		}
		System.out.println("Sum of even numbers is :-"+sum);
	}
	public static void oddNumbers()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your starting number : -");	//200
		int n1=s.nextInt();
		System.out.println("Please enter your ending number : -");		//25
		int n2=s.nextInt();
		int number =n1;
		while(number>=n2)
		{
			if(number%2==1)
			{
				System.out.println(number);
			}
			number--;
		}
		
	}

	public static void Primenumbers() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your starting number : -"); // 5
		int n1 = s.nextInt();
		System.out.println("Please enter your ending number : -"); // 50
		int n2 = s.nextInt();
	
		
		while (n1 <= n2) {
			boolean isPrime = true;
			int i = 2;
			if (n1 != 1 && n1 != 2) {
				while (n1 > i) {
					if (n1 % i == 0) {
						isPrime = false;
						break;
					}
					i++;
				}
				
				}
			if (isPrime)
				System.out.println("Its a prime number:- " + n1);
		
			n1++;
		}
		s.close();
	}

		 public static void CheckPrimeWhileLoop() {

				System.out.println("Enter a number range to generate prime numbers in between");
				Scanner scanner = new Scanner(System.in);
				int number1 = scanner.nextInt();
				int number2 = scanner.nextInt();

				if (number1 >= number2) 
				{
					System.out.println("Number2 must be greater then number1");
					System.exit(0);
				}
				while (number1 <= number2) {
					int i = 2, count = 0;
					while (i <= number1 / 2) {
						if (number1 % i == 0) {
							count++;
							break;
						}
						i++;

					}
					if (count == 0) {
						System.out.println(number1 + " is prime number");
					}
					number1++;
				}
			}

}

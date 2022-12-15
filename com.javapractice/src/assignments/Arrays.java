/**
 * 1.sum of the integers of in array {2.5.1.9.6}
 * 2.averageOfIntegers
 * 3.Merge two string arrays { chay,milk,water} & {coke,coffee}etc.
 * 4.highest number from an array *its index
 * 5. printing even numbers and odd numbers from an array
 */

package assignments;

import java.util.Scanner;

public class Arrays {
	
	public static void main(String[] args) {
		int[] arr = {2,1,3,4,5,6,8,7,11,13,16,20,};
//		SumOfIntegers();
//		averageOfIntegers();
//		MergeTwoStringArrays();
		HighesttNumber(arr);
	}

	public static void SumOfIntegers() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your array size");
		int arrSize= s.nextInt();
		
		int[] arr1 = new int[arrSize];
		
		System.out.println("Please enter your array values:- ");
		
		for(int i=0;i<arrSize;i++) 
			{
			arr1[i]=s.nextInt();
			}
		System.out.println(java.util.Arrays.toString(arr1));
		int sum =0;
		for(int i=0;i<arr1.length;i++) 
			{
				sum+=arr1[i];
			}
		System.out.println("sum ofintegers are:- "+sum);
		s.close();
	}
	
	public static void averageOfIntegers() 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your array size :-");
		int arrSize=s.nextInt();
		int[] arr = new int[arrSize];
		System.out.println("Enter your array Values :-");
		for(int i=0;i<arrSize;i++) 
			{
			arr[i]=s.nextInt();
			}
		System.out.println(java.util.Arrays.toString(arr));
		int sum=0;
		for(int i=0;i<arr.length;i++)
			{
				sum+=arr[i];
			}
		int Average= sum/arr.length;
		System.out.println(Average);
		s.close();
	}
	public static void MergeTwoStringArrays()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter yor Array1 size : -");
		int arr1Size =s.nextInt();
		
		String[] arr1= new String[arr1Size];
		System.out.println("Enter your Array1 values : -");
		for( int i=0;i<arr1Size;i++)
		{
			arr1[i]=s.next();
		}
		System.out.println(java.util.Arrays.toString(arr1));
		
		System.out.println("Enter yor Array2 size : -");
		int arr2Size =s.nextInt();
		
		String[] arr2= new String[arr2Size];
		System.out.println("Enter your Array2 values : -");
		for( int i=0;i<arr2Size;i++)
		{
			arr2[i]=s.next();
		}
		System.out.println(java.util.Arrays.toString(arr2));
		
		String[] arr3 = new String[arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i] = arr1[i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr3[i+arr1.length] = arr2[i];
		}
		
		System.out.println(java.util.Arrays.toString(arr3));
	}
	
	public static void HighesttNumber() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Array size: - ");
		int arraysize = s.nextInt();
		
		int[]arr = new int[arraysize];
		
		System.out.println("Enter yor Array values : -");
		for(int i=0;i<arraysize;i++) 
			{
				arr[i]=s.nextInt();
			}
		System.out.println(java.util.Arrays.toString(arr));
		System.out.println(".......Finding highest number in given arry.......");
		
		int highestNumber = arr[0];
		int highestNumberIndex =0;
		
		for(int i=1;i<arr.length;i++) //{2,5,1,9,6}
			{
			if(highestNumber<arr[i]) 
				{
				highestNumber=arr[i];
				highestNumberIndex=i;
				}
			}
		System.out.println("Highest number in given array is : - "+highestNumber);
		System.out.println("Highest numberindex in given array is : - "+highestNumberIndex);
	}
	
		public static void HighesttNumber(int[] arr) {	
		//int[] arr = {2,1,4,5,,8,7,11,,20,,18};
			
			int[] a = new int[arr.length];
			int index=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2==0)
				{
					a[index]=arr[i];
					index++;
				}
			}
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2!=0)
				{
					a[index]=arr[i];
					index++;
				}
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
	}

}

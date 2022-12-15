package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of elements in your array1:-");
		int arraysize1=s.nextInt();
		String[] arr1=new String[arraysize1];
		System.out.println("enter you elements");
		for(int i=0;i<arraysize1;i++) {
			arr1[i]=s.next();
		}
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("Enter no of elements in your array2:-");
		int arraysize2=s.nextInt();
		String[] arr2=new String[arraysize2];
		System.out.println("enter you elements");
		for(int i=0;i<arraysize2;i++) {
			arr2[i]=s.next();
		}
		System.out.println(Arrays.toString(arr2));
		String[] arr3=new String[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		System.out.println(Arrays.toString(arr3));
		for(int i=0;i<arr2.length;i++) {
			arr3[i+arr1.length]=arr2[i];
		}
		System.out.println(Arrays.toString(arr3));
		s.close();
		
	}

}

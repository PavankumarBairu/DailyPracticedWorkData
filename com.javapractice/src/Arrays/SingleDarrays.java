package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleDarrays {
	
	public static void main(String[] args) {
//		singleDarrays();
//		sdArays();
//		sumof_integers();
//		average_Integers();
//		MergedArrays() ;
//		array_list();
		Arrays_merging();
	}
	
	public static void singleDarrays() {
		int[] i= {2,6,4,3,1};
		
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
	}
	public static void sdArays() {
		int[]k= new int[3];
		k[0]=88;
		k[1]=56;
		k[2]=32;
		int l=0;
		while(l<k.length) {
		System.out.println(k[l]);
		l++;
		}
	}
	
	// print sum of integers in an array
	
	public static void sumof_integers() {
		int[] a = {2,5,1,9,6};
		int b=0;
		int sum=0;
		while(b<a.length) {
			sum = sum+a[b];
		b++;
		}
		System.out.println(sum);
	}
	// print average of integers in an array
	public static void average_Integers() {
		int[] i= new int[5];
		i[0]=2;
		i[1]=5;
		i[2]=1;
		i[3]=9;
		i[4]=6;
		int l=0;
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
			l=l+i[j];
		}
		System.out.println(l/i.length);
 	}
	// merging two arrays
	public static void MergedArrays() {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(2);
		l.add("pavan");
		System.out.println(l);
		
	}
	public static void array_list() {
		/*
		ArrayList l = new ArrayList();
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(2);
		l.add(50);
		l.add(63);
		l.add(54);
		l.add(20);
		System.out.println(l);
		
		 */
		
		ArrayList l = new ArrayList();
		l.add("ABC");
		l.add("a");
		l.add(52);
		l.add("welcome");
		l.add(15.5);
		l.add(25.006);
		System.out.println(l);
		
		ArrayList l2 = new ArrayList();
		l2.addAll(l);
		System.out.println("Array adding all from collection l :"+l2);
		l2.remove(2);
		System.out.println("Array after removing 2 element:"+l2);
		
		System.out.println(l2.get(2));
		l2.set(1, "Siri");
		System.out.println("After setting 1 elemnt:"+l2);
		
	}
	//merging two arrays
	
	public static void Arrays_merging() {
		String[] arr1 = {"Chai","Coffee"};
		String[] arr2 = {"Milk","Water","Sugar"};
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
			
		}
		for(int j=0;j<arr2.length;j++) {
			System.out.println(arr2[j]);
	}
		
	
	
	
}
}
	
	
	
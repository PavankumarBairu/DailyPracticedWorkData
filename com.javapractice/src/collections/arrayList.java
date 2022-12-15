package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class arrayList {
	
	public static void main(String[] args) {
//		arrayList_DefiningMethods();
//		arrayList_AddingELements();
//		arrayList_RemovingSpecificElements();
//		arrayList_Updating();
		arrayList_Sort();
//		array_toList();
	}
	
	public static void arrayList_DefiningMethods() {
		ArrayList al1 = new ArrayList(); //Heterogeneous type
		ArrayList<Integer> al2 = new ArrayList<Integer>(); // homogeneous
		ArrayList<String> al3 = new ArrayList<String>(); // homogeneous
		ArrayList<Object> al4 = new ArrayList<Object>(); // homogeneous
		System.out.println(al1.size());
		System.out.println(al2.size());
		System.out.println(al3.size());
		System.out.println(al4.size());
	}
	public static void arrayList_AddingELements() {
		ArrayList l = new ArrayList(); //Heterogeneous type
		l.add(1);
		l.add(2);
		l.add("Welcome");
		l.add(14.005);
		l.add("A");
		l.add("Python");
		System.out.println(l);
		ArrayList l2 = new ArrayList(); //Heterogeneous type
		l2.addAll(l);
		System.out.println(l2);
		
	}
	public static void arrayList_RemovingSpecificElements() {
		ArrayList l = new ArrayList(); //Heterogeneous type
		l.add(1);
		l.add(2);
		l.add("Welcome");
		l.add(14.005);
		l.add("A");
		l.add("Python");
		System.out.println("Before removing: "+l);
		l.remove(3);
		System.out.println("After removing: "+l);
			
	}
	public static void arrayList_Updating() {
		ArrayList l = new ArrayList(); //Heterogeneous type
		l.add(1);
		l.add(2);
		l.add("Welcome");
		l.add(14.005);
		l.add("A");
		l.add("Python");
		System.out.println("Before update: "+l);
		l.set(3, "Pavan");
		System.out.println("After :"+l);
		System.out.println(l.contains("A"));
		System.out.println(l.contains("B"));
		
	}
	public static void arrayList_Sort() {
		ArrayList<String> l = new ArrayList<String>();
		l.add("H");
		l.add("F");
		l.add("X");
		l.add("H");
		l.add("L");
		l.add("O");
		l.add("A");
		System.out.println("Before Sorting:"+l);
		Collections.sort(l);
		System.out.println("After Sorting:"+l);
		Collections.shuffle(l);
		System.out.println("After Shuffling:"+l);
//		System.out.println(l.isEmpty());
		
		
	}
	public static void array_toList() {
		
		String[] arr= {"Apple","Ball","Cat","Dog"};
		
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		
	}
	
}
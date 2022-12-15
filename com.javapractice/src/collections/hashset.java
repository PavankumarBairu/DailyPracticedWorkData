/* 
 * HashSet
 * Duplicates not allowed
 * No insertion order
 * No Sorting, Shuffling
 * Nulls allowed
 * No index
 * Homogeneous + Heterogeneous data allowed
 * 
 */



package collections;

import java.util.HashSet;

public class hashset {
	
	public static void main(String[] args) {
		
/*
	HashSet<Integer> hs = new HashSet<Integer>();
	hs.add(2);
	hs.add(22);
	hs.add(26); 
	hs.add(33);
	hs.add(20);
	System.out.println(hs);
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());
	System.out.println(hs.contains(20));
	System.out.println(hs.remove(22));
	System.out.println(hs);
	*/
	/*	
	HashSet hs = new HashSet();
	
	hs.add("ABCD");
	hs.add("null");

	hs.add(41);
	hs.add(0.005);
	hs.add("Python");
	System.out.println(hs);
	System.out.println(hs.size());
	System.out.println(hs.remove(0.005));
	
	*/
	
//	 Using for each loop
	
	/*
		 
	for (Object k : hs) {
		System.out.println(k);
		}
	
	// Using Iterator method
	
	Iterator it = hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		
	}
	
	*/
		HashSet<Integer> h1= new HashSet<Integer>();
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		h1.add(5);
//		System.out.println(h1);
		
		HashSet<Integer> h2= new HashSet<Integer>();
		
		
		h2.add(3);
		h2.add(4);
		h2.add(5);
	
		
//		System.out.println(h2);
//		
//		// Union : Only unique values from two sets
//		
		h1.addAll(h2);
		System.out.println("Union : - " +h1);
//		
//		// Intersection : common elements
		h1.retainAll(h2);
		System.out.println("Intersection : -"+h1);
//		
//		//Remove all
		h1.remove(h2);
		System.out.println("Difference:" +h1);
//		Subset
		h1.containsAll(h2);
		System.out.println("subset:" +h1);
		
	
}
}

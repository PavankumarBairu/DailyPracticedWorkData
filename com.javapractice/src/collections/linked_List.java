/*Linked list
 * Can have duplicates 
 * Maintains insertion order
 * Shifting between nodes takes place
 * whenever we have more no of insertion/deletions required prefer it
 * Homogeneous + Heterogeneous data allowed
 * Nulls not allowed
 */
package collections;

import java.util.Collections;
import java.util.LinkedList;

public class linked_List {

	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		LinkedList<Object> ls1 = new LinkedList<Object>();
		LinkedList<String> ls2 = new LinkedList<String>();
		LinkedList<Integer> ls3 = new LinkedList<Integer>();
		
//		System.out.println(ls1);
//		System.out.println(ls2);
//		System.out.println(ls3);
		
		ls.add(0,"A");
		
		ls.add(1, 25);
		ls.add(2, 0.2);
		ls.add(3,"SIRI");
		ls.remove(2);
		ls.add(99);
	
		System.out.println(ls.size());
		
		System.out.println(ls.set(2, 55));
		
		System.out.println(ls.get(1));
		System.out.println(ls);
		
		ls3.add(25);
		ls3.add(32);
		ls3.add(11);
		ls3.add(9);
		ls3.add(56);
	
//		System.out.println(ls3);
//		Collections.sort(ls3);
//		
//		System.out.println("After sorting: "+ls3);
//		Collections.shuffle(ls3);
//		System.out.println("After shuffeling: "+ls3);
//		
	}
}

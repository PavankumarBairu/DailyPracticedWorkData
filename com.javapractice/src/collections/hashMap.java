/* Key & value pairs are available
 * Key duplicates no allowed
 * No insertion order
 * Key Nulls once allowed
 * Value nulls allowed
 * 
 */
package collections;

import java.util.*;

public class hashMap {

	/*public static void main(String[] args) {
//		HashMap h= new HashMap();
		HashMap<Integer, String> h= new HashMap<Integer, String>();
		
		h.put(101,"Siri");
		h.put(102,"Pavan");
		h.put(103,"Aaradhya");
		h.put(104,"Chaitra");
		System.out.println(h);
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.containsKey(101));
		System.out.println(h.containsValue("Siri"));
		System.out.println(h.isEmpty());
		System.out.println(h.get(104));
		System.out.println(h.keySet());
		
		for (Object k : h.keySet()) {
			System.out.println(k+" "+h.get(k));
		}
		
		
	}*/
	
	  public static void main(String args[]) {
	      // Create a hash map
	      LinkedHashMap<String, Double> lhm = new LinkedHashMap<String, Double>();
	      
	      // Put elements to the map
	      lhm.put("Zara", 3434.30);
	      lhm.put("Mahnaz",123.22);
	      lhm.put("Ayan", 1378.00);
	      lhm.put("Daisy",99.22);
	      lhm.put("Qadir",-19.08);
	      
//	      // Get a set of the entries
//	      Set set = lhm.entrySet();
//	      
//	      // Get an iterator
//	      Iterator i = set.iterator();
//	      
//	      // Display elements
//	      while(i.hasNext()) {
//	         Map.Entry me = (Map.Entry)i.next();
//	         System.out.print(me.getKey() + ": ");
//	         System.out.println(me.getValue());
//	      }
	     System.out.println(lhm.get("Zara"));
	      
	      // Deposit 1000 into Zara's account
	      double balance = lhm.get("Zara").doubleValue();
	      System.out.println("Balance amount is:-"+balance);
	      lhm.put("Zara", balance + 1000);
	      System.out.println("Zara's new balance: " + lhm.get("Zara"));
	   }

}

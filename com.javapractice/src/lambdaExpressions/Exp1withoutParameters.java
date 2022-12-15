/** LambdaExpressions
 * It makes code simpler
 * No Name
 * No Access modifier
 * No Return type
 * Single Abstract method till 1.7 java
 */
package lambdaExpressions;
// interface is having single abstract method
interface cab {
	public void bookcab(); // do not have body implementation
}

class ola{
	public void bookcab() {
		System.out.println("Ola Cab is booked");
	}
}

public class Exp1withoutParameters {
	public static void main(String[] args) {
		// Regular method need implementation in another class
//		ola ola = new ola(); 
//		ola.bookcab();   
		
		 // with lambda Expressions
		cab cab = ()-> System.out.println("Ola Cab is booked");
		cab.bookcab();
	}

}

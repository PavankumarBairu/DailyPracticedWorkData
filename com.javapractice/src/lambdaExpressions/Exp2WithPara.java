/** LambdaExpressions
 * It makes code simpler
 * No Name
 * No Access modifier
 * No Return type
 * Single Abstract method till 1.7 java
 * 1.8 onwards Default,Static methods introduced
 */

package lambdaExpressions;

@FunctionalInterface
interface Fruits {
	public void Apple(String availbility, String shape);
}

public class Exp2WithPara {
	public static void main(String[] args) {
		
		Fruits Fruits =(availbility,shape)->System.out.println("Apples are"+availbility+shape+"in shape");	
		Fruits.Apple("Seasonal", "Round");
	}
}

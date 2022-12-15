package patterns;
// public static void
public class Triangles2 {
	public static void main(String[] args) {
		
		rightangle();
		leftangle();
		rightangleinverse();
		leftangleinverse();
		diamond();
	}
	
	/*	*
	 * 	**
	 * 	***
	 * 	****
	 */
	public static void rightangle() {
		int n=5;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*	1	2	3	4	*
	 * 				*	*
	 * 			*	*	*
	 * 		*	*	*	*
	 * *	*	*	*	*
	 * 
	 */
	public static void leftangle() {
		int n=5;
		
		for(int i=0;i<n;i++) {
			for(int s=n-1;s>=i;s--) {
				System.out.print("-");
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	/*	*	*	*	*
	 * 	*	*	*
	 * 	*	*	
	 * 	*
	 */
	public static void rightangleinverse() {
		int n=5;
		
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	/*	*	*	*	*	
	 * 		*	*	*
	 * 			*	*	
	 * 				*
	 */
	public static void leftangleinverse() {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int s=0;s<i; s++) {
				System.out.print("-");
			}
			for(int j=n;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*	  
	 			*
			*	*	*
		*	*	*	*	*
			*	*	*
				*                  */
	
	public static void diamond() {
		int n = 5;
			
		
		for (int i = 0; i <n; i++) {
			for (int s = n - 1; s >= i; s--) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * i) + 1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for (int i = 0; i <= n; i++) {
			for(int s=0;s<i;s++ ) {
				System.out.print(" ");
			}
			for(int j=(2*n)-i;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

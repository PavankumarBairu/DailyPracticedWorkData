package patterns;

public class Triangle {
	
	public static void main(String[] args) {
		Triangle();
		Rightangle();
		Rightangleinverse();
		leftTriangle();
		leftTriangleinverse();
	}
	
	public static void Triangle() {
		System.out.println("started triangle...");
		int n=5;
		
		for(int i=0;i<=n;i++) {
			for(int s=0;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(int j=0;j<(2*i)+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
	public static void Rightangle() {
		
		int n=5;
		for(int i=0;i<=n;i++) { // for no of rows
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void Rightangleinverse() {
		int n=5;
		
		for(int i=0;i<=n;i++) { // for no of rows
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void leftTriangle() {
		
		int n=5;
		for(int i=0;i<=n;i++) { // for no of rows
			for(int s=n-1;s>=i;s--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
	}

	public static void leftTriangleinverse() {

		int n = 5;
		for (int i = 0; i <= n; i++) { // for no of rows
			
			for (int j = 0; j <i; j++) {
				System.out.print(" ");
			}
			
			for (int s = n - 1; s >i; s--) {
				System.out.print("*");
			}
		
			
			System.out.println();

		}

	}
	
}
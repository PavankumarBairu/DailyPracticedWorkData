package assignments;

import java.util.Scanner;

public class StringPractice {
	
	public static void main(String[] args) {
//		RightangleTraingle();
		LeftangleTraingle();
		
	}

	public static void RightangleTraingle() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your word :-");
		String s1 = s.next();
		int size = s1.length();
		System.out.println("Given String is:" + s1);
		System.out.println("Given String size is:" + size);
		for (int i = 0; i <= size; i++) {
			System.out.println(s1.substring(0, i));

		}
		for (int j = size; j > 0; j--)
			System.out.println(s1.substring(0, j));

		}

	public static void LeftangleTraingle() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your word :-");
		String s2=s.next();
		int l=s2.length();
		
//		for(int i=0;i<=l;i++) { // i loop
//			
//			for(int j=l-1;j>=i;j--) {
//			System.out.print("-");
//			} // space loop
//			
//			for(int k=0;k<i;k++) {
//				System.out.print(s2.charAt(k));
//			}
//			System.out.println();
//		}

		for (int i = l; i<=0; i--) { // i loop

			for (int j = 0; j>=l; j++) {
				System.out.print("-");
			} // end space loop

			for (int k = l; k <=0; k--) {
				System.out.print(s2.substring(0,k));
			}
			System.out.println();
		}

	}
	}


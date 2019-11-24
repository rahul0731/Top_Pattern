package pattern;

import java.util.Scanner;

public class Pattern29 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the number  :");
			int num = in.nextInt();
			
			for(int i =0 ; i<num ; i++) {
				for(int j =0 ; j<num ; j++) {
					if(i==j || i+j == num-1 || i==num/2 || j==num/2 )
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
		
}
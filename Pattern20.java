package pattern;

import java.util.Scanner;

public class Pattern20 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the number  :");
			int num = in.nextInt();
			
			int k=1;
			for(int i = 1 ; i<=num ; i++) {
				for(int j = 1 ; j<=num-i; j++) {
					System.out.print( "  ");
				}
				
				for(int  j = 1 ; j<=2*i-1 ; j++) {
					System.out.print(k%2 + " ");
					k++;
				}
				
				System.out.println( );
			}
		}

	

}

package pattern;

import java.util.Scanner;

public class Pattern21 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the number  :");
			int num = in.nextInt();
			
			
			for(int i = 1 ; i<=num ; i++) {
				int k=1;
				for(int j = 1 ; j<=num-i; j++) {
					System.out.print( "  ");
				}
				
				for(int  j = 1 ; j<=2*i-1 ; j++) {
					if(j%2 ==0)
						System.out.print("*");
					else
						System.out.print(k++);
				}
				
				System.out.println( );
			}
		}

	

}

package pattern;

import java.util.Scanner;

public class Pattern16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number  :");
		int num = in.nextInt();
		
		
		for(int i = 1; i<=num ; i++) {
			for(int j = 0 ; j<=num-i ; j++) {
				System.out.print( " ");
			}
			
			for(int  j = i ; j>0 ; j--) {
				System.out.print(num-j+1);
			}
			
			System.out.println( );
		}
	}




}

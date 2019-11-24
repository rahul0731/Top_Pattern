package pattern;

import java.util.Scanner;

public class Pattern22 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the number  :");
			int num = in.nextInt();
			
			for(int i =1 ; i<=num ; i++) {
				int k = i;
				for(int j = 1 ; j<=i; j++) {
					System.out.print(k + " ");
					k = k +(num-j);
				}
				System.out.println();
			}
			
			
		}

	

}


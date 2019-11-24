package pattern;

import java.util.Scanner;

public class Pattern23 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the number  :");
			int num = in.nextInt();
			int sp = num/2 ,st=1;
			for(int i =1;i<=num; i++) {
				for(int j =1 ; j<=sp ; j++){
					System.out.print( " ");
				}
				for(int j =1; j <=st ; j++) {
					System.out.print("*");
				}
				if(i<=num/2) {
				sp--;
				st = st + 2 ;
				}
				else
				{
					sp++;
					st = st -2 ;
				}
				System.out.println();
			}
		}
		
}

package pattern;
import java.util.Scanner;
public class Pattern17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" ENter the number :");
		int num = in.nextInt();
	
		
		int k =1;
		for(int i=1 ; i<=num ; i++) {
			
			for(int j=1 ; j<=i ; j++) {
				
				System.out.print(k++ + " ");
				if(k == 10)
					k = 1;
			}
			System.out.println();
		}
	}

}

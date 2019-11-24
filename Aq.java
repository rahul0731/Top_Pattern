package pattern;

public class Aq {
	public static void main(String[] args) {
		int num = 3;
		int count=0;
		for (int i = 0; i < num; i++) {
			count++;
			for (int j = i+1; j <num-1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <i+1; j++) {
				
				if (i%2!=0) {
					System.out.print(" -  ");
					
				}
				else
					System.out.print(" * ");
				
			}
			System.out.println(" ");
		}
		if (count>=2) {
			for (int i =num; i >1; i--) {
				for (int j = num-1; j >i-1; j--) {
					System.out.print("  ");
				}
				for (int j = i-1; j>0; j--) {
					
					if (i%2!=0) {
						System.out.print(" -  ");
						
					}
					else
						System.out.print(" * ");
					
				}
				System.out.println(" ");
			}
				
		}
		
		
	}

}

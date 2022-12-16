import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Bir sayı girin: ");
		int n = inp.nextInt();
		
		for (int i = n; i >= 0; i--) {
			
			for(int j = 0; j < (n-i); j++) {
				System.out.print(" ");
			}	
			
			for(int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}	
	}
}

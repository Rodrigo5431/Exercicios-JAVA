package exercicio81;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leiaInt = new Scanner(System.in);
				
		int a [][] = new int [5] [3];
		 for (int l = 0; l<5; l++) {
			 for (int c = 0; c <3; c++) {
				 
				 System.out.println("digite um numero");
				 a[l][c] = leiaInt.nextInt();
				 
			 }
		 }
		 for (int l = 0; l<5; l++ ) {
			 
			 for(int c= 0; c <3; c++) {
				 System.out.print(a[l][c]+ "\t");
			 }
			 System.out.println();
		 }
	}
}

package Exercicios71;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner leiaInt = new Scanner(System.in);
		
		int a[] = new int[8];
		int b[] = new int[8];
				
		for (int i = 0; i<8; i++) {
			System.out.println("digite um numero");
			a[i] = leiaInt.nextInt();
			b[i]= a[i]*3;
					
		}
		
		for (int i = 0; i<8; i++) {
			System.out.println(a[i] + "* 3 = "+ b[i]);
		}
	}
}

package Exercicios71;

import java.util.Scanner;

public class exercicio2 {
	
public static void main(String[] args) {
	
	Scanner leiaInt = new Scanner(System.in);
			
	int a[] = new int[5];
	int soma = 0;
	
	for(int  i =0; i<5; i++) {
		System.out.println("digite um numero");
		a [i] = leiaInt.nextInt();
		soma+=a[i];
	}
	System.out.println("somatroreio "+soma);
}
}

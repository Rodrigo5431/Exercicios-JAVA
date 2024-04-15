package Exercicios51;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		System.out.println("Digite um numero");
		
		int i =1;
		Scanner leiaint = new Scanner(System.in);
		int n = leiaint.nextInt();
		
		while(i<10) {
		
			i++;
			System.out.println(n+ "." +i+ "="+ n*i );
		}
		
	}
}

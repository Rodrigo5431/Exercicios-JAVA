package Exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
	
		System.out.println("Digite 3 numeros para fazer uma media aritmetica");
		
		Scanner lerint = new Scanner(System.in);
		
		int n1 = lerint.nextInt();
		int n2 = lerint.nextInt();
		int n3 = lerint.nextInt();
		
		int resultado = (n1 + n2 + n3)/3;
		

		
		System.out.println("a media aritmetica é: "+ resultado );
	}

}

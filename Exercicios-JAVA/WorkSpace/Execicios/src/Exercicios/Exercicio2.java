package Exercicios;
import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner leiaInt = new Scanner(System.in);
		
		System.out.println("Soma e multiplicação com 4 números inteiros");
		
		
		System.out.println("Digite o primeiro número");
		int num1 = leiaInt.nextInt();
		System.out.println("Digite o segundo número");
		int num2 = leiaInt.nextInt();
		System.out.println("Digite o terceiro número");
		int num3 = leiaInt.nextInt();
		System.out.println("Digite o quarto número");
		int num4 = leiaInt.nextInt();
		
		int soma = num1+num2+num3+num4;
		int mult = num1*num2*num3*num4;
		
		System.out.println("O resultado da soma dos números " + num1+"," + num2+"," + num3+"," + num4 + " é: " + soma);
		System.out.println("Amultiplicação dos números " + num1+"," + num2+"," + num3+"," + num4 + " é: " + mult);

	}

}

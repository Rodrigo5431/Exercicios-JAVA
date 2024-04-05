package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o valor em dolar que deseja a conversão");
		double n = valor.nextDouble();
		double resultado = n / 5.42;
		
		
	System.out.println("O valor em real é: " + resultado);
		
	}
}

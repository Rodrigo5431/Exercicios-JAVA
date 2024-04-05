package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		System.out.println("Digite uma temperatura em graus Fahrenheit");
		Scanner temperatura = new Scanner(System.in);
		
		Double graus = temperatura.nextDouble();
		Double resultado = (graus -32) * 5/9;
		System.out.println("A temperatura convertida em Graus Celsios é: " +resultado);
		

	}

}

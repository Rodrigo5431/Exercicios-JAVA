package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
			System.out.println(" Quanto é seu Salario?");
			
			Scanner salario = new Scanner(System.in);
			Double numero = salario.nextDouble();
			
	
			double resultado = numero * 15/100;
			resultado = resultado + numero;
			
			System.out.println("O seu Salario mais 15% é: " + resultado);
			
			
			
	}

}

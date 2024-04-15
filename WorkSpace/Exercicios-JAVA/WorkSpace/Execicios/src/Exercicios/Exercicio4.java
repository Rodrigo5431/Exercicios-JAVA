package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	Scanner numero = new Scanner(System.in);
		
	System.out.println("Digite um numero");
	int resultado = numero.nextInt(); 
	
	int antecessor = resultado -1;
	int sucessor = resultado +1;
	
	System.out.println("O sucessor do " + resultado + " é: " + sucessor);
	System.out.println("O antecessor do " + resultado + " é: " + antecessor);
	
	
	}
	
}

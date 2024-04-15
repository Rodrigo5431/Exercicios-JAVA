package Exercicios;
import java.util.Scanner;


public class Exercicio1 {
	
	public static void main(String[] args) {
			
		Scanner leiaString = new Scanner(System.in);
		
		
		System.out.println("Qual seu nome completo?");
		String nome = leiaString.nextLine();
		
		System.out.println("Qual seu sexo?");
		String sexo = leiaString.nextLine();
		
		System.out.println("Seu nome é: " + nome);
		System.out.println("Seu sexo é: " + sexo);
		
		

	}

}

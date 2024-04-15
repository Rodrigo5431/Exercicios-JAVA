package Exercicios71;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner leiaInt = new Scanner(System.in);
		
		String nome[]= new String[5];
		String profissao []= new String[5];
		
		for (int i = 0; i<5; i++) {
			System.out.println("digite seu nome");
			nome[i]= leiaInt.nextLine();
			System.out.println("digite sua profissao");
			profissao[i]= leiaInt.nextLine();
		}	
		for (int i = 0; i<5; i++) {
			System.out.println(nome[i]+ " é "+ profissao[i]);
		}
	}

}

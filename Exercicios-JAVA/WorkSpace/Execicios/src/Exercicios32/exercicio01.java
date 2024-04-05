package Exercicios32;

import java.util.Scanner;

public class exercicio01 {
	
	public static void main(String[] args) {
		System.out.println("Qual o valor da conta?");
		
		Scanner leiaint = new Scanner(System.in);
		
		Double n = leiaint.nextDouble();
		
		double resultado = n * 10/100;
		resultado = resultado + n;
		
		System.out.println("O valor da conta com o acrescimo de 10% é: " + resultado);
		

}
}		
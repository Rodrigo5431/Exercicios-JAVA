package exercicios52;

public class exercicio2 {
	public static void main(String[] args) {
		int i=0, soma =0;
		
		do {
			soma += i;
			i+=2;
		}
		while(i<=500);
		System.out.println("somatorio: " +soma);
	}

}

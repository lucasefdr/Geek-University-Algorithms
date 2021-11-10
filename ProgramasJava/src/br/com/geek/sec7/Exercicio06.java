package br.com.geek.sec7;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int numero;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero positivo menor que 10 : ");
		numero = input.nextInt();
		
		while ((numero > 10) || (numero < 1)) {
			System.out.println("Entrada inv�lida");
			System.out.println("Digite um n�mero menor que 10: ");
			numero = input.nextInt();
		}
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", numero, i, numero * i);
		}
		
		input.close();
	}
}

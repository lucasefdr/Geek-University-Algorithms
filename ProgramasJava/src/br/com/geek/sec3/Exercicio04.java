package br.com.geek.sec3;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int n1, n2, soma;
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Digite um n�mero: ");
		n1 = input.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		n2 = input.nextInt();
		
		soma = n1 + n2;
			
		System.out.println("A soma entre " + n1 + " e " + n2 + " � " + soma);
		
		input.close();
	}
}

package br.com.geek.sec6;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int valor, a, b;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		valor = input.nextInt();
		
		if (valor > 0) {
			a = valor;
			System.out.println("Valor positivo");
			System.out.println(a);
		} else {
			b = valor;
			System.out.println("Valor negativo");
			System.out.println(b);
		}
		
		input.close();
	}

}

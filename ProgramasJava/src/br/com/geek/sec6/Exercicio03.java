package br.com.geek.sec6;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int numero, p, i;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		numero = input.nextInt();
		
		if (numero % 2 == 0) {
			p = numero;
			System.out.println(p);
			System.out.println("Par");
		} else {
			i = numero;
			System.out.println(i);
			System.out.println("�mpar");
		}
		
		input.close();
	}

}

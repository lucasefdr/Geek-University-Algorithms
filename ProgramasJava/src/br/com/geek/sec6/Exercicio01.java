package br.com.geek.sec6;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int valor;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		valor = input.nextInt();
		
		if (valor > 100) {
			System.out.println(valor);
		} else {
			valor = 0;
			System.out.println(0);
		}
		
		input.close();
	}

}

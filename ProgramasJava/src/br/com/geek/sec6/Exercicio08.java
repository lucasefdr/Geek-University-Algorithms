package br.com.geek.sec6;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		// Declara��o de vari�veis
		int numero;
		Scanner input = new Scanner(System.in);
		
		// Entrada
		System.out.println("Digite um n�mero: ");
		numero = input.nextInt();
		
		// Processamento + Sa�das
		if ((numero > 0) && (numero % 2 == 0)) {
			System.out.printf("O n�mero %d � positivo e par!", numero);
		} else if ((numero > 0) && !(numero % 2 == 0)) {
			System.out.printf("O n�mero %d � positivo e �mpar!", numero);
		} else if ((numero < 0) && (numero % 2 == 0)) {
			System.out.printf("O n�mero %d � negativo e par!", numero);
		} else if ((numero < 0) && !(numero % 2 == 0)) {
			System.out.printf("O n�mero %d � negativo e �mpar!", numero);
		} else {
			System.out.printf("O n�mero %d � neutro!", numero);
		}
		
		input.close();
	}
}
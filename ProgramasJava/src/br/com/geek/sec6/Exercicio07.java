package br.com.geek.sec6;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		// Declara��o de vari�veis
		int n1, n2, n3, n4, q1, q2, q3, q4;
		Scanner input = new Scanner(System.in);
		
		// Entradas
		System.out.println("Digite um n�mero");
		n1 = input.nextInt();
		System.out.println("Digite outro n�mero");
		n2 = input.nextInt();
		System.out.println("Digite outro n�mero");
		n3 = input.nextInt();
		System.out.println("Digite outro n�mero");
		n4 = input.nextInt();
		
		// Processamento
		q1 = n1 * n1;
		q2 = n2 * n2;
		q3 = n3 * n3;
		q4 = n4 * n4;
		
		if (q3 >= 1000) {
			// Sa�das
			System.out.printf("n3 = %d, q3 = %d", n3, q3);
		} else {
			// Sa�das
			System.out.printf("n1 = %d, q1 = %d\n", n1, q1);
			System.out.printf("n2 = %d, q2 = %d\n", n2, q2);
			System.out.printf("n3 = %d, q3 = %d\n", n3, q3);
			System.out.printf("n4 = %d, q4 = %d\n", n4, q4);
		}
		
		input.close();
	}
}
package br.com.geek.sec6;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		int idade;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a idade do nadador: ");
		idade = input.nextInt();
		
		if ((idade >= 5) && (idade <= 7)) {
			System.out.println("Categoria Infantil A");
		} else if ((idade >= 8) && (idade <= 11)) {
			System.out.println("Categoria Infantil B");
		} else if ((idade >= 12) && (idade <= 13)) {
			System.out.println("Categoria Juvenil A");
		} else if ((idade >= 14) && (idade <= 17)) {
			System.out.println("Categoria Juvenil B");
		} else if (idade >= 18) {
			System.out.println("Categoria Adulto");
		} else {
			System.out.println("Categoria n�o definida");
		}
		
		input.close();
	}
}
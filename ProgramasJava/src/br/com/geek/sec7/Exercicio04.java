package br.com.geek.sec7;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int valor, soma = 0, maior = -999, menor = 999;
		float media;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um valor: ");
			valor = input.nextInt();
			
			if (valor > 0) {
				if (valor > maior) {
					maior = valor;
				} 
				if (valor < menor) {
					menor = valor;
				}
				soma += valor;
			} else {
				i--; 
			}
		}
		
		media = soma / 10;
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("M�dia: " + media);
		
		input.close();
	}
}

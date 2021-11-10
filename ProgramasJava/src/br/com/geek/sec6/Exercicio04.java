package br.com.geek.sec6;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		float altura, peso_ideal;
		char sexo;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		altura = input.nextFloat();
		
		System.out.println("Digite seu sexo: ");
		sexo = input.next().charAt(0);
		
		if (sexo == 'm' || sexo == 'M') {
			peso_ideal = (float)(72.7 * altura) - 58;
			System.out.printf("Seu peso ideal � %.2f", peso_ideal);
		} else if (sexo == 'f' || sexo == 'F'){
			peso_ideal = (float)((62.1 * altura) - 44.7);
			System.out.printf("Seu peso ideal � %.2f", peso_ideal);
		} else {
			System.out.println("Entrada inv�lida!");
		}
		
		input.close();
	}

}

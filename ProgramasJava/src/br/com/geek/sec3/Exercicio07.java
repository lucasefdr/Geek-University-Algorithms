package br.com.geek.sec3;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		float altura, peso_ideal;		
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Digite a sua altura: ");
		altura = input.nextFloat();
		
		peso_ideal = (float)(72.7 * altura) - 58;
		
		System.out.printf("O seu peso ideal � %.2f", peso_ideal);
		
		input.close();
	}
}

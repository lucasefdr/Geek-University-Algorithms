package br.com.geek.sec8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		List<Integer> vetor = new ArrayList<>();
		Integer soma = 0;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Digite um valor: ");
			vetor.add(input.nextInt());
			soma += vetor.get(i);
		}
		
		System.out.printf("A soma � %d", soma);
				
		input.close();
	}

}

package br.com.geek.sec6;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		// Declara��o de vari�veis
		float indice_poluicao;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o �ndice de polui��o: ");
		indice_poluicao = input.nextFloat();
		
		if ((indice_poluicao >= 0.3) && (indice_poluicao < 0.4)) {
			System.out.println("Ind�strias do G1 - Suspender atividades.");
		} else if ((indice_poluicao >= 0.4) && (indice_poluicao < 0.5)) {
			System.out.println("Ind�strias do G1 e G2 - Suspender atividades.");
		} else if (indice_poluicao >= 0.5) {
			System.out.println("Ind�strias do G1, G2 e G3 - Suspender atividades.");
		} else {
			System.out.println("O n�vel de polui��o est� controlado.");
		}
		
		input.close();
	}
}
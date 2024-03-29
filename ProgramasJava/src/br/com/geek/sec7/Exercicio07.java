package br.com.geek.sec7;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int id, tipo_defeito, quantidade = 0, nec_esfera = 0, nec_limpeza = 0, nec_cabo = 0, quebrado = 0;
		float perc_esfera, perc_limpeza, perc_cabo, perc_quebrado;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um ID ou 0 para sair: ");
		id = input.nextInt();
		
		while(id != 0) {
			System.out.printf("Identifique o defeito:\n"
					+ "1 - Necessita de esfera\n"
					+ "2 - Necessita de limpeza\n"
					+ "3 - Necessita de troca de cabo ou conector\n"
					+ "4 - Quebrado\n");
			tipo_defeito = input.nextInt();
			
			if (tipo_defeito == 1) {
				nec_esfera += 1;
			} else if (tipo_defeito == 2) {
				nec_limpeza += 1;
			} else if (tipo_defeito == 3) {
				nec_cabo += 1;
			} else if (tipo_defeito == 4) {
				nec_limpeza += 1;
			} else {
				System.out.println("Entrada inv�lida");
				continue;
			}
			
			quantidade += 1;
			System.out.println("Digite um ID ou 0 para sair: ");
			id = input.nextInt();
		}
		
		perc_esfera = (nec_esfera / (float)quantidade) * 100;
		perc_limpeza = (nec_limpeza / (float)quantidade) * 100;
		perc_cabo = (nec_cabo / (float)quantidade) * 100;
		perc_quebrado = (quebrado / (float)quantidade) * 100;
		
		System.out.printf("Quantidade de mouses: %d\n"
				+ "Situa��o  					   Quantidade  \t\t\t Percentual\n"
				+ "1 - Necessita de esfera  	   \t\t\t %d   \t\t	   %.2f%%\n"
				+ "2 - Necessita de limpeza  	   \t\t\t %d   \t\t	   %.2f%%\n"
				+ "3 - Necessita de troca de cabo  \t\t\t %d   \t\t	   %.2f%%\n"
				+ "4 - Quebrado                    \t\t\t %d   \t\t\t   %.2f%%\n"
				, quantidade, nec_esfera, perc_esfera, nec_limpeza, 
				perc_limpeza, nec_cabo, perc_cabo, quebrado, perc_quebrado
				);
	
		input.close();
	}
}

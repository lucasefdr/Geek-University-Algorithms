package br.com.geek.sec7;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		String nome, senha;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		nome = input.nextLine();
		
		System.out.println("Digite a senha: ");
		senha = input.nextLine();
		
		while (nome.equals(senha)) {
			System.out.println("Usu�rio e senha inv�lidos");
			
			System.out.println("Digite o nome: ");
			nome = input.nextLine();
			
			System.out.println("Digite a senha: ");
			senha = input.nextLine();
		}
		
		System.out.println("Login realizado com sucesso");
		
		input.close();
	}
}

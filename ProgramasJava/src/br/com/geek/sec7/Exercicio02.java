package br.com.geek.sec7;

public class Exercicio02 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 0) {
				System.out.printf("%d � divis�vel por 10\n", i);
				continue;
			}
			System.out.println(i);
		}
	}

}

#include <stdio.h>

int main() {
	int valor, maior = 0;

	while (valor != 0) {
		printf("Digite um valor: ");
		fflush(stdout);
		scanf("%d", &valor);

		if (valor > maior) {
			maior = valor;
		}
	}

	printf("O maior valor � %d", maior);
}

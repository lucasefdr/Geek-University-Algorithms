#include <stdio.h>

int main() {
	float peso, excesso, multa;

	printf("Digite o peso dos peixes: ");
	fflush(stdout);
	scanf("%f", &peso);

	if (peso > 50) {
		excesso = peso - 50;
		multa = excesso * 4;
	} else {
		excesso = 0;
		multa = 0;
	}

	printf("Peso: %.2f \n", peso);
	printf("Excesso: %.2f \n", excesso);
	printf("Multa: %.2f \n", multa);
}

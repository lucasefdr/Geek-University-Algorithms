#include <stdio.h>

int main() {
	float altura, peso_ideal;
	char sexo;

	printf("Digite sua altura: ");
	fflush(stdout);
	scanf("%f", &altura);

	printf("Digite M para masculino ou F para feminino: ");
	fflush(stdout);
	scanf("%s", &sexo);

	if (sexo == 'M' || sexo == 'm') {
		peso_ideal = (72.7 * altura) - 58;
		printf("Seu peso ideal � %.2f", peso_ideal);
	} else if (sexo == 'F' || sexo == 'f') {
		peso_ideal = (62.1 * altura) - 44.7;
		printf("Seu peso ideal � %.2f", peso_ideal);
	} else {
		printf("Entrada inv�lida");
	}
}

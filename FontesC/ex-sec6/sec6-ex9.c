#include <stdio.h>

int main () {
	float indice_poluicao;

	printf("Digite o �ndice de polui��o: ");
	fflush(stdout);
	scanf("%f", &indice_poluicao);

	if ((indice_poluicao >= 0.3) && (indice_poluicao < 0.4)) {
		printf("Grupo 1: suspender atividades!");
	} else if ((indice_poluicao >= 0.4) && (indice_poluicao < 0.5)) {
		printf("Grupo 1 e Grupo 2: suspender atividades!");
	} else if (indice_poluicao >= 0.5) {
		printf("Grupo 1, Grupo 2 e Grupo 3: suspender atividades!");
	} else {
		printf("N�veis aceit�veis!");
	}
}

#include <stdio.h>

int main() {
	// DECLARANDO VARI�VEIS
	int quantidade_minima, quantidade_maxima;
	float estoque_medio;

	// ENTRADA DE DADOS
	printf("Digite a quantidade m�nima do estoque: ");
	fflush(stdout);
	scanf("%d", &quantidade_minima);

	printf("Digite a quantidade m�xima do estoque: ");
	fflush(stdout);
	scanf("%d", &quantidade_maxima);

	// PROCESSAMENTO
	estoque_medio = (quantidade_minima + quantidade_maxima) / 2;

	// SA�DA
	printf("A estoque m�dio � %.2f", estoque_medio);
}

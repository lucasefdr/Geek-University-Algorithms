#include <stdio.h>

int main() {
	int num, a, b;

	printf("Digite um n�mero: ");
	fflush(stdout);
	scanf("%d", &num);

	if (num > 0) {
		a = num;
		printf("Valor positivo \n");
		printf("%d", a);
	} else {
		b = num;
		printf("Valor negativo \n");
		printf("%d", b);
	}
}

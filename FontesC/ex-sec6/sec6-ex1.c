#include <stdio.h>

int main() {
	int num;

	printf("Digite um n�mero: ");
	fflush(stdout);
	scanf("%d", &num);

	if (num > 100) {
		printf("%d", num);
	} else {
		num = 0;
		printf("%d", num);
	}
}

#include <stdio.h>
#include <string.h>

int main() {
	char nome[100], senha[100];

	printf("Digite o nome do usu�rio: ");
	fflush(stdout);
	gets(nome);

	printf("Digite a senha do usu�rio: ");
	fflush(stdout);
	gets(senha);

	// strcmp = string compare
	while (!strcmp(nome, senha)) {
		printf("A senha n�o pode ser igual ao nome\n");

		printf("Digite o nome do usu�rio: ");
		fflush(stdout);
		gets(nome);

		printf("Digite a senha do usu�rio: ");
		fflush(stdout);
		gets(senha);
	}

	printf("Login realizado com sucesso");

}

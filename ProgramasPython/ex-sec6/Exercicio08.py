# -*- coding: UTF-8 -*-
numero = int(input("Digite um número: "))

if numero > 0:
    if numero % 2 == 0:
        print(f"O número {numero} é positivo e par.")
    else:
        print(f"O número {numero} é positivo e ímpar.")
elif numero < 0:
    if numero % 2 == 0:
        print(f"O número {numero} é negativo e par.")
    else:
        print(f"O número {numero} é negativo e ímpar.")
else:
    print(f"O número {numero} é neutro.")
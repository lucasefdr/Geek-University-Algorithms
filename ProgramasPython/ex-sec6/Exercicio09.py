# -*- coding: UTF-8 -*-
indice_poluicao = float(input("Digite o índice de poluição: "))

if indice_poluicao >= 0.3 and indice_poluicao < 0.4:
    print("Empresas do G1: Suspender atividades!")
elif indice_poluicao >= 0.4 and indice_poluicao < 0.5:
    print("Empresas do G1 e do G2: Suspender atividades!")
elif indice_poluicao >= 0.5:
    print("Todas as empresas: Suspender atividades!")
else:
    print("O índice de poluição está aceitável.")
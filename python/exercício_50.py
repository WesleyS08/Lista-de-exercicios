from itertools import combinations
vezes=int(input("Escreva quantas vezes deseja lançar o par de dados: "))
lis= [1,2,3,4,5,6]
for i in (2, len(lis)):
    for comb in combinations (lis, i):
        if sum(comb) == vezes:
            print(comb, "=", vezes)

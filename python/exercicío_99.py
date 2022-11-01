from itertools import combinations, product
import random

vezes = 0
v = 0
homens = []
mulheres = []
casamento = []


print("\n DIgite o tamano da lista dos homens! \n")
ll = int(input("Digite o numero de linhas que deseja: "))
print()
print("-="*60)
print()
for vezes in range(ll):
    homens.append(random.randint(18, 30))
    vezes = vezes + 1

print("=-"*60)
print("Os numers digitados foram: ")
for vezes in range(ll):

    print(homens[v], end='')
    v = v + 1
    print()


print("\n DIgite o tamano da lista das mulheres! \n")


ll1 = int(input("Digite o numero de linhas que deseja: "))
print()
print("-="*60)
print()
for vezes in range(ll1):
    mulheres.append(random.randint(18, 30))
    vezes = vezes + 1
v = 0
vezes = 0
print("-="*60)
print("\n Os numers digitados foram: \n")
for vezes in range(ll1):
    print(mulheres[v], end='')
    v = v + 1
    print()


for i in range(ll):
    casamento.append(homens[i])
for i in range(ll1):
    casamento.append(mulheres[i])

casamentoo = combinations(casamento, 2)
print("-="*60)
print("\n As possiveis combinações de casamento são! \n")
for i in list(casamentoo):
    print(i)


maishomens = max(homens, key=homens.count)
maismulheres = max(mulheres, key=mulheres.count)
print("-="*60)
print("\n A idade mais freqüente de casamento dos homens é: {}".format(maishomens))
print("-="*60)
print("\n A idade mais freqüente de casamento das mulheres é: {}".format(maismulheres))
print("-="*60)

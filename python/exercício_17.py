print()
print("=-"*60)
print()
print("---------------Saque no caixa el------------------")
print()
print("=-"*60)
print()

valor=int(input("Digite o valor que deseja sacar: "))
total = valor
celula=100
totalcelula=0
while True:
    if total >= celula:
        total -= celula
        totalcelula += 1
    else:
        if totalcelula > 0:
            print(f'Total de {totalcelula} cédulas de R${celula}')
        if celula == 100:
            celula = 50 
        elif celula == 50:
            celula = 20
        elif celula == 20:
            celula = 5
        elif celula == 5:
            celula = 2 
        elif celula == 2:
            celula = 1
        elif celula == 1:
            celula = 1
        totalcelula = 0
        if total == 0:
            break 
print()
print("=-"*60)
print()
print("----------------permita o valor de duas variaveis-----------------")
print()
print("=-"*60)
print()
vatore = []
v = 0
vezes = 0
for vezes in range(2):
    vatore.append(
        int(input("Digite um valor para a posição {}:  ".format(vezes))))
    print()
    vezes = vezes + 1
    print()
print("=-"*60)
print()
print("Os numers digitados foram: ")
for vezes in range(2):
    print(vatore[v], end='')
    v = v + 1
    print()
    print()
print("=-"*60)
print()

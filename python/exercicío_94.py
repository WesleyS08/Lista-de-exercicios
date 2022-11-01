matriz = [[0,0,0,0,0,0], [0,0,0,0,0,0], [0,0,0,0,0,0], [0,0,0,0,0,0], [0,0,0,0,0,0], [0,0,0,0,0,0]]

for l in range(0, 6):
    for c in range(0, 6):
        matriz[l][c] = int(input(' Digite os valores para [{}, {}]:  '.format(l, c)))

print("=-"*60)
print("\n Os numers digitados foram: \n")
for l in range(0, 6):
    for c in range(0, 6):
        print(f'[{matriz[l][c]:^5}]', end='')
    print()
print()
n1 = int(input("Digite um numero para se multiplicar a matriz: "))
print()
for l in range(0, 6):
    for c in range(0 ,6):
        matriz[l][c] = matriz[l][c] * n1 

for l in range(0, 6):
    for c in range(0, 6):
        print(f'[{matriz[l][c]:^5}]', end='')
    print()
print()
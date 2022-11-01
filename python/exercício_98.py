matriz3 = [[0,0],[0,0],[0,0],[0,0]]
matriz1 = [[0,0,0],[0,0,0],[0,0,0],[0,0,0]]
matriz2 = [[0,0],[0,0],[0,0]]
print("=-"*60)
print("\n Digite o valor da primeira matriz \n")

for l in range(0, 4):
    for c in range(0, 3):
        matriz1[l][c] = int(input(' Digite os valores para [{}, {}]:  '.format(l, c)))
print()
print("=-"*60)
print("\n Digite os valores da segunda matriz \n")

for l in range(0, 3):
    for c in range(0, 2):
        matriz2[l][c] = int(input(' Digite os valores para [{}, {}]:  '.format(l, c)))

print()
print("=-"*60)
print("\n Os numers digitados na primeira matriz foram: \n")

for l in range(0, 4):
    for c in range(0, 3):
        print(f'[{matriz1[l][c]:^5}]', end='')
    print()
print()
print("=-"*60)
print("\n Os numers digitados na segunda matriz foram: \n")

for l in range(0, 3):
    for c in range(0, 2):
        print(f'[{matriz2[l][c]:^5}]', end='')
    print()
print()
print("=-"*60)
matriz3[0][0] = (matriz1[0][0] * matriz2[0][0]) + (matriz1[0][1] * matriz2[1][0]) + (matriz1[0][2] * matriz2[2][0])
matriz3[0][1] = (matriz1[0][0] * matriz2[0][1]) + (matriz1[0][1] * matriz2[1][1]) + (matriz1[0][2] * matriz2[2][1])
matriz3[1][0] = (matriz1[1][0] * matriz2[0][0]) + (matriz1[1][1] * matriz2[1][0]) + (matriz1[1][2] * matriz2[2][0])
matriz3[1][1] = (matriz1[1][0] * matriz2[0][1]) + (matriz1[1][1] * matriz2[1][1]) + (matriz1[1][2] * matriz2[2][1])
matriz3[2][0] = (matriz1[2][0] * matriz2[0][0]) + (matriz1[2][1] * matriz2[1][0]) + (matriz1[2][2] * matriz2[2][0])
matriz3[2][1] = (matriz1[2][0] * matriz2[0][1]) + (matriz1[2][1] * matriz2[1][1]) + (matriz1[2][2] * matriz2[2][1])
matriz3[3][0] = (matriz1[3][0] * matriz2[0][0]) + (matriz1[3][1] * matriz2[1][0]) + (matriz1[3][2] * matriz2[1][0])
matriz3[3][1] = (matriz1[3][0] * matriz2[0][1]) + (matriz1[3][1] * matriz2[1][1]) + (matriz1[3][2] * matriz2[2][1])

print("\n Sua matriz ficou: \n")
for l in range(0, 4):
    for c in range(0, 2):
        print(f'[{matriz3[l][c]:^5}]', end='')
    print()
print()
print("=-"*60)
print()
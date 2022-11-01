matriz = [[0,0,0,0,0,0], [0,0,0,0,0,0], [0,0,0,0,0,0], [0,0,0,0,0,0], [0,0,0,0,0,0], [0,0,0,0,0,0]]
resultado= []
v = 0
for l in range(0, 6):
    for c in range(0, 6):
        matriz[l][c] = int(input(' Digite os valores para [{}, {}]:  '.format(l, c)))

for l in range(0, 6):
    for c in range(0, 6):
        resultado.append(matriz[l][c])
print()
for vezes in range(37):
    print(resultado[v], end='')
    v = v + 1
    print()

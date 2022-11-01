
A = [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]
somaLinhas = [[], [], [], [], []]
somaColunas = [[], [], [], [], []]
for l in range(5):
    for c in range(5):
        A[l][c] = int(input(f'Valor da linha {l+1} e coluna {c+1}: '))
        somaLinhas[l].append(A[l][c])
        somaColunas[c].append(A[l][c])
print('-='*30)
print("   Linha   ")
print(somaLinhas)
for i, v in enumerate(somaLinhas):
    print(f"Soma Linha {i+1} = {sum(v)}")
print('-='*30)
print("  Coluna  ")
print(somaColunas)
for i, v in enumerate(somaColunas):
    print(f"Soma Coluna {i+1} = {sum(v)}")
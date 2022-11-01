
A = [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]
for l in range(5):
    for c in range(5):
        A[l][c] = int(input(f'Valor da linha {l+1} e coluna {c+1}: '))

if A[0] == A[1] and A[2] == A[3]:
    print(f"É uma matriz simétrica")
else:
    print("Não é uma matriz simétrica")

if A[0][4] == A[1][0]:
    print(f"É uma matriz diagonal principal")
else:
    print("Não é uma matriz diagonal principal")
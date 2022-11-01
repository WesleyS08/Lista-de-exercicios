matriz1 = [[0,0,0],[0,0,0],[0,0,0],[0,0,0]]
for l in range(0,4):
    for c in range(0,3):
        matriz1[l][c] = int(input("Digite os valores para[{};{}]: ").format(l,c))
for l in range(0, 4):
    for c in range(0, 3):
        print(f'[{matriz1[l][c]:^5}]', end='')
    print()

matriz2 = [[0,0,0],[0,0,0],[0,0,0],[0,0,0]]
for l in range(0,4):
    for c in range(0,3):
        matriz2[l][c] = int(input("Digite os valores para[{};{}]: ").format(l,c))

soma = matriz1 + matriz2

print("soma da matriz:",soma)
diferença =[[0,0,0],[0,0,0],[0,0,0],[0,0,0]]
for l in range(0,4):
    for c in range(0,3):
        diferença[l][c] = matriz1[l][c] - matriz2[l][c]


for l in range(0, 4):
    for c in range(0, 3):
        print(f'[{diferença[l][c]:^5}]', end='')
    print()

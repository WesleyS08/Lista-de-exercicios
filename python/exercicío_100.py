from collections import Counter

lista = []
cont = 0 
nc = int(input('Quantas colunas? '))
nl = int(input('Quantas linhas? '))
for c in range(0, nl):
    lista.append([])
for c1 in range(0, nl):
    for c2 in range(0, nc):
        n = int(input(f'Número L[{c1+1}] C[{c2+1}]: '))
        lista[c1].append(n)
print()
for i in range(0, nl):
    for c in range (0, nc):
       print(f'[{lista[i][c]:^5}]', end='')
    print()
print ()

for i in range(0, nl):
    for c in range (0, nc):
        if lista[0][0] == lista[i][c]:
            print("A matriz: ")
            for i in range(0, nl):
                for c in range (0, nc):
                    print(f'[{lista[i][c]:^5}]', end='')
                print()
            print ()
        print("Não forma um Quadrado Latino de ordem N")
    else:
        print("A matriz: ")
        for i in range(0, nl):
            for c in range (0, nc):
                print(f'[{lista[i][c]:^5}]', end='')
            print()
        print ()
    print("Forma um Quadrado Latino de ordem N")

    

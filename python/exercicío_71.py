vetor = list()
print("Informe Dez inteiros")
for c in range(10):
    seq = int(input(f"Digite o {c + 1}° valor: "))
    vetor.append(seq)
print('-' * 70)
print("O programa deve informar a posição onde este inteiro ocorre no vetor")
print('-' * 70)
print("Informe Um inteiro")
x = int(input("Digite um valor: "))


for i, v in enumerate(vetor):
    if x == v:
        print(f"O valor {x} ocorre na posição {i+1}")
        break
    else:
        if x not in vetor:
            print(f'{-1}')
            break
print(vetor)
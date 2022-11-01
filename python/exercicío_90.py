caracter = str(input('Digite uma palavra: '))
palavra = caracter
print(f'A palavra {caracter} tem as vogais: ', end='')
for i in range(len(palavra)):
    for v in palavra[i]:
        if v.upper() in 'AEIOU':
            print(f'{v}', end=', ')
print()
print(f'E tem as consoantes: ', end='')
for i in range(len(palavra)):
    for v in palavra[i]:
        if v.upper() in 'BCDFGJKLMNPQRSTVWXZ':
            print(f'{v}', end=', ')


elemento1=int(input("Escreva o elemento 1: "))
elemento2=int(input("Escreva o elemento 2: "))
termo=int(input("Quantidade de termo desejado: "))
i = 0
if termo > 3:
    print("A quantidade miníma de termos é 3")
elif termo <= 3:
    i = 3 or i < termo
    if i % 2 == 0:
        valortermo = elemento1 - elemento2
        print("Reusltado: ", valortermo)
    else:
        valortermo = elemento1 + elemento2
        print("Reusltado: ", valortermo)

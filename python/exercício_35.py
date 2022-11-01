print()
print("=-"*60)
print()
print("--------------Dias da semana------------------")
print()
print("=-"*60)
print() 
dia=int(input("Digite um valor de 1 a 7: "))

if dia == 1:
    print("domingo")
else:
    if dia == 2:
        print("Segunda-feira")
    if dia == 3:
        print("Terça-feira")
    if dia == 4:
        print("Quarta-feira")
    if dia == 5:
        print("Quinta-feira")
    if dia == 6:
        print("Sexta-feira")
    if dia == 7:
        print("Sabado")
if dia >7:
    print("Digite um valor valido")
if dia <1:
    print("Digite um valor valido")

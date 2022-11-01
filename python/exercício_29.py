print()
print("=-"*60)
print()
print("--------------Desconto de salario------------------")
print()
print("=-"*60)
print() 
salario=float(input("Digite o seu salario: "))
print()
print("=-"*60)
print()
desconto = salario * 0.89
a = salario - desconto
if a <= 334.29:
    print("Seu salario é {} e com desconto ficou {}".format(salario,desconto))
    print()
    print("=-"*60)
    print()
else: 
    b= salario - 334.29
    print("O salarios {} ultrapassou o limite de desconto de R$:334.29 então o novo dalario ficou: {}".format(salario, b))
    print()
    print("=-"*60)
    print()
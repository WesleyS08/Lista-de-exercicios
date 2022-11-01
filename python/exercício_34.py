print()
print("=-"*60)
print()
print("--------------empréstimos------------------")
print()
print("=-"*60)
print() 
renda=float(input("Digite a sua renda mensal: "))
empréstimo= float(input("Digite o valor do emprestimo que deseja: "))
parcelas= int(input("Quantas parcelas deseja solicitar: "))

parcelaspagas = renda * 0.70
parcelastotal = parcelaspagas * parcelas
limite= renda * 10

if empréstimo > limite:
    print("O valor desejado não pode ser aprovado")
if parcelastotal < parcelas:
    print("O valor desejado não pode ser aprovado")
if empréstimo <= limite:
    if parcelastotal > parcelas:
        print(f'O valor do emprestimo de {empréstimo} foi aprovado com {parcelas} parcelas')

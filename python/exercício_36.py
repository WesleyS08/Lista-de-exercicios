print()
print("=-"*60)
print()
print("--------------Notas das provas------------------")
print()
print("=-"*60)
print() 
n1=float(input("Digite a nota da primeira prova: "))
n2=float(input("Digite a nota da segunda prova: "))
n3=float(input("Digite a nota da terceira prova: "))
n4=float(input("Digite a nota da quarta prova: "))
n5=float(input("Digite a nota da quinta prova: "))
media = 70

if n1 >= media:
    if n2 >= media:
        if n3 >= media:
            if n4 >= media:
                if n5 >= media: 
                    print("A – passou em todos os exames!")
if n1 >= media:
    if n2 >= media:
        if n3 < media:
            if n4 >= media:
                if n5 < media:
                    print("B – passou em I, II e IV, mas não em III ou V.")
if n1 >= media:
    if n2 >= media:
        if n3 >= media:
            if n4 >= media:
                if n5 < media: 
                    print("C – passou em I e II, III ou IV, mas não em V.") 
else: 
    print("Reprovado - outra situação")        

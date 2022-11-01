print()
print("=-"*60)
print()
print("--------------Media de 3 notas------------------")
print()
print("=-"*60)
print() 
n1=float(input("Digite a primeira nota: "))
print()
print("=-"*60)
print()
n2 = float(input("Digite o segunda nota: "))
print()
print("=-"*60)
print()
n3= float(input("Digite a terceira nota: "))
print()
print("=-"*60)
print()
if n1 > n2:
    if n1 > n3:
        media=((n1*5)+(n2*2.5)+(n3*2.5))/10
        print("A media das notas {}, {}, {} é {}".format(n1, n2, n3, media))
        print()
        print("=-"*60)
        print()
if n2 > n1:
    if n2 > n3:
        media=((n1*2.5)+(n2*5)+(n3*2.5))/10
        print("A media das notas {}, {}, {} é {}".format(n1, n2, n3, media))
        print()
        print("=-"*60)
        print()
if n3 > n1:
    if n3 > n2:
        media=((n1*2.5)+(n2*2.5)+(n3*5))/10
        print("A media das notas {}, {}, {} é {}".format(n1, n2, n3, media))
        print()
        print("=-"*60)
        print()
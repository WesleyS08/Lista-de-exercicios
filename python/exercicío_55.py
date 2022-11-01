n1 = int (input("\nPrimeiro número: "))
n2 = int (input("\nSegundo número: "))
x = 1
soma = 0

while x < n1:
    if n1 % x == 0:
        soma = soma + x
    x = x + 1
if soma == n2:
    print("\nOs números são amigos")
else:
    print("\nOs números não são amigos")
print()


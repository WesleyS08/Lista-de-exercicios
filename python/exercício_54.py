n1 = int(input("Escreva em numeros: "))
i = 1 
t = 0 
while t < n1:
    t = i*(i+1)*(i + 2)
    i += 1 
if t == n1:
    print('%d é triangular' %n1)
else: 
    print('%D não é triangular' %n1)
    
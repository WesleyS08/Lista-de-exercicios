pi = int
n =  int (input("Escreva um número qualquer: "))
calculo = 1 
for i in range(3,n,2): 
    calculo -= 1/(n**3)
p = (calculo * 32)**(1/3)
print(calculo) 
print(p)


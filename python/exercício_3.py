a = 0 
p = 0  
pi = float(3.14)

print("=-"*60)  

print("\n -------------------Calculo de area e perímeto de uma circunferência--------------- \n")

print("=-"*60)


r = int(input("\nDigite a medida do raio da sua circunferência cm: "))


print("=-"*60)

p =float(2 * pi * r)
print(f'\n O perímeto da sua circunferência é: {p:,.2f}\n')

print("=-"*60)

a= float(pi * r * r )
print("\nA area da sua circunferência é: {}cm²\n".format(a))

print("=-"*60)

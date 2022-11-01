print("Determina se um número n é perfeito\n")

n = int(input("Digite o valor de n: "))

soma = 0
  
for divisor in range(1,n):
        if n % divisor == 0:
            soma += divisor 

if n == soma:
        print("O numero %d é perfeito" %(n))
else: 
        print("O numero %d nao é perfeito\n" %(n))
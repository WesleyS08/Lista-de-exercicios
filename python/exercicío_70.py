import random
var = int(input('Digite o tamanho do seu vetor'))
vet = [0] * var
i = 0

for i in range(var) :
   vet[i] = random.randint(0,100)
   
print(vet)
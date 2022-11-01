vetor = []
vezes = []
c = 0
total =0
while c in range(15):
    vetor.append(int(input("Digite um valor para a  pocisao {}: ".format(c))))
    c +=1
vezes.append(int(input("Digite o numero que deseja verificar: ")))

c = 0
print("=-"*60)
print("Os numers digitados foram: ")
for c in range(15):
    print(vetor[c], end='')
    c = c + 1
    print()
c =0 

print(set(vetor) & set(vezes))
      
   


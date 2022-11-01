print()
print("=-"*60)
print()
print("--------------Quarterback Rating------------------")
print()
print("=-"*60)
print() 
pt=int(input("Digite quantos passes foram tentados: "))
pc=int(input("Digite a quantidade de passes completos: "))
jp=int(input("Digite o numero de jardas passadas: "))
pto= int(input("Digite o numero de passes para touchdown: "))
pi= int(input("Digite a quantidade de interceptações lançadas: "))

pt1= ((((pc / pt) - 0.3) * 5 + ((jp / pt) - 3) * 0.25 + (pto / pt) * 20 + 2.375 - ((pi / pt) * 25)) / 6) * 100
print(pt1)
if pt1 >= 158.3:
    
    print("O jogador deve uma pontuação de {} o jogo perfeito".format(pt1))
else:
    print("O jogador deve uma pontuação de {}".format(pt1))

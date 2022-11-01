print()
print("=-"*60)
print()
print("--------------Numero primo ou não------------------")
print()
print("=-"*60)
print() 
n1=int(input("Digite um numero que deseja saber se é primo ou não: "))
tot = 0
for c in range(1, n1 + 1):
            if n1 % c == 0:
                tot += 1
if tot == 2:
    print("O numero {} é primo".format(n1))
else:
    print("O numero {} não é primo".format(n1))
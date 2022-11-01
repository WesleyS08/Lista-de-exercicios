n1=int(input("Digite o numero que deseja saber se é primo: "))
tot = 0
for c in range(1, n1 + 1):
            if n1 % c == 0:
                tot += 1
if tot == 2:
    print("O numero {} é primo".format(n1))
else:
    print("O numero {} não é primo".format(n1))
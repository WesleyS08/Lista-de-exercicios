print()
print("=-"*60)
print()
print("--------------Sistema de pulverização------------------")
print()
print("=-"*60)
print() 
print("Tipo 1 – ervas daninhas")
print("Tipo 2 – gafanhotos")
print("Tipo 3 – broca")
print("Tipo 4 – todos acima ")
n1= int(input("Digite qual desses voce deseja: "))
if n1 >= 5:
    print("Digite uma opção valida")
if n1 <=4:
    n2=int(input("Digite a quantidade de acre: "))

if n1 == 1:
    if n2 >= 1000:
        a= (50.00 * n2) * 0.95
        print("A opção escolhida foi {} com um tamanho de {}, ficando por um valor de {}".format(n1, n2, a))
        if a >= 750.00:
                aa= a - 750.00
                a = (aa * 0.90) + 750.00
                print("A opção escolhida foi {} com um tamanho de {}, ficando por um valor de {}".format(n1, n2, a))
if n1 == 2:
    if n2 >= 1000: 
        b= (100.00 * n2)* 0.95
        print("A opção escolhida foi {} com um tamanho de {}, ficando por um valor de {}".format(n1, n2, b))
        if b >= 750.00:
                bb= b - 750.00
                b = (bb * 0.90) + 750.00
                print("A opção escolhida foi {} com um tamanho de {}, ficando por um valor de {}".format(n1, n2, b))
if n1 == 3:
    if n2 >= 1000:
        c = (150.00 * n2) * 0.95
        print("A opção escolhida foi {} com um tamanho de {}, ficando por um valor de {}".format(n1, n2, c))
        if c >= 750.00:
                cc= c - 750.00
                c = (cc * 0.90) + 750.00
                print("A opção escolhida foi {} com um tamanho de {}, ficando por um valor de {}".format(n1, n2, c))
if n1 == 4:
    if n2 >= 1000:
        d = (250.00 * n2 ) * 0.95 
        print("A opção escolhida foi {} com um tamanho de {}, ficando por um valor de {}".format(n1, n2, d))
        if d >= 750.00:
                dd= d - 750.00
                d = (dd * 0.90) + 750.00
                print("A opção escolhida foi {} com um tamanho de {}, ficando por um valor de {}".format(n1, n2, d))


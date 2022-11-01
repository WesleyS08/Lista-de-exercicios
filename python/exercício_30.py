print()
print("=-"*60)
print()
print("--------------Venda de combustivel------------------")
print()
print("=-"*60)
print() 
a = int(input(("Escolha entre 1-Gasolina ou 2-Álcool:")))
print()
print("=-"*60)
print()
b = float(input("Digite quantos litros voce4 deseja: "))
print()
print("=-"*60)
print()

if a == 1:
    if b <= 25:
       litros= b * 2.70 * 0.97
       print(f'O valor a ser pago é: {litros:,.2f}')
       print()
       print("=-"*60)
       print()
    if b > 25:
        litross = b * 2.70 * 0.95
        print(f'O valor a ser pago é: {litross:,.2f}')
        print()
        print("=-"*60)
        print()
if a == 2:
    if b <= 25:
        litroo= b * 1.90 * 0.98
        print(f'o valor a ser pago é: {litroo:,.2f}')
        print()
        print("=-"*60)
        print()
    if b > 25:
        litru= b * 1.90 * 0.96
        print(f'O valor a ser pago é: {litru:,.2f}')
        print()
        print("=-"*60)
        print()
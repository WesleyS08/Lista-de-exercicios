print("=====NUMERO DA AGÊNCIA=====")
numero1=int(input("\nDigite um número: "))
numero2=int(input("Digite um número: "))
numero3=int(input("Digite um número: "))
numero4=int(input("Digite um número: "))

dv1= (numero1 * 5) + (numero2 * 4) + (numero3 * 3) + (numero4 * 2)
dv= 11 - (dv1 % 11)
print("\nO número da agência é: ",numero1,numero2,numero3,numero4,"-",dv)
print("\n=====FIM DO PROGRAMA=====")
palavra1= str(input("Digite algo: "))
palavra2= str(input("\nDigite outra palavra: "))

lower1= palavra1.lower()
lower2 = palavra2.lower()


if lower1 == lower2:
    print(f'\nA palavra {palavra1} e a {palavra2} são iguais!\n ')
else: 
    print(f'\nA palavra {palavra1} e a  {palavra2} são diferentes\n')
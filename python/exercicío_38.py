print("\n=====ANO BISSEXTO=====")
ano=int(input("\nescreva o ano: "))
if ano % 400 == 0:
    print("O ano ", ano," é bissexto")
elif ano % 400 >= 1:
    print("\nO ano ",ano," não é bissexto")
print("\n=====FIM DO PROGRAMA=====")
print()    
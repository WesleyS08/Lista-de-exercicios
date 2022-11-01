print()
print("=-"*60)
print()
print("--------------vocal consoante, número ou um símbolo------------------")
print()
print("=-"*60)
print() 
n1=str(input("Digie um caracter para saber o tipo dele: "))
print()
print("=-"*60)
print() 

simbolo = ('!','@','#','%','$',
'¨','&','*','(',')',
'_','-','+','=','{',
'[','}',']','º','/',
'?','<','>','\'','|','*','.')

vogal= ('a','A','e','E','i','I','o','O','u','U')

consoante=('q','Q','w','W','r','R',
't','T','y','Y','p','P','s','S',
'd','D','f','F','g','G','h','H',
'j','J','k','K','l','L','ç','Ç',
'z','Z','x','X','c','C','v','V','b','B','n','N','m','M')

if n1 in simbolo:
    print("Voce digitou um Simbolo")
    print()
    print("=-"*60)
    print() 
elif n1 in vogal:
    print("Voce digitou uma Vogal")
    print()
    print("=-"*60)
    print() 
elif n1 in consoante:
    print("Voce digitou uma Consoante")
    print()
    print("=-"*60)
    print() 
else : 
    print("Voce digitou um Numero")
    print()
    print("=-"*60)
    print() 

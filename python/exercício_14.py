import math
print()
print("=-"*60)
print()
print("----------------Distancia do carro-----------------")
print()
print("=-"*60)
print()
distancia = int(input("digite a distancia em metros: "))
velocidade = int(input("Digite a velocidade permitida na rua: "))
v = velocidade / 3.6
velo_media = ((v ** 2) - 0 **2 ) / 2
tempo = 2*(velo_media - 0)/ 1
t1=math.sqrt(tempo)
dis= (distancia / t1 )-3
print()
print("=-"*60)
print()
if dis >= 60:
    dist = dis / 60
    print("O semaforo deve abrir {} min antes".format(dis))
    print()
    print("=-"*60)
    print()
else: 
    print()
    print("=-"*60)
    print()
    print("O semaforo deve abrir {} s antes".format(dis))
    print()
    print("=-"*60)
    print()
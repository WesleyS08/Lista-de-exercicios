print()
print("=-"*60)
print()
print("--------------Coodernadas------------------")
print()
print("=-"*60)
print() 
x = int(input("Digite um valor para o X: "))
y= int(input("complete as coordenads: {},:".format(x)))

if x == 0:
    if y == 0:
        print("As coordenadas, {},{} se encontram no eixo".format(x,y))
if x >= 1:
    if y >=1:
        print("As coordenads {},{} se encontram no primeiro quardrante".format(x,y))
if x <= -1:
    if y >=1 :
        print("As coordenads {},{} se encontram no segundo quardrante".format(x,y))
if x <= -1:
    if y <=-1:
        print("As coordenads {},{} se encontram no terceiro quardrante".format(x,y))
if x >= 1:
    if y <=-1:
        print("As coordenads {},{} se encontram no quartro quardrante".format(x,y))
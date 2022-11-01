import heapq 
print()
print("=-"*60)
print()
print("--------------Leia 3 numeros------------------")
print()
print("=-"*60)
print() 
numeros = []
vezes =0

for vezes in range(3):
    numeros.append(int(input("Digite um valor: ")))
    print()
    vezes = vezes + 1
n1= heapq.nlargest(2,numeros)
n2=sum(n1)
print()
print("=-"*60)
print()
print("A soma dos dois maiores valores é: {}".format(n2))
print()
print("=-"*60)
print()
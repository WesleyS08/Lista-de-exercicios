from math import factorial
termos = int(input("Digite a quantidade de termos que deseja: "))
divisor = 1 * termos
resul = 0
vezes =0
for vezes in range(termos + 1):
    resultado = factorial(vezes)
    resul = resultado
    vezes +=1
print(resul)
print(f'O {termos} dessa sequencia ficou {1 + (divisor / resul)}')

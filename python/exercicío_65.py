meuvetor = [2, 22, 40, 57, 43, 4, 7, 2, 90, 12, 3, 42, 1, 13, 15, 17, 19, 20, 23, 35]

for i in range(len(meuvetor)):
    maior=max(meuvetor)
    menor=min(meuvetor)
    if meuvetor[i] == menor:
        print("\nposição[{}] = {} <--- menor valor".format(i+1,meuvetor[i]))
    elif meuvetor[i] == maior:
        print("posição[{}] = {} <--- maior valor".format(i+1,meuvetor[i]))
       
       
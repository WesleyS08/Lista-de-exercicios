meuvetor = [1,2,3,4,5,6,7,8,9,10]
count = 0

for i in range(10):
    if meuvetor[i] % 2 == 0:
        count += 1

print("Números pares: {}".format(count))
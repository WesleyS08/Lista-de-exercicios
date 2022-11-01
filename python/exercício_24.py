vatore = []
vezes = 0
print()
print("=-"*60)
print()
print("----------------O maior entre os 3 numeros-----------------")
print()
print("=-"*60)
print() 
for vezes in range(3):
    vatore.append(
        int(input("Digite o numero:  ")))
    print()
    vezes = vezes + 1
print()
print("=-"*60)
print()
maximum = max(vatore)
print("O maior valor Digitado foi:  ------>     {} ".format(maximum))
print()
print("=-"*60)
print()
palavra=str(input("Digite algo: "))
vogais = "aeiou"
totalVogal = 0

for letra in palavra:
    if letra in vogais:
        totalVogal += 1

print(f'\n A palavra {palavra} tem um total de {totalVogal} vogais\n')
from fractions import Fraction
print()
print("=-"*60)
print()
print("----------------Fahrenheit para Celsius------------------")
print()
print("=-"*60)
print("----------------------Digite em Fahrenheit-----------------------")
n=int(input("Digite a temperatura que voce deja conveter para Celsius: "))
f = Fraction(5,9)
c =float(n - 32) * f
print()
print("=-"*60)
print("A temperatura em Celsius é: {}".format(c))
print()
print("=-"*60)

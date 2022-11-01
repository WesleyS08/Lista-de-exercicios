paisA = 5000000
paisB = 7000000
qtdAnos = 0

while paisB > paisA :
  populacaoPaisA = paisA * 0.03
  populacaoPaisB = paisB * 0.02
  paisA = paisA + populacaoPaisA
  paisB = paisB + populacaoPaisB
  qtdAnos = qtdAnos + 1

print("\nO país A passará o país B em",qtdAnos,"anos")
print()
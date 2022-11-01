matriz = [[0,0,0,0,0], [0,0,0,0,0], [0,0,0,0,0], [0,0,0,0,0], [0,0,0,0,0]]

sum_diagonalSegun = 0
for l in range(0, 5):
    for c in range(0, 5):
        matriz[l][c] = int(input(' Digite os valores para [{}, {}]:  '.format(l, c)))


print("=-"*60)
print("\n Os numers digitados foram: \n")
for l in range(0, 5):
    for c in range(0, 5):
        print(f'[{matriz[l][c]:^5}]', end='')
    print()


sum_diagonal = sum(matriz[i][i]for i in range(5))

sum_diagonalSegun += matriz[0][4]
sum_diagonalSegun += matriz[1][3]
sum_diagonalSegun += matriz[2][2]
sum_diagonalSegun += matriz[3][1]
sum_diagonalSegun += matriz[4][0]    
print (f'\nA soma da diagonal principal é {sum_diagonal} e a soma da diagonal secundária é {sum_diagonalSegun}\n')

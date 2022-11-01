class Prog67 :
    @staticmethod
    def main( args) :
        vet3 = [0] * (10)
        vet2 = [0] * (10)
        vet = [0] * (10)
        j = 0
        k = 0
        menor = 99999
        maior = 0
        menor2 = 99999
        maior2 = 0
        i = 0
        while (i < 10) :
            print("Digite o valor do vetor 1 da posi????o = " + str(i))
            vet[i] = int(input())
            i += 1
        i = 0
        while (i < 10) :
            if (menor > vet[i]) :
                menor = vet[i]
            if (maior < vet[i]) :
                maior = vet[i]
            i += 1
        j = 0
        while (j < 10) :
            print("Digite o valor do vator 2 da posi????o = " + str(j))
            vet[j] = int(input())
            j += 1
        j = 0
        while (j < 10) :
            if (menor2 > vet[j]) :
                menor2 = vet[j]
            if (maior2 < vet[j]) :
                maior2 = vet[j]
            j += 1
        vet3[10] = maior
        vet3[11] = maior2
        k = 0
        while (k < 10) :
            print("Digite o valor do vator 3 da posi??o = " + str(k))
            vet3[k] = int(input())
            k += 1
        k = 0
        while (k < 12) :
            print(vet3[k])
            k += 1
    

if __name__=="__main__":
    Prog67.main([])
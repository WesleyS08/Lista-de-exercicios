class Prog75 :
    @staticmethod
    def main( args) :
        i = 0
        aux = 0
        i = 0
        vetor = [4, 3, 2, 6, 7, 5, 9, 10, 12, 98, 34, 56, 1]
        print("Vetor ordenado - Metodo da bola (bubble sort)")
        print("Vetor desordenado: ")
        i = 0
        while (i < 13) :
            print(" " + str(vetor[i]))
            i += 1
        print(" ")
        i = 0
        while (i < 13) :
            j = 0
            while (j < 12) :
                if (vetor[j] > vetor[j + 1]) :
                    aux = vetor[j]
                    vetor[j] = vetor[j + 1]
                    vetor[j + 1] = aux
                j += 1
            i += 1
        print("Vetor organizado:")
        i = 0
        while (i < 13) :
            print(" " + str(vetor[i]))
            i += 1
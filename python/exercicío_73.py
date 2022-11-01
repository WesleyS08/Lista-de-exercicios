class Prog73 :
    @staticmethod
    def main( args) :
        soma = 0.0
        mediana = 0.0
        media = 0.0
        moda = 0.0
        soma = 0
        moda = 0
        media = 0
        mediana = 0 
        vetor = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 19]
        vetor.sort()
        i = 1
        while (i < len(vetor)) :
            if (vetor[i] == vetor[i - 1]) :
                print("MODA = " + str(vetor[i]))
            i += 1
        a = 0
        direcao = (len(vetor) - 1)
        meio = 0
        meio = int((a + direcao) / 2)
        mediana = vetor[meio]
        print("MEDIANA = " + str(vetor[meio]))
        i = 0
        while (i < len(vetor)) :
            soma = (vetor[i] + soma)
            i += 1
        media = (soma / 20)
        print("MEDIA = " + str(media))
    

if __name__=="__main__":
    Prog73.main([])
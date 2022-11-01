class Prog74 :
    @staticmethod
    def main( args) :
        vetor = [0] * (30)
        vetor[0] = 0
        vetor[1] = 23
        vetor[2] = 4
        vetor[3] = 65
        vetor[4] = 78
        vetor[5] = 5
        vetor[6] = 6
        vetor[7] = 2
        vetor[8] = 45
        vetor[9] = 68
        vetor[10] = 12
        vetor[11] = 32
        vetor[12] = 43
        vetor[13] = 54
        vetor[14] = 71
        vetor[15] = 15
        vetor[16] = 25
        vetor[17] = 39
        vetor[18] = 22
        vetor[19] = 27
        vetor[20] = 90
        vetor[23] = 6
        vetor[24] = 50
        vetor[25] = 2
        vetor[26] = 45
        vetor[27] = 8
        vetor[28] = 0
        vetor[29] = 9
        _array = ""
        vetor.remove(0)
        vetor.sort()
        lista = list(set(vetor))
        print (lista)
if __name__=="__main__":
    Prog74.main([])
class Prog68 :
    def main( args) :
        vet = [0] * (30)
        menor = 99999
        maior = 0
        menor_dia = 0
        maior_dia = 0
        prim_quinzena = 0
        seg_quinzena = 0
        print("VALOR DE PLUVIOM??TRICO DO M??S DE JUNHO: \n")
        i = 1
        while (i <= 30) :
            print("DIGITE A MEDIDA EM MIL??METROS DO DIA = " + str(i))
            v = int(input())
            vet.append(v)
            i += 1
        n = len(vet)
        i = 1
        while (i <= 30) :
            if (menor > vet[i]) :
                menor = vet[i]
                menor_dia = i
            if (maior < vet[i]) :
                maior = vet[i]
                maior_dia = i
            i += 1
        i = 1
        while (i <= 15) :
            prim_quinzena = prim_quinzena + vet[i]
            i += 1
        i = 16
        while (i <= 30) :
            seg_quinzena = seg_quinzena + vet[i]
            i += 1
        prim_quinzena = prim_quinzena / 15
        seg_quinzena = seg_quinzena / 15
        print("O DIA QUE MENOS CHOVEU FOI DIA: \n" + str(menor_dia))
        print("O DIA QUE MAIS CHOVEU FOI DIA: \n" + str(maior_dia))
        print("A M??DIA DA PLUVIOM??TRICA DA PRIMEIRA QUINZENA FOI: \n" + str(prim_quinzena))
        print("A M??DIA DA PLUVIOM??TRICA DA SEGUNDA QUINZENA FOI:\n" + str(seg_quinzena))
    

if __name__=="__main__":
    Prog68.main([])
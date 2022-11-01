print("\n=====DIAS DE UM MÊS=====")    
mes = int( input('\nDigite o mês: ') )
if( mes==1 or mes==3 or mes==5 or mes==7 or \
        mes==8 or mes==10 or mes==12):
    print("\nPossui 31 dias")
elif mes==2:
    print("\nPossui 28 dias")
elif ( mes==4 or mes==6 or mes==9 or mes==11):
    print("\nPossui 30 dias")
print("\n=====FIM DO PROGRAMA=====")    
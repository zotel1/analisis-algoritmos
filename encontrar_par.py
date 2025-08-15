def encontrar_par(lista):
    # Parte A
    for x in lista:
        print(x) # O(n)

    # Parte B
    for i in range(len(lista)):
        for j in range(len(lista)):
            if i != j and lista[i] == lista[j]:
                print("Se enmcontró un par.") # O(n^2)
                return True
    return False
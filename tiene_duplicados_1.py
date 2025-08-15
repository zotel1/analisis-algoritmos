def tiene_duplicados_1(lista):
    for i in range(len(lista)):
        for j in range(len(lista)):
            if i != j and lista[i] == lista[j]:
                return True
    return False
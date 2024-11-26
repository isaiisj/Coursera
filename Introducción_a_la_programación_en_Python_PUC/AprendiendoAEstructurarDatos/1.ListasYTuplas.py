'''
1.
Tienes una lista de enteros ordenados de menor a mayor, por ejemplo:

lista = [-40, -1, 1, 5, 16, 72, 100]
Deberás definir la función agregar_entero(lista, entero), la cual recibe 
como parámetro una lista en el formato anterior y un entero cualquiera. 
La función deberá agregar el entero en la posición correcta de la lista 
y luego retornar la lista. Por ejemplo, si se llama la función: agregar_entero(L, 13), 
siendo L la lista anterior, entonces deberás retornar la lista:

[-40, -1, 1, 5, 13, 16, 72, 100]
'''

lista = [-40, -1, 1, 5, 16, 72, 100]

def agregar_entero(lista, entero):
    for i in range(len(lista)):
        if entero < lista[i]:
            lista.insert(i,entero)
            break
    return lista
    # Rellenar

print(agregar_entero(lista,13))

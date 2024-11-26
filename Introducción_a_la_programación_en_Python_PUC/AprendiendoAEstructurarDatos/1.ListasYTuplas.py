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

##################################################################

'''
2.
Tienes una lista de enteros repetidos:

lista = [1,4,6,2,4,3,1,1,3,5,6,7,3,4,5,5,5,3,3,2,1,2,1,1,1,2,6,6]

Deberás definir la función max_repetido(lista), la cual recibe como 
parámetro una lista en el formato anterior. La función deberá retornar 
el número de veces que se repite el entero que se repite más veces dentro
de la lista. En el ejemplo anterior, el entero que más se repite es el 1, 
el cual se repite 7 veces, por lo que tu función deberá retornar 7.
'''

lista = [1,4,6,2,4,3,1,1,3,5,6,7,3,4,5,5,5,3,3,2,1,2,1,1,1,2,6,6]

def max_repetido(lista):
    counted = []
    for num in lista:
        if num not in counted:
            frecuency = lista.count(num)
            counted.append(frecuency)
    return max(counted)
    #Rellenar

print(max_repetido(lista))

#!/usr/bin/env python
# coding: utf-8

# # Ejercicio de herramientas de control
# 
# En cada celda se te pide algo diferente, reemplaza las X
# para poder lograr el objetivo.
# 
# Por ejemplo:
# 
# ```python 
# # Escribe un for que imprima del 0 a 10 y use la variable i para el conteo
# for X in range(X):
#     print(X)
#     
# ```
# debe ser:
# 
# 
# ```python 
# # Escribe un for que imprima del 0 a 10 y use la variable i para el conteo
# for i in range(11):
#     print(i)
#     
# ```
# Si hay código extra, no lo borres, solo reemplaza las X por lo que debe
# ser para lograr el objetivo de cada celda.

# In[1]:


# E1: Escribe un for que vaya del 0 al 20 y que imprima solamente 10 y 20
# usando 'if'

lista = []
for i in range(1,21):
    lista.append(i)
    if i == 10:
        print(i)
        a1 = i
    if i == 20:
        print(i)
        a2 = i


# In[ ]:





# In[2]:


# E2: Corrige el while para sume una cantidad 0.5 en a3
# y se detenga cambiando la condicion cuando a3 sea mayor o igual a 3.5
# defina condicion = False

condicion = True
a3 = 0
while condicion:
    a3 = a3 + 0.5
    print(a3)
    if a3 >= 3.5:
        condicion = False
print(condicion)



# In[ ]:





# In[4]:


# E3: Itera la lista de colores dada y haz que imprima
# cuando pasa por el color verde

colores = ["amarillo","negro","blanco","rojo","verde","morado","azul"]
for color in colores:
    if color == "verde":
        a4 = color
        print(color)


# In[ ]:





# In[12]:


# E4: Arregla el condicionante del if para que imprima que 
# la variable numero contiene un entero par.
numero = 5

def par_impar():
    if numero%2 == 0:
        a5 = "par"
    else:
        a5 = "impar"
    print(a5)
    return a5

par_impar()


# In[ ]:





# In[11]:


# E5: Arregla los valores de los números en 
# la función para que si le das
# una calificación (un número entre 0 y 100) imprima lo siguiente:
# 1) "Excelente" si la calificación es 90 o más.
# 2) Devuelva "Aprobado" si la calificación es 60 o más, 
# 3) "Reprobado" si es menor a 60 
# Prueba con la calificacion 60
calif = 60


def califica():
    if calif >= 90:
        texto =  "Excelente"
    elif calif >= 60:
        texto = "Aprobado"
    else:
        texto = "Reprobado"
    return texto

texto = califica()
print(texto)



# In[ ]:





# In[ ]:





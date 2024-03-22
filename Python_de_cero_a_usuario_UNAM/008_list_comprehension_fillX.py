#!/usr/bin/env python
# coding: utf-8

# # Ejercicio de list comprehension
# 
# En cada celda se te pide algo diferente, reemplaza las X
# para poder lograr el objetivo.
# 
# Por ejemplo:
# 
# ```python 
# # Reemplaza las X en el código para usar una list comprehension que vaya del 0 al 10
# 
# b = [X for X in range(XX)]
#     
# ```
# debe ser:
# 
# 
# ```python 
# b = [i for i in range(11)]
#     
# ```
# Si hay código extra, no lo borres, solo reemplaza las XXX
# para lograr el objetivo de cada celda.

# In[5]:


#E1: Rellena lo necesario para que la list comprehension 
# colores = ["blanco","rojo","azul","negro","cafe"]
# contenga solo las palabras que tienen una "a"
# y se escriban en mayúsculas
#  ['BLANCO', 'AZUL', 'CAFE']

colores   = ["blanco","rojo","azul","negro","cafe"]
colores_a = [color.upper() for color in colores if "a" in color]
print(colores_a)


# In[ ]:





# In[8]:


#E2: Crea una rango  de que contenga números del 1 al 9 
# y eleva cada número al cuadrado para obtener
# [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]

cuadrados = [numero**2 for numero in range(10)]
cuadrados


# In[ ]:





# In[11]:


#E3: Crea una lista de tuplas que contenga  (numero, numero al cuadrado) 
#del 1 al 9 con un
# [(0, 0),(1, 1),(2, 4),(3, 9),(4, 16),(5, 25),(6, 36),(7, 49),(8, 64),(9, 81)]
tuplas = [(numero,numero**2) for numero in range(10)]
tuplas


# In[ ]:





# E4: Aplana la matriz para pasar de 
# ```python 
# matriz = [
#     [1, 2, 3],
#     [4, 5, 6],
#     [7, 8, 9]
# ]
#     
# ```
# a
# 
# ```python 
# matriz_aplanada = [1, 2, 3, 4, 5, 6, 7, 8, 9]    
# ```

# In[13]:


matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

matriz_aplanada = [numero for renglon in matriz for numero in renglon]
matriz_aplanada



# In[ ]:





# In[30]:


# E5:  Dada la lista de palabras 
# ["apple", "banana", "cherry", "kiwi"], 
# crea una lista llamada cortas que contenga solo las palabras con 4 caracteres o menos 
# y guardalas en una lista que se llame cortas

frutas = ["apple", "banana", "cherry", "kiwi"]
cortas = [word[0:4] if len(word) > 4 else word for word in frutas ]

cortas


# In[ ]:





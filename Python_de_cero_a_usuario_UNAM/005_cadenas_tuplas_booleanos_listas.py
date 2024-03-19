#!/usr/bin/env python
# coding: utf-8

# # Ejercicios con cadenas, tuplas, booleanos, listas
# Realiza lo que se te pide con las herramientas de Python
# 
# Por ejemplo:
# 
# ```python 
# # Usando Python, reemplaza las XXX para que la cadena cambie toda a letras mayúsculas. Cuida de no cambiar la variable donde se guarda el resultado.
# 
# texto = 'Texto en MInúsculas'
# 
# texto_m = texto.XXX()
# ```
# debes hacer:
# 
# 
# ```python 
# # Usando Python, reemplaza las XXX para que la cadena cambie toda a letras mayúsculas. Cuida de no cambiar la variable donde se guarda el resultado.
# 
# texto = 'Texto en MInúsculas'
# 
# texto_m = texto.lower()
# texto_m
# 'texto en minúsculas'
# ```
# Si hay código extra, no lo borres, solo reemplaza las X por lo que debe
# ser para lograr el objetivo de cada celda.

# In[16]:


#E1: Convierte todo el texto a minúsculas.
e1   = 'Este TeXTo debe ir en minúscULAS'
e1_m =  e1.lower() 




# In[ ]:





# In[17]:


#E2: Crea una lista de la cadena dada, el separador es '_', 
# reemplaza las XXX para lograrlo.
#la lista debe ser 
#['grecia', 'diego', 'celeste', 'kevin', 'gaby', 'guillermo']

e2   = 'grecia_diego_celeste_kevin_gaby_guillermo'
e2_l = e2.split('_')




# In[ ]:





# In[18]:


#E3: Haz que el texto 
# 'bienvenida al curso' sea
# 'Bienvenida Al Curso'
# reemplazando las XXX 
e3 = 'bienvenida al curso'
e3_t = e3.title()



# In[ ]:





# In[19]:


#E4: Convierte la lista en una tupla 
e4   = ['las','listas','son','mutables','y','las','tuplas','inmutables']
e4_t = tuple(e4) 



# In[ ]:





# In[20]:


#E5: Escribe los valores de a y b para que la 
#comparación de a y b sea True
a = 5
b = 8
comp_a_b = a < b



# In[ ]:





# In[21]:


#E6: Convierte tupla1 a lista escribiendo la orden correcta en XXX
tupla = (0,1,2,3,4,5,6,7,8)
lista  = list(tupla)



# In[ ]:





# In[29]:


#E7: Ordena la lista especificando el método 
lista_d = [0,4,5,7,1,3,4] 
lista_ordenada = lista_d.sort()


# In[ ]:





# In[27]:


#E8: De la lista original, reemplaza las XXX para obtener
# la lista siguiente [0, 2, 4, 6, 8, 10]
lista_n = [0,1,2,3,4,5,6,7,8,9,10] 
lista_salteada = lista_n[::2]



# In[ ]:





# In[33]:


#E9: Utilizando .sort() ordena e invierte la lista
# para pasar de 
#  [2,1,0,3,4,7,5,8,9,10] 
# a 
# [10, 9, 8, 7, 5, 4, 3, 2, 1, 0]
# que está ordenada e invertida
# Consejo: Revisa la documentación de sort() y reemplaza 'argumento' por la orden correcta junto con XXX

lista_desordenada = [2,1,0,3,4,7,5,8,9,10] 
lista_invertida_ordenada = lista_desordenada.sort(reverse=True)



# In[ ]:





# In[37]:


# E10: Utilizando .pop(), elimina la cadena contenida en la lista
# parea obtener [0, 1, 2, 3, 4, 6, 7, 8]
numeros_letras = [0,1,2,3,4,'cinco',6,7,8]
numeros_letras.pop(5)



# In[ ]:





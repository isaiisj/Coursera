#!/usr/bin/env python
# coding: utf-8

# # Ejercicios de funciones
# 
# En cada celda se te pide completar una función que realice una
# tarea en específico.
# 
# Por ejemplo:
# 
# ```python 
# # Remplaza las XXX en la función para que imprima "Hola Persona", donde
# # Persona es el nombre y se ingresa como argumento de la función.
# 
# def hola_persona(persona):
#     return print(f"Hola {XXX}")
#     
# ```
# debe ser:
# 
# 
# ```python 
# def hola_persona(persona):
#     return print(f"Hola {persona}")
#     
# ```
# Si hay código extra, no lo borres, solo reemplaza las X 
# para lograr el objetivo de cada celda.

# In[1]:


#E1: Sustituye las XXX para que la función regrese la frase
# "Hola TuNombre"
# donde TuNombre puedes cambiarlo por el nombre que desees.
# Cuida mucho los espacios de la frase
def hola_persona(nombre):
    frase = f"Hola {nombre}"
    return frase

persona = "Isai"
hola_persona(persona)


# In[ ]:





# In[2]:


#E2: Sustituye las XXX para que la función convierta
# un número flotante a entero y arregla el indentado
numero = 3.141596
def convierte_a_decimal(numero):
    return int(numero)

convierte_a_decimal(numero)


# In[ ]:





# In[4]:


#E3: Sustituye las XXX para que la función regrese
# True si el número que le proporcionas primo y
# False si no es primo. Pruebalo con el número 23

def es_primo(n):
    if n <= 1:
        return False
    if n <= 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6
    return True

n = 23
es_primo(n)


# In[ ]:





# In[5]:


#E4: Define una función llamada saludo que reciba 
# un nombre y un título. La función debe devolver un 
# saludo del tipo "Hola, [título] [nombre]". 
# Si no se proporciona un título, debe usar "Sr./Sra." por defecto.
# Tip, usa return para regresar la cadena completa.


def saludo(nombre, titulo="Sr./Sra."):
    return f"Hola, {titulo} {nombre}"

nombre = "isai"
saludo(nombre)


# In[ ]:





# In[2]:


# E5 Define una función llamada repetir_mensaje 
# que reciba un mensaje y un número entero que 
# indique cuántas veces se debe repetir el mensaje. 
# Si no se proporciona el número, debe repetir el mensaje 3 veces por defecto.
# Si tu mensaje es "Hola", debe regresar "HolaHolaHola" por defecto
# Usa return para regresar el mensaje

def repetir_mensaje(mensaje,numero=3):
    if numero == 0:
        return mensaje * 3
    else:
        return mensaje * numero
        
repetir_mensaje("hola")


# In[ ]:





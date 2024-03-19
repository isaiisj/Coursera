#!/usr/bin/env python
# coding: utf-8

# ##### solo lectura
# # Ejercicios para imprimir
# Realiza lo que se te pide usando las herramientas de Python
# 
# Si hay código extra en la celda, no lo borres, solo reemplaza las X por lo que debe
# ser para lograr el objetivo de cada celda.

# In[3]:


#E1: Guarda la variable en una cadena y con 4 decimales sin redondear
# el resultado debe ser '3.1416'
pi = 3.141592653589793
texto_pi = f"{pi:.4f}"
print(texto_pi)


# In[ ]:





# In[7]:


#E2: Guarda la variable en una cadena  con 3 a la izquierda
# el resultado debe ser '00010'
entero = 10
entero_con_ceros = f"{entero:05d}"
print(entero_con_ceros)



# In[ ]:





# In[8]:


#E3: Guarda la variable en una cadena  y en formato exponencial
# el resultado debe ser '1.000000e+04'
numerote = 10_000
numero_form_exp  = f"{numerote:e}"
print(numero_form_exp)


# In[ ]:





# In[14]:


#E4: Guarda la variable en una cadena  y en formato exponencial
# el resultado debe ser '1e+04'
diez_mil = 10_000
diez_mil_exp  = f"{diez_mil:.0e}"
print(diez_mil_exp)


# In[ ]:





# #E5: Rellena las XXX para crear la siguiente tabla
# 
# Tabla del 5 en gatites:
# ```python
# 
# 5 gatites x 2 = 10 gatites
# 5 gatites x 3 = 15 gatites
# 5 gatites x 4 = 20 gatites
# 5 gatites x 5 = 25 gatites
# 5 gatites x 6 = 30 gatites
# 5 gatites x 7 = 35 gatites
# 5 gatites x 8 = 40 gatites
# 5 gatites x 9 = 45 gatites
# 5 gatites x 10 = 50 gatites
# ```

# In[15]:


#E5
numero = 5
tabla = f"Tabla del {numero} en gatites:\n"
for i in range(2, 11):
    tabla += f"{numero} gatites x {i} = {numero * i} gatites\n"

print(tabla)


# In[ ]:





# In[19]:


#E6: Rellena las XXX para alinear
#la tabla con el signo =
numero = 5
tabla_alineada = f"Tabla de {numero} en gatites:\n"
for i in range(2, 11):
    tabla_alineada += f"{numero} gatites x {i:<2} = {numero * i} gatites\n"
    
print(tabla_alineada)


# In[ ]:





# In[18]:


#E7: Rellena las XXX para obtener el siguiente ouput:
#El total de 3 manzanas y 5 plátanos es $13.50.
p1 = "manzanas"
precio_1 = 2.5
cantidad_1 = 3

p2 = "plátanos"
precio_2 = 1.2
cantidad_2 = 5

total = precio_1 * cantidad_1 + precio_2 * cantidad_2
resumen = f"El total de {cantidad_1} {p1} y {cantidad_2} {p2} es ${total:.2f}."

print(resumen)  # Output: El total de 3 manzanas y 5 plátanos es $13.50.



# In[ ]:





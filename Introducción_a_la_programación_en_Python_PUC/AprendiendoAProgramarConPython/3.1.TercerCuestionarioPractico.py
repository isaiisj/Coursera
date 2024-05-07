'''
1. Escribe un programa para ayudar a una empresa que desea asignar sueldos 
para los cargos de sus trabajadores. La lista es la siguiente:

Ejecutivo: 90
Jefe: 100
Externo: 50

La variable cargo contiene el nombre del cargo (por ejemplo, "Externo"). 
Recuerda entregar tu resultado modificando únicamente la variable dinero
'''
def sueldo(cargo):
  dinero = 0
  # aquí debes implementar tu código
  # modificando la variable dinero 
  # (no modifiques nada de las lineas anteriores)
  if cargo == "Ejecutivo":
    dinero = 90
  elif cargo == "Jefe":
    dinero = 100
  else:
    dinero = 50
  return dinero

'''
2. Escribe un código que calcule el cuadrado de un número si este es impar, 
o el cubo de un número si este es par. Por ejemplo, para 4 tu programa 
debe entregar 64, y para 3 debe entregar 9.
'''
def exponenciacion(numero):
  resultado = numero
  # aquí debes implementar tu código
  # modificando la variable resultado
  # (no modifiques nada de las lineas anteriores)
  if numero % 2 == 0:
    resultado = numero * numero * numero
  else:
    resultado = numero * numero
  return resultado

'''
3. Escriba un programa que verifique si un número es primo o no. 
Por ejemplo, para los número 3, 5, y 13, la variable primo debe 
ser True, y para 1, 10, y 33, False.
'''
def es_primo(numero):
  primo = True
  # aquí debes implementar tu código
  # modificando la variable primo 
  # (no modifiques nada de las lineas anteriores)
  for i in range(2,numero-1):
    if numero % i == 0:
      primo = False
  return primo

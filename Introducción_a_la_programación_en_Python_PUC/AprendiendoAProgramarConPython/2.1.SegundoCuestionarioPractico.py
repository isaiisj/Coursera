'''
1. Una conocida medida de la masa en relación a la estatura de las personas es el IMC (Índice de Masa Corporal). 
Para su cálculo se utiliza la masa del individuo y su estatura. La ecuación que las relaciona es:

IMC = masa / (estatura ^ 2)

Donde la masa se expresa en kilogramos, y la estatura en metros.

Para poder resolver este problema y los siguientes, debes escribir 
el código que falta en el espacio que lo señala. Asume que ya existen 
variables con los nombres masa y peso, que ya contienen los valores 
requeridos (no debes pedírselos al usuario), haz los cálculos que necesites, 
y luego deja el resultado en una variable llamada imc.
'''
def imc(masa, estatura):
  imc = 0
  # desde aquí hacia abajo debes modificar el programa
  # modifica la variable imc
  # recuerda que los datos están en las variables masa y estatura
  imc = masa / (estatura**2)
  return imc

'''
2. Para obtener ciertas estadísticas de un recorrido, 
se pide realizar un programa que dada una distancia, entregue
la velocidad en kilómetros por hora y en metros por segundo. 
Para esto, existen dos variables tiempo y distancia que vienen en 
segundos y kilómetros respectivamente. Tu programa debe guardar en la variable 
resultado un string, por ejemplo, para el siguiente caso:

tiempo = 1

distancia = 0.01

La variable resultado debería tener lo siguiente:

"La velocidad es 36.0 km/h o 10.0 m/s"

Para poder resolver este problema , debes escribir el código 
que falta en el espacio que lo señala. Asume que ya existen variables 
con los nombres tiempo y distancia, que ya contienen los valores 
requeridos (no debes pedírselos al usuario), haz los cálculos que necesites,
y luego deja el resultado en una variable llamada resultado.
'''
def velocidad(distancia, tiempo):
  resultado = ""
  # desde aquí hacia abajo debes modificar el programa
  # modifica la variable resultado
  # recuerda que los datos están en las variables distancia y tiempo
  metros_segundo = distancia/tiempo
  km_hora = (distancia/1000)*(3600/tiempo)
  resultado = f"La velocidad es {km_hora}km/h o {metros_segundo}m/s"
  return resultado

'''
3. Considerando que las variables pueden almacenar cualquier tipo de dato,
en este ejercicio se utilizaran variables de tipo booleanas. En computación 
un operador muy conocido es el operador lógico XOR (exclusive OR), el que dadas
dos expresiones a y b booleanas, entrega verdadero únicamente si una de ellas es
verdadera, y falso en cualquier otro caso.

Por ejemplo si se tiene 

resultado = True XOR False

en resultado estará almacenado el valor True, en cambio si se tiene

    resultado = True XOR True    o     resultado = False XOR False

en resultado estará almacenado el valor False.

La tabla de verdad para todos los valores posibles de a y b, es la siguiente:

a          b     aXORb
True     True    False
True     False   True
False    True    True
False    False   False
'''
def xor(a, b):
  xor = False
  # desde aquí hacia abajo debes modificar el programa
  # modifica la variable xor
  # recuerda que los datos están en las variables a y b
  if a != b:
    xor = True
  return xor

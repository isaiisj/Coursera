#1
def imc(masa, estatura):
  imc = 0
  # desde aquí hacia abajo debes modificar el programa
  # modifica la variable imc
  # recuerda que los datos están en las variables masa y estatura
  imc = masa / (estatura**2)
  return imc

#2
def velocidad(distancia, tiempo):
  resultado = ""
  # desde aquí hacia abajo debes modificar el programa
  # modifica la variable resultado
  # recuerda que los datos están en las variables distancia y tiempo
  metros_segundo = distancia/tiempo
  km_hora = (distancia/1000)*(3600/tiempo)
  resultado = f"La velocidad es {km_hora}km/h o {metros_segundo}m/s"
  return resultado

#3
def xor(a, b):
  xor = False
  # desde aquí hacia abajo debes modificar el programa
  # modifica la variable xor
  # recuerda que los datos están en las variables a y b
  if a != b:
    xor = True
  return xor

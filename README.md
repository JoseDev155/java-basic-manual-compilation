# Ejemplo básico de compilación manual en Java
## Ejemplo 1

Compilamos el archivo `Ejemplo.java`:

```bash
javac Ejemplo.java
```

Ejecutamos:

```bash
java Ejemplo
```

Y deberíamos ver el siguiente mensaje en la consola

```bash
$ java Ejemplo
Hola Mundo
```

## Ejemplo 2

Ejemplo parecido al anterior, pero nos pedirá entrada de datos por consola para crear el objeto `Carro`:

```bash
javac Ejemplo2.java
java Ejemplo2
```

Ejemplo de salida:

```bash
$ java Ejemplo2
--------------- ENTRADA DE DATOS ---------------
Ingrese la placa del vehiculo:
2AQ87ER
Ingrese la marca del vehiculo:
Honda
Ingrese el anio del vehiculo:
2005
--------------- SALIDA DE DATOS ----------------
Matricula: 2AQ87ER
Marca: Honda
Anio: 2005
```

## Ejemplo 3
### Accediendo a objetos a través de interfaces

Compilamos el archivo `Practica.java` en el directorio `PracticaJava/`:

```bash
javac .\PracticaJava\Practica.java
```

#### Forma 1

Para hacerlo de forma limpia:

```bash
cd .\PracticaJava
javac Practica.java
java Practica
```

### Forma 2

Para ejecutar el código sin cambiar de directorio, debemos hacer lo siguiente:

```bash
java -cp .\PracticaJava Practica
```

* `-cp`: Indicamos el *classpath*

Salida:

```bash
$ javac .\PracticaJava\Practica.java
Nombre: Pepe
```

>Si no indicamos el *classpath*, Java intenta interpretar eso como nombre de clase:

```
.\PracticaJava\Practica.java
```

Eso es inválido.

Entonces el runtime empieza a buscar clases dentro del directorio y termina intentando ejecutar otra clase encontrada primero (en este caso
`Persona.class`), y como no tiene `main`, lanza:

```
error: can't find main(String[]) method in class: Persona
```
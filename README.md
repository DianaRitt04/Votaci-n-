# Sistema de Conteo de Votos

Este repositorio contiene un programa en Java diseñado para calcular el porcentaje de votos obtenidos por distintos candidatos en una urna.

## Descripción del Código

El programa permite el ingreso de números de candidatos de forma sucesiva. El proceso de captura de datos continúa hasta que el usuario ingresa el número **0**, lo cual indica el cierre de la urna. 

Al finalizar, el sistema procesa la información y despliega:
1. El total de votos registrados.
2. El desglose de votos por cada candidato.
3. El porcentaje que representa cada candidato respecto al total.

### Estructura de archivos
- **Urna.java**: Contiene la lógica para el almacenamiento de los votos utilizando un `HashMap` y los métodos para el cálculo de porcentajes.
- **Main.java**: Contiene el método principal que gestiona la entrada de datos por teclado y la interacción con el usuario.

## Funcionamiento
- Se utiliza la interfaz `Map` para asociar el número de cada candidato con su cantidad de votos acumulados.
- Se implementan ciclos de control y validaciones para asegurar que solo los votos válidos (mayores a cero) sean contabilizados.

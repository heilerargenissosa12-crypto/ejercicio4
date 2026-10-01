# Ejercicio 5: Cars, Assemble!

- **Concepto:** Numbers / Arithmetic (Tipos numéricos, operadores y casting)
- **Plataforma:** Exercism (Java Track)

## Descripción del Problema
Calcular la producción de una fábrica de automóviles que tiene 10 velocidades de ensamblaje (0 a 10).
A velocidad 1, la línea produce 221 coches por hora. A mayor velocidad, más coches se producen pero la tasa de defectos aumenta:
- **0:** 0% de éxito
- **1 a 4:** 100% de éxito
- **5 a 8:** 90% de éxito
- **9:** 80% de éxito
- **10:** 77% de éxito

## Tareas a Implementar en `CarsAssemble.java`:
1. `productionRatePerHour(int speed)`: Retorna la producción por hora en formato decimal `double`.
2. `workingItemsPerMinute(int speed)`: Retorna la producción por minuto convertida a entero `int` descartando decimales.

## Cómo ejecutar en Visual Studio / VS Code:
Abre `Main.java` y haz clic en **Run** o presiona `F5`.

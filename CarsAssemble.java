package carsassemble;

/**
 * Ejercicio 5: Cars, Assemble!
 * Concepto: Numbers / Arithmetic (Operaciones con enteros y números de punto flotante)
 *
 * En una línea de ensamblaje de autos, la velocidad va de 0 a 10.
 * A velocidad 1, se producen 221 autos por hora a tasa de éxito del 100%.
 * A mayor velocidad, la tasa de éxito disminuye debido a errores en la línea.
 */
public class CarsAssemble {

    private static final int BASE_RATE_PER_HOUR = 221;

    /**
     * Calcula la tasa de éxito (porcentaje de autos sin defectos producidos)
     * según la velocidad configurada.
     */
    private double successRate(int speed) {
        if (speed <= 0) {
            return 0.0;
        } else if (speed <= 4) {
            return 1.0;
        } else if (speed <= 8) {
            return 0.90;
        } else if (speed == 9) {
            return 0.80;
        } else {
            // speed == 10
            return 0.77;
        }
    }

    /**
     * Calcula cuántos autos utilizables se producen por hora a una velocidad dada.
     */
    public double productionRatePerHour(int speed) {
        return speed * BASE_RATE_PER_HOUR * successRate(speed);
    }

    /**
     * Calcula cuántos autos utilizables se producen por minuto (redondeado a entero hacia abajo).
     */
    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60.0);
    }
}

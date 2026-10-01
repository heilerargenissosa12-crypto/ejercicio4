package carsassemble;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  Ejercicio 5: Cars, Assemble! (Numbers / Arithmetic)");
        System.out.println("==================================================");

        CarsAssemble factory = new CarsAssemble();

        // 1. Tasa a velocidad 6 (éxito 90%: 6 * 221 * 0.9 = 1193.4)
        double rateSpeed6 = factory.productionRatePerHour(6);
        System.out.println("1. Produccion por hora a velocidad 6: " + rateSpeed6 + " autos (Esperado: 1193.4)");

        // 2. Autos por minuto a velocidad 6: (int)(1193.4 / 60) = 19
        int minSpeed6 = factory.workingItemsPerMinute(6);
        System.out.println("2. Autos por minuto a velocidad 6: " + minSpeed6 + " autos (Esperado: 19)");

        // 3. Tasa a velocidad 9 (éxito 80%: 9 * 221 * 0.8 = 1591.2)
        double rateSpeed9 = factory.productionRatePerHour(9);
        System.out.println("3. Produccion por hora a velocidad 9: " + rateSpeed9 + " autos (Esperado: 1591.2)");

        // 4. Autos por minuto a velocidad 9: (int)(1591.2 / 60) = 26
        int minSpeed9 = factory.workingItemsPerMinute(9);
        System.out.println("4. Autos por minuto a velocidad 9: " + minSpeed9 + " autos (Esperado: 26)");

        boolean ok = Math.abs(rateSpeed6 - 1193.4) < 0.001 && minSpeed6 == 19 &&
                     Math.abs(rateSpeed9 - 1591.2) < 0.001 && minSpeed9 == 26;

        System.out.println("\n[RESULTADO]: " + (ok ? "TODAS LAS PRUEBAS PASARON EXITOSAMENTE" : "ERROR EN LAS PRUEBAS"));
        System.out.println("==================================================\n");
    }
}

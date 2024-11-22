public class Main {
    public static void main(String[] args) {
        // Ejemplo de conversión implícita
        int saldoInicial = 1000; // Saldo inicial en enteros
        double tasaInteres = 0.05; // Tasa de interes en porcentaje

        // Conversión implicita: el saldo inicial (int) se convierte automaticamente a double
        double saldoConInteres = saldoInicial * (1 + tasaInteres);
        System.out.println("Saldo con interes: " + saldoConInteres);

        // Ejemplo de conversion explicita (truncamiento)
        int saldoTruncado = (int) saldoConInteres; // Conversion explicita
        System.out.println("Saldo truncado para el reporte: " + saldoTruncado);

        Integer transaccionesTotales = 5;
        int transaccionesRealizadas = transaccionesTotales;
        System.out.println("Transacciones realizadas: " + transaccionesRealizadas);

        // Calculo total de intereses para varias cuentas
        short numeroCuentas = 3; // Ejemplo con tipo mas pequeño
        double interesesTotales = numeroCuentas * saldoConInteres; // Conversión implicita
        System.out.println("Intereses totales calculados: " + interesesTotales);
    }
}

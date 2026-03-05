
import java.util.Scanner;

public class ComplejoHabitacional {
    public static void main(String[] args) {
        // Datos del complejo
        int torres = 7;
        int pisosPorTorre = 20;
        int apartamentosPorPiso = 6;

        // Cálculos
        int totalApartamentos = torres * pisosPorTorre * apartamentosPorPiso;
        double promedioPorPiso = (double) totalApartamentos / (torres * pisosPorTorre);
        double promedioPorTorre = (double) totalApartamentos / torres;

        // Mostrar resultados
        System.out.println("=== Complejo Habitacional ===");
        System.out.println("Cantidad total de apartamentos: " + totalApartamentos);
        System.out.println("Promedio de apartamentos por piso: " + promedioPorPiso);
        System.out.println("Promedio de apartamentos por torre: " + promedioPorTorre);

        // Apartamentos disponibles para alquiler
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de apartamentos disponibles para alquiler: ");
        int disponibles = sc.nextInt();

        if (disponibles <= totalApartamentos) {
            System.out.println("Apartamentos disponibles para alquiler: " + disponibles);
        } else {
            System.out.println("Error: la cantidad ingresada excede el total de apartamentos.");
        }

        sc.close();
    }
}

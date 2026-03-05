import java.util.Scanner;

public class ComplejoHabitacional {
    public static void main(String[] args) {
        int torres = 7;
        int pisos = 20;
        int apartamentosPorPiso = 6;

        boolean[][][] complejo = new boolean[torres][pisos][apartamentosPorPiso];

        System.out.println("");
        System.out.println("---- Emerson Herrera Herrera De la cruz #11 ----");
         System.out.println("---------       Curso 5toE       -------");

        for (int t = 0; t < torres; t++) {
            for (int p = 0; p < pisos; p++) {
                for (int a = 0; a < apartamentosPorPiso; a++) {
                    complejo[t][p][a] = true;
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú del Complejo Habitacional ===");
            System.out.println("1. Mostrar cantidad total de apartamentos");
            System.out.println("2. Mostrar promedio de apartamentos por piso");
            System.out.println("3. Mostrar promedio de apartamentos por torre");
            System.out.println("4. Mostrar cantidad de apartamentos disponibles");
            System.out.println("5. Alquilar un apartamento");
            System.out.println("6. Liberar un apartamento (volver a disponible)");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    int total = torres * pisos * apartamentosPorPiso;
                    System.out.println("Total de apartamentos: " + total);
                    break;
                case 2:
                    System.out.println("Promedio por piso: " + apartamentosPorPiso);
                    break;
                case 3:
                    System.out.println("Promedio por torre: " + (pisos * apartamentosPorPiso));
                    break;
                case 4:
                    int disponibles = contarDisponibles(complejo);
                    System.out.println("Apartamentos disponibles: " + disponibles);
                    break;
                case 5:
                    System.out.print("Ingrese torre (0-6): ");
                    int torre = sc.nextInt();
                    System.out.print("Ingrese piso (0-19): ");
                    int piso = sc.nextInt();
                    System.out.print("Ingrese apartamento (0-5): ");
                    int apto = sc.nextInt();
                    if (complejo[torre][piso][apto]) {
                        complejo[torre][piso][apto] = false;
                        System.out.println("Apartamento alquilado exitosamente.");
                    } else {
                        System.out.println("Ese apartamento ya está ocupado.");
                    }
                    break;
                case 6:
                    System.out.print("Ingrese torre (0-6): ");
                    torre = sc.nextInt();
                    System.out.print("Ingrese piso (0-19): ");
                    piso = sc.nextInt();
                    System.out.print("Ingrese apartamento (0-5): ");
                    apto = sc.nextInt();
                    if (!complejo[torre][piso][apto]) {
                        complejo[torre][piso][apto] = true;
                        System.out.println("Apartamento liberado, ahora está disponible.");
                    } else {
                        System.out.println("Ese apartamento ya estaba disponible.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }

    public static int contarDisponibles(boolean[][][] complejo) {
        int disponibles = 0;
        for (int t = 0; t < complejo.length; t++) {
            for (int p = 0; p < complejo[t].length; p++) {
                for (int a = 0; a < complejo[t][p].length; a++) {
                    if (complejo[t][p][a]) disponibles++;
                }
            }
        }
        return disponibles;
    }
}


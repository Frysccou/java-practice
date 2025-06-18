import java.util.Scanner;

public class GestorDeTareasV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int totalPrioridad = 0;

        do {
            mostrarMenu();
            opcion = leerOpcion(sc);
            totalPrioridad = ejecutarOpcion(opcion, sc, totalPrioridad);
        } while (opcion != 3);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("========================== Gestor de Tareas ==========================");
        System.out.println("1. Añadir tarea");
        System.out.println("2. Listar todas las tareas (sigue en desarrollo)");
        System.out.println("3. Salir");
    }

    public static int leerOpcion(Scanner sc) {
        System.out.println("Seleccione una opcion: ");
        return sc.nextInt();
    }

    public static int ejecutarOpcion(int opcion, Scanner sc, int totalPrioridad) {
        sc.nextLine();

        switch (opcion) {
            case 1:
                totalPrioridad = agregarTarea(sc, totalPrioridad);
                break;
            case 2:
                System.out.println("Funcionalidad en desarrollo.");
                break;
            case 3:
                System.out.println("Saliendo del gestor de tareas.");
                break;
            default:
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
        }
        return totalPrioridad;
    }

    public static int agregarTarea(Scanner sc, int totalPrioridad) {
        System.out.print("Nombre de la tarea: ");
        String nombre = sc.nextLine();

        System.out.print("Prioridad de la tarea (1 al 5): ");
        int prioridad = sc.nextInt();
        sc.nextLine();

        if (prioridad >=1 && prioridad <=5) {
            totalPrioridad += prioridad;
            System.out.println("Tarea '" + nombre + "' añadida con prioridad " + prioridad + ".");
            System.out.println("Prioridad total acumulada " + totalPrioridad + ".");
        } else {
            System.out.println("Prioridad no válida. Debe ser un número entre 1 y 5.");
        }
        return totalPrioridad;
    }
}
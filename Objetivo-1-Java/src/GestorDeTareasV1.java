import java.util.Scanner;

public class GestorDeTareasV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int totalPrioridad = 0;

        do {
            System.out.println("=== Gestor De Tareas ===");
            System.out.println("1 Agregar Tarea");
            System.out.println("2. Ver tareas (pendiente)");
            System.out.println("3. Salir");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Se limpia el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la tarea: ");
                    String nombre = sc.nextLine();

                    System.out.print("Prioridad de la tarea (1-10): ");
                    int prioridad = sc.nextInt();
                    sc.nextLine();

                    if (prioridad >= 1 && prioridad <= 10) {
                        totalPrioridad += prioridad; // Se acumula la prioridad
                        System.out.println("Tarea '" + nombre + "' agregada con prioridad " + prioridad);
                        System.out.println("Total acumulado de prioridades: " + totalPrioridad);
                    } else {
                        System.out.println("Prioridad no válida. Debe ser un número entre 1 y 10.");
                    }
                    break;
                case 2:
                    System.out.println("Funcionalidad pendiente: Ver tareas");
                    break;
                case 3:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion invalida, por favor elige una opcion que sea valida.");
            }
        } while (opcion != 3);

        sc.close();
    }
}
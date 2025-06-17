import java.util.Scanner;

public class GestorDeTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPrioridad = 0;

        System.out.println("=== Gestor de Tareas===");
        System.out.println("1. Agregar Tarea");
        System.out.println("2. Ver tareas (pendiente)");
        System.out.println("3. Salir");

        System.out.println("Selecciona una opcion");

        int opcion = sc.nextInt();
        sc.nextLine();

        // Validar que este entre 1 y 3
        if (opcion >= 1 && opcion <= 3) {
            if (opcion == 1) {
                System.out.print("Nombre de la tarea: ");
                String nombreTarea = sc.nextLine();

                System.out.print("Prioridad (1 a 5): ");
                int prioridad = sc.nextInt();

                // Validacion basica con operador logico
                boolean esValida = prioridad >=1 && prioridad<= 5;
                System.out.println("¿Prioridad valida? " + esValida );

                // Operacion aritmetica: suma de priioridades
                totalPrioridad += prioridad;

                System.out.println("Tarea agregada: " + nombreTarea + "(prioridad " + prioridad);
                System.out.println("Suma total de prioridades: " + totalPrioridad);
            } else if (opcion == 2) {
                System.out.println("Funcion de 'ver tareas' aun no implementada.");
            } else {
                System.out.println("Hasta luego!");
            }
        } else {
            System.out.println("Opcion Invalida");
        }

        sc.close();
    }
}
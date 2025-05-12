import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Escuela escuela = new Escuela();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    System.out.print("Número de identificación: ");
                    int id = sc.nextInt();
                    System.out.print("Calificación (0 a 10): ");
                    double calif = sc.nextDouble();

                    if (escuela.existeIdentificacion(id)) {
                        System.out.println("Ya existe un estudiante con ese número de identificación.");
                    } else if (calif < 0 || calif > 10) {
                        System.out.println("La calificación debe estar entre 0 y 10.");
                    } else {
                        escuela.agregarEstudiante(new Estudiante(nombre, id, calif));
                        System.out.println("Estudiante agregado.");
                    }
                    break;
                case 2:
                    System.out.print("Número de identificación a buscar: ");
                    int buscarId = sc.nextInt();
                    Estudiante est = escuela.buscarEstudiante(buscarId);
                    if (est != null) {
                        System.out.println("Nombre: " + est.getNombre());
                        System.out.println("Calificación: " + est.getCalificacion());
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        sc.close();
    }
}

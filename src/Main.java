import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ControlAcceso control = new ControlAcceso();
        int opcion;

        do {
            System.out.println("\n--- CONTROL DE ACCESO ---");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Buscar matrícula");
            System.out.println("3. Eliminar registro");
            System.out.println("4. Mostrar estudiantes");
            System.out.println("5. Total de estudiantes");
            System.out.println("6. Limpiar registros");
            System.out.println("7. Salir");
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Introduce un número válido.");
                opcion = 0;
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine().trim();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine().trim();

                    if (matricula.isEmpty() || nombre.isEmpty()) {
                        System.out.println("Los campos son obligatorios.");
                        break;
                    }

                    control.registrar(new Estudiante(matricula, nombre));
                    break;

                case 2:
                    System.out.print("Matrícula a buscar: ");
                    control.buscar(sc.nextLine().trim());
                    break;
                case 3:
                    System.out.print("Matrícula a eliminar: ");
                    control.eliminar(sc.nextLine().trim());
                    break;
                case 4:
                    control.mostrar();
                    break;

                case 5:
                    control.total();
                    break;

                case 6:
                    control.limpiar();
                    break;

                case 7:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 7);
        sc.close();
    }
}

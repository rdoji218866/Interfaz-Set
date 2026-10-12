import java.util.Set;
import java.util.HashSet;

public class ControlAcceso {

    private Set<Estudiante> estudiantes;

    public ControlAcceso() {
        estudiantes = new HashSet<>();
    }

    public void registrar(Estudiante estudiante) {
        if (estudiantes.add(estudiante)) {
            System.out.println("Registro exitoso.");
        } else {
            System.out.println("La matrícula ya está registrada.");
        }
    }

    public void buscar(String matricula) {
        Estudiante buscado = new Estudiante(matricula, "");

        if (estudiantes.contains(buscado)) {
            System.out.println("El estudiante está registrado.");
        } else {
            System.out.println("No existe ese registro.");
        }
    }

    public void eliminar(String matricula) {
        Estudiante buscado = new Estudiante(matricula, "");

        if (estudiantes.remove(buscado)) {
            System.out.println("Registro eliminado.");
        } else {
            System.out.println("Matrícula no encontrada.");
        }
    }

    public void mostrar() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }

    public void total() {
        System.out.println("Total: " + estudiantes.size());
    }

    public void limpiar() {
        estudiantes.clear();
        System.out.println("Todos los registros fueron eliminados.");
    }
}

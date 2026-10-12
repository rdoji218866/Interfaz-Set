import java.util.Objects;

public class Estudiante {
    private String matricula;
    private String nombre;

    public Estudiante(String matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Estudiante)) return false;

        Estudiante otro = (Estudiante) obj;
        return matricula.equals(otro.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return matricula + " - " + nombre;
    }
}

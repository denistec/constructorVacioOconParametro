import java.util.HashSet;
import java.util.Set;

public class Escuela {
    private Set<Estudiante> estudiantes;

    public Escuela() {
        estudiantes = new HashSet<>();
    }

    public boolean agregarEstudiante(Estudiante estudiante) {
        return estudiantes.add(estudiante);
    }

    public Estudiante buscarEstudiante(int numeroIdentificacion) {
        for (Estudiante est : estudiantes) {
            if (est.getNumeroIdentificacion() == numeroIdentificacion) {
                return est;
            }
        }
        return null;
    }

    public boolean existeIdentificacion(int numeroIdentificacion) {
        for (Estudiante est : estudiantes) {
            if (est.getNumeroIdentificacion() == numeroIdentificacion) {
                return true;
            }
        }
        return false;
    }
}

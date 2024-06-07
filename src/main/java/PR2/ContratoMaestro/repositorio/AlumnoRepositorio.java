package PR2.ContratoMaestro.repositorio;

import PR2.ContratoMaestro.modelo.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepositorio extends JpaRepository<Alumno, Integer> {
}

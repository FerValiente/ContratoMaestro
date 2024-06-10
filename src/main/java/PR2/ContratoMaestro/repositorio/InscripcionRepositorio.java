package PR2.ContratoMaestro.repositorio;

import PR2.ContratoMaestro.modelo.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscripcionRepositorio extends JpaRepository<Inscripcion, Long> {
}


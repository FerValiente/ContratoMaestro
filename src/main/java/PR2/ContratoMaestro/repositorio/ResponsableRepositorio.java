package PR2.ContratoMaestro.repositorio;

import PR2.ContratoMaestro.modelo.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsableRepositorio extends JpaRepository<Responsable, Long> {
}

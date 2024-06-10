package PR2.ContratoMaestro.repositorio;

import PR2.ContratoMaestro.modelo.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepositorio extends JpaRepository<Matricula, Long> {
}

package PR2.ContratoMaestro.servicio;

import PR2.ContratoMaestro.modelo.Matricula;
import PR2.ContratoMaestro.repositorio.MatriculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaServicio {

    @Autowired
    private MatriculaRepositorio matriculaRepositorio;

    public Matricula crearMatricula(Matricula matricula) {
        return matriculaRepositorio.save(matricula);
    }

    public Optional<Matricula> obtenerMatriculaPorId(Long id) {
        return matriculaRepositorio.findById(id);
    }

    public List<Matricula> obtenerTodasLasMatriculas() {
        return matriculaRepositorio.findAll();
    }

    public Matricula actualizarMatricula(Matricula matricula) {
        return matriculaRepositorio.save(matricula);
    }

    public void eliminarMatricula(Long id) {
        matriculaRepositorio.deleteById(id);
    }
}

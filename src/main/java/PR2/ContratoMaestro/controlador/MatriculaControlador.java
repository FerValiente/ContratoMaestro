package PR2.ContratoMaestro.controlador;

import PR2.ContratoMaestro.modelo.Matricula;
import PR2.ContratoMaestro.servicio.MatriculaServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cepb-app")
@CrossOrigin(value = "http://localhost:3000")
public class MatriculaControlador {
    private static final Logger logger = LoggerFactory.getLogger(MatriculaControlador.class);

    @Autowired
    private MatriculaServicio matriculaServicio;

    @GetMapping("/matriculas")
    public List<Matricula> obtenerMatriculas() {
        var matriculas = matriculaServicio.obtenerTodasLasMatriculas();
        matriculas.forEach(matricula -> logger.info(matricula.toString()));
        return matriculas;
    }

    @PostMapping("/matriculas")
    public Matricula agregarMatricula(@RequestBody Matricula matricula) {
        logger.info("Matricula a agregar: {}", matricula);
        return matriculaServicio.crearMatricula(matricula);
    }

    @GetMapping("/matriculas/{id}")
    public Matricula obtenerMatriculaPorId(@PathVariable Long id) {
        logger.info("Obteniendo matricula con ID: {}", id);
        return matriculaServicio.obtenerMatriculaPorId(id).orElse(null);
    }

    @PutMapping("/matriculas/{id}")
    public Matricula actualizarMatricula(@PathVariable Long id, @RequestBody Matricula matricula) {
        logger.info("Actualizando matricula con ID: {}", id);
        matricula.setId(id);
        return matriculaServicio.actualizarMatricula(matricula);
    }

    @DeleteMapping("/matriculas/{id}")
    public void eliminarMatricula(@PathVariable Long id) {
        logger.info("Eliminando matricula con ID: {}", id);
        matriculaServicio.eliminarMatricula(id);
    }
}


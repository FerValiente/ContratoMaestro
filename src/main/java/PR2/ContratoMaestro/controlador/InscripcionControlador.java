package PR2.ContratoMaestro.controlador;

import PR2.ContratoMaestro.modelo.Inscripcion;
import PR2.ContratoMaestro.servicio.InscripcionServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cepb-app")
@CrossOrigin(value = "http://localhost:3000")
public class InscripcionControlador {
    private static final Logger logger = LoggerFactory.getLogger(InscripcionControlador.class);

    @Autowired
    private InscripcionServicio inscripcionServicio;

    @GetMapping("/inscripciones")
    public List<Inscripcion> obtenerInscripciones() {
        var inscripciones = inscripcionServicio.obtenerTodasLasInscripciones();
        inscripciones.forEach(inscripcion -> logger.info(inscripcion.toString()));
        return inscripciones;
    }

    @PostMapping("/inscripciones")
    public Inscripcion agregarInscripcion(@RequestBody Inscripcion inscripcion) {
        logger.info("Inscripcion a agregar: {}", inscripcion);
        return inscripcionServicio.crearInscripcion(inscripcion);
    }

    @GetMapping("/inscripciones/{id}")
    public Inscripcion obtenerInscripcionPorId(@PathVariable Long id) {
        logger.info("Obteniendo inscripcion con ID: {}", id);
        return inscripcionServicio.obtenerInscripcionPorId(id).orElse(null);
    }

    @PutMapping("/inscripciones/{id}")
    public Inscripcion actualizarInscripcion(@PathVariable Long id, @RequestBody Inscripcion inscripcion) {
        logger.info("Actualizando inscripcion con ID: {}", id);
        inscripcion.setId(id);
        return inscripcionServicio.actualizarInscripcion(inscripcion);
    }

    @DeleteMapping("/inscripciones/{id}")
    public void eliminarInscripcion(@PathVariable Long id) {
        logger.info("Eliminando inscripcion con ID: {}", id);
        inscripcionServicio.eliminarInscripcion(id);
    }

    @PostMapping("/inscripciones/{id}/pay")
    public void marcarPagada(@PathVariable Long id) {
        logger.info("Marcando como pagada la inscripcion con ID: {}", id);
        inscripcionServicio.marcarPagada(id);
    }

    @PostMapping("/inscripciones/{id}/sign")
    public void marcarInscrita(@PathVariable Long id) {
        logger.info("Marcando como inscrita la inscripcion con ID: {}", id);
        inscripcionServicio.marcarInscrita(id);
    }
}

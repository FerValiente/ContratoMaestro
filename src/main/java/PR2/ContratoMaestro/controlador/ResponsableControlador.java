package PR2.ContratoMaestro.controlador;

import PR2.ContratoMaestro.modelo.Responsable;
import PR2.ContratoMaestro.servicio.ResponsableServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cepb-app")
@CrossOrigin(value = "http://localhost:3000")
public class ResponsableControlador {
    private static final Logger logger = LoggerFactory.getLogger(ResponsableControlador.class);

    @Autowired
    private ResponsableServicio responsableServicio;

    @GetMapping("/responsables")
    public List<Responsable> obtenerResponsables() {
        var responsables = responsableServicio.obtenerTodosLosResponsables();
        responsables.forEach(responsable -> logger.info(responsable.toString()));
        return responsables;
    }

    @PostMapping("/responsables")
    public Responsable agregarResponsable(@RequestBody Responsable responsable) {
        logger.info("Responsable a agregar: {}");
        return responsableServicio.actualizarResponsable(responsable);
    }

    @GetMapping("/responsables/{id}")
    public Responsable obtenerResponsablePorId(@PathVariable Long id) {
        logger.info("Obteniendo responsable con ID: {}", id);
        return responsableServicio.obtenerResponsablePorId(id).orElse(null);
    }

    @PutMapping("/responsables/{id}")
    public Responsable actualizarResponsable(@PathVariable Long id, @RequestBody Responsable responsable) {
        logger.info("Actualizando encargado con ID: {}", id);
        responsable.setId(id);
        return responsableServicio.actualizarResponsable(responsable);
    }

    @DeleteMapping("/responsables/{id}")
    public void eliminarResponsable(@PathVariable Long id) {
        logger.info("Eliminando responsable con ID: {}", id);
        responsableServicio.eliminarResponsable(id);
    }
}


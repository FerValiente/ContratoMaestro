package PR2.ContratoMaestro.controlador;

import PR2.ContratoMaestro.modelo.Aranceles;
import PR2.ContratoMaestro.servicio.ArancelesServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cepb-app")
@CrossOrigin(value = "http://localhost:3000")
public class ArancelesControlador {
    private static final Logger logger = LoggerFactory.getLogger(ArancelesControlador.class);

    @Autowired
    private ArancelesServicio arancelesServicio;

    @GetMapping("/aranceles")
    public List<Aranceles> obtenerAranceles() {
        var aranceles = arancelesServicio.obtenerTodosLosAranceles();
        aranceles.forEach(arancel -> logger.info(arancel.toString()));
        return aranceles;
    }

    @PostMapping("/aranceles")
    public Aranceles agregarArancel(@RequestBody Aranceles aranceles) {
        logger.info("Arancel a agregar: {}", aranceles);
        return arancelesServicio.crearArancel(aranceles);
    }

    @GetMapping("/aranceles/{id}")
    public Aranceles obtenerArancelPorId(@PathVariable Long id) {
        logger.info("Obteniendo arancel con ID: {}", id);
        return arancelesServicio.obtenerArancelPorId(id).orElse(null);
    }

    @PutMapping("/aranceles/{id}")
    public Aranceles actualizarArancel(@PathVariable Long id, @RequestBody Aranceles aranceles) {
        logger.info("Actualizando arancel con ID: {}", id);
        aranceles.setId(id);
        return arancelesServicio.actualizarArancel(aranceles);
    }

    @DeleteMapping("/aranceles/{id}")
    public void eliminarArancel(@PathVariable Long id) {
        logger.info("Eliminando arancel con ID: {}", id);
        arancelesServicio.eliminarArancel(id);
    }
}
